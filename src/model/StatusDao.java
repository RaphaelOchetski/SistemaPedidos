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
public class StatusDao extends GenericDao {
    
    public List<Status> findStatus() throws SQLException {
        List<Status> statuss = new ArrayList<Status>();
        String select = "SELECT * FROM STATUS";
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement(select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Status status = new Status();
            status.setIdStatus(rs.getInt("idstatus"));
            status.setStatusDescricao(rs.getString("descricao"));
            statuss.add(status);
            
        }
        rs.close();
        stmt.close();
        return statuss;
    }
    
    
   

   
    
}
