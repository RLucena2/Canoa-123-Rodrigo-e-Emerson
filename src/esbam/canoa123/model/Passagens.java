/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.model;

import esbam.canoa123.controller.DAO.ExceptionDAO;
import esbam.canoa123.controller.DAO.PassagemDAO;

/**
 *
 * @author erico
 */
public class Passagens {
    private int id;
    private Passageiros passageiro;
    private Rotas rota;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the passageiro
     */
    public Passageiros getPassageiro() {
        return passageiro;
    }

    /**
     * @param passageiro the passageiro to set
     */
    public void setPassageiro(Passageiros passageiro) {
        this.passageiro = passageiro;
    }

    /**
     * @return the rota
     */
    public Rotas getRota() {
        return rota;
    }

    /**
     * @param rota the rota to set
     */
    public void setRota(Rotas rota) {
        this.rota = rota;
    }
    
    public Passagens (Rotas rota, Passageiros passageiro){
        this.rota = rota;
        this.passageiro = passageiro;
    }
    
    public Passagens (){
        
    }
    
  //   public void cadastrarPassagem(Passagens passagem) throws ExceptionDAO{
    //   new PassagemDAO().cadastrarPassagem(passagem);
   // }
    
    
    
}
