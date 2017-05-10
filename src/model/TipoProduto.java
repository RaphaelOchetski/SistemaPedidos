/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author L02E07
 */
public class TipoProduto {

    @Override
    public String toString() {
        return idtipoproduto + " " + descricao;
    }

   
    
    
    private int idtipoproduto;
    public int getIdTipoProduto(){
        return idtipoproduto;
    }    
    
    public void setIdTipoProduto(int idtipoproduto){
        this.idtipoproduto=idtipoproduto;        
    }
    
    private String descricao;
    
    public String getDescricao(){
        return(descricao);
    }
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    
}
