/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Mesa;
import model.MesaDao;

/**
 *
 * @author l03e06
 */
public class MesaController {
     
    public List<Mesa> listaMesas(){
        MesaDao dao = new MesaDao();
        try {
            return dao.findMesa();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar mesa.\n"+e.getLocalizedMessage() );
        }
        return null;
    }
     public List<Mesa> listaMesasAtiva(){
        MesaDao dao = new MesaDao();
        try {
            return dao.findMesaAtiva();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar mesa.\n"+e.getLocalizedMessage() );
        }
        return null;
    }
     
     public List<Mesa> listaMesasEncerrar(){
        MesaDao dao = new MesaDao();
        try {
            return dao.findMesaEncerrar();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar mesa.\n"+e.getLocalizedMessage() );
        }
        return null;
    }
    
  

    public void alterar(int idmesa, String descricao, int status) throws SQLException{
      if((descricao.equalsIgnoreCase("") || status == 2)){
            throw new SQLException("Descricao ou Status Invalido");
        }
      else{
        Mesa mesa = new Mesa();
        mesa.setIdMesa(idmesa);
        mesa.setDescricao(descricao);
        mesa.setStatus(status);
        new MesaDao().alterar(mesa);
      }
    }
    
    public void desativarMesa (int idmesa) throws SQLException{
        Mesa mesa = new Mesa();
        mesa.setIdMesa(idmesa);
        new MesaDao().desativarMesa(mesa);
      }
    
    public int salvar(String descricao, int status) throws Exception{
        if(descricao.equalsIgnoreCase("") || status == 2){
            throw new Exception("Descricao ou Status Invalido");
        }
        else{
            Mesa mesa = new Mesa();
            mesa.setDescricao(descricao);
            mesa.setStatus(status);
            new MesaDao().salvar(mesa);
            return 1;
        }
       
    }
    public void excluir(int idmesa) throws SQLException{
        new MesaDao().excluir(idmesa);
    }
    
    public List<Mesa> buscaMesaPorDescricao(String descricao) throws SQLException{
        MesaDao dao = new MesaDao();
        return dao.findByDescricao(descricao);
    }

    public Mesa findMesaPorId(int id_mesa) throws SQLException{
        MesaDao dao = new MesaDao();
        return dao.findMesaPorId(id_mesa);
    }
   
    
}
