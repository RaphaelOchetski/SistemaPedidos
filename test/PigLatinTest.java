/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.ItemPedidoController;
import controller.MesaController;
import controller.ProdutoController;
import util.*;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kira
 */
public class PigLatinTest {
    
    public PigLatinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void DescricaoVazia() throws Exception{
        try{
            MesaController mc = new MesaController();
            mc.salvar("", 1);
        }catch(Exception e){      
            assertTrue(e.getMessage().equalsIgnoreCase("Descricao ou Status Invalido"));
        }
    }
    
  //  @Test
    public void mesaValida() throws Exception{
           MesaController mc = new MesaController();
           assertEquals(1, mc.salvar("Mesa Teste", 1));    
           assertEquals(mc, mc);
    }
    
    @Test
    public void statusInvalido() throws Exception{
        try{
            MesaController mc = new MesaController();
            mc.salvar("Teste", 2);
        }
        catch(SQLException e){
            assertTrue(e.getMessage().equalsIgnoreCase("Descricao ou Status Invalido"));
        }
        
        
    }
   // @Test
    public void alterarInvalido(){
        try{
            MesaController mc = new MesaController();
            mc.alterar(1, "", 1);
        }
        catch(SQLException e){
            assertTrue(e.getMessage().equalsIgnoreCase("Descricao ou Status Invalido"));
        }
               
    }
    
   // @Test
    public void descricaoProdVazia() throws Exception{
        try{
            ProdutoController pc = new ProdutoController();
            pc.salvar("", 4.00);
        }
        catch(SQLException e){
            assertTrue(e.getMessage().equalsIgnoreCase("Valores Invalidos"));
        }     
    }
    
   // @Test
    public void precoProdNulo() throws Exception{
        try{
            ProdutoController pc = new ProdutoController();
            pc.salvar("Prod", 0.0);
        }
        catch(SQLException e){
            assertTrue(e.getMessage().equalsIgnoreCase("Valores Invalidos"));
        }
               
    }
    
    @Test
    public void salvar() throws SQLException{
        try{
            ItemPedidoController ipc = new ItemPedidoController();
            ipc.salvar(1, 1, 1,10, 2.50, "Metrallica", 4);
        }
        catch(SQLException e){
            assertTrue(e.getMessage().equalsIgnoreCase("Valores Invalidos"));
        }
    }
    
    
}
