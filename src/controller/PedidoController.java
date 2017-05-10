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
import model.Pedido;
import model.PedidoDao;

/**
 *
 * @author l03e06
 */
public class PedidoController {
     
    public List<Pedido> listaPedidos(){
        PedidoDao dao = new PedidoDao();
        try {
            return dao.findPedido();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar pedido.\n"+e.getLocalizedMessage() );
        }
        return null;
    }
    /* public List<Mesa> listaMesasAtiva(){
        MesaDao dao = new MesaDao();
        try {
            return dao.findMesaAtiva();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar mesa.\n"+e.getLocalizedMessage() );
        }
        return null;
    }*/
     
    /* public List<Mesa> listaMesasEncerrar(){
        MesaDao dao = new MesaDao();
        try {
            return dao.findMesaEncerrar();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar mesa.\n"+e.getLocalizedMessage() );
        }
        return null;
    }
    */
  

    public void alterar(int idpedido, int status, double valortotal) throws SQLException{
     
        Pedido pedido = new Pedido();
        pedido.setIdpedido(idpedido);
    //    pedido.setData(data);
        pedido.setStatus(status);
        pedido.setValortotal(valortotal);
        new PedidoDao().alterar(pedido);
    }
    
 /*   public void desativarMesa (int idmesa) throws SQLException{
        Mesa mesa = new Mesa();
        mesa.setIdMesa(idmesa);
        new MesaDao().desativarMesa(mesa);
      }*/
    
    public void salvar() throws Exception{
     
            new PedidoDao().salvar();
       
    }
    public void excluir(int idpedido) throws SQLException{
        new PedidoDao().excluir(idpedido
        );
    }
    
 /*   public List<Mesa> buscaMesaPorDescricao(String descricao) throws SQLException{
        MesaDao dao = new MesaDao();
        return dao.findByDescricao(descricao);
    }*/

  /*  public Mesa findMesaPorId(int id_mesa) throws SQLException{
        MesaDao dao = new MesaDao();
        return dao.findMesaPorId(id_mesa);
    }*/
   
    
}
