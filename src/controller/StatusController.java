/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Status;
import model.StatusDao;

/**
 *
 * @author l03e06
 */
public class StatusController {
     
    public List<Status> listaStatus(){
        StatusDao dao = new StatusDao();
        try {
            return dao.findStatus();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas ao localizar status.\n"+e.getLocalizedMessage() );
        }
        return null;
    }
}
