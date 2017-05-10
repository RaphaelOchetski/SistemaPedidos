/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author l03e06
 */
public class ItemPedidoDao extends GenericDao {
    
    public void alterar(ItemPedido itemPedido) throws SQLException{
        String update = "UPDATE ITEMPEDIDO " +
                    "SET IDMESA = ?,  IDPEDIDO = ?, IDPRODUTO = ?, SUBTOTAL = ?, VALORUNITARIO = ?, QUANTIDADE = ?, NOMEPROD = ?" + 
                    "WHERE IDITEM = ?";
        update(update, itemPedido.getIditem(), itemPedido.getIdmesa(), itemPedido.getIdproduto(), itemPedido.getSubtotal(), itemPedido.getValorunitario(), itemPedido.getQuantidade(), itemPedido.getNomeprod());
    }
    
 /*   public void encerrarItemPedido(ItemPedido itemPedido) throws SQLException{
        String update = "UPDATE ItemPedido " +
                    "SET idstatus = 0 " + 
                    "WHERE iditemPedido = ?";
        update(update, itemPedido.getIditem());
    }
    */
     public void salvar(ItemPedido itemPedido) throws SQLException{
        String insert = "INSERT INTO ItemPedido(IDMESA, IDPEDIDO, IDPRODUTO, SUBTOTAL, VALORUNITARIO, QUANTIDADE, NOMEPROD) VALUES (?, ?, ?,?, ?, ?, ?)";
        save(insert, itemPedido.getIdmesa(), itemPedido.getIdpedido(), itemPedido.getIdproduto(), itemPedido.getSubtotal(), itemPedido.getValorunitario(), itemPedido.getQuantidade(), itemPedido.getNomeprod()); 
    }
    
    public void excluir (int iditemPedido) throws SQLException{
        String delete = "DELETE FROM ITEMPEDIDO WHERE IDITEM = ?";
        delete (delete, iditemPedido);
    }
    
    public List<ItemPedido> findItemPedido() throws SQLException {
        List<ItemPedido> itemPedidos = new ArrayList<ItemPedido>();
        String select = "SELECT * FROM ITEMPEDIDO";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ItemPedido itemPedido = new ItemPedido();
            itemPedido.setIditem(rs.getInt("iditem"));
            itemPedido.setIdmesa(rs.getInt("idmesa"));
            itemPedido.setIdpedido(rs.getInt("idpedido"));
            itemPedido.setIdproduto(rs.getInt("idproduto"));
            itemPedido.setSubtotal(rs.getDouble("subtotal"));
            itemPedido.setQuantidade(rs.getInt("quantidade"));
            itemPedido.setValorunitario(rs.getDouble("valorunitario"));
            itemPedido.setNomeprod(rs.getString("nomeprod"));
            itemPedidos.add(itemPedido);
            
        }
        rs.close();
        stmt.close();
        return itemPedidos;
    }
    
   /** public List<ItemPedido> findStatus() throws SQLException {
        List<ItemPedido> itemPedidos = new ArrayList<ItemPedido>();
        String select = "SELECT * FROM STATUS";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("status"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }**/
    
    
    /* public List<Mesa> findByDescricao (String descricao) throws SQLException{
        List<Mesa> mesas = new ArrayList<Mesa>();
        String select = "SELECT * FROM mesa where descricao like ? '%'";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        stmt.setString(1, descricao);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("status"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }
     */
    /* public List<Mesa> findMesaAtiva() throws SQLException {
        List<Mesa> mesas = new ArrayList<Mesa>();
        String select = "SELECT * FROM MESA WHERE STATUS = 1 OR STATUS = 2";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("status"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }*/
     
    /* public List<Mesa> findMesaEncerrar() throws SQLException {
        List<Mesa> mesas = new ArrayList<Mesa>();
        String select = "SELECT * FROM MESA";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("status"));
            mesas.add(mesa);
            
        }
        rs.close();
        stmt.close();
        return mesas;
    }
    */
    /* public Mesa findMesaPorId(int mesa_id) throws SQLException {
      
        String select = "SELECT * FROM mesa WHERE idmesa = ?";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        stmt.setInt(1, mesa_id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        
       
            Mesa mesa = new Mesa();
            mesa.setIdMesa(rs.getInt("idmesa"));
            mesa.setDescricao(rs.getString("descricao"));
            mesa.setStatus(rs.getInt("status"));
                      
        
        rs.close();
        stmt.close();
        return mesa;
    }
     */
     

   
    
}
