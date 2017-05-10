/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Guilherme
 */
public class Produto {
    private int idproduto;
    
    public int getIdProduto(){
        return idproduto;
    }
    
    public void setIdProduto(int idproduto){
        this.idproduto=idproduto;
    }
    
    private String nome;
    public String getNome(){
        return nome;       
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
   private double preco;
   public double getPreco(){
       return preco;
   }
   
   public void setPreco(double preco){
       this.preco=preco;
   }
}
