/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author l03e06
 */
public class Mesa {
    private int idmesa;
    public int getIdMesa(){
        return idmesa;
    }
    public void setIdMesa(int idmesa){
        this.idmesa=idmesa;
    }
    
    private String descricao;
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    
    private int status;
    public int getStatus(){
        return status;
    }
    public void setStatus(int status){
        this.status=status;
    }
    /*private String confirmacao;
    public String getconf(){
        return confirmacao;
    }
    public void setconf(String confirmacao){
        this.confirmacao=confirmacao;
    }*/
   /* private int encerrar;
    public int getEncerrar(){
        return encerrar;
    }
    public void setEncerrar(int encerrar){
        this.encerrar=encerrar;
    }*/
    
}
