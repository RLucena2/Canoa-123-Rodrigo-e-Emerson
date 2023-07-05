/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.model;

import esbam.canoa123.controller.DAO.CategoriaDAO;
import esbam.canoa123.controller.DAO.ExceptionDAO;
import java.util.ArrayList;

/**
 *
 * @author erico
 */
public class Categorias {
    private int id;
    private String nome;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public Categorias (String nome){
        this.nome = nome;
    }
    
    
    public Categorias (){
        
    }
    public void cadastrarCategorias (Categorias categoria) throws ExceptionDAO{
         new CategoriaDAO().CadastrarCategoria(categoria);
    }
    
    public ArrayList<Categorias> listarCategoria (String nome) throws ExceptionDAO{
        return new CategoriaDAO().listarCategoria(nome);
    }
    
    public void alterarCategoria(Categorias categoria) throws ExceptionDAO{
        new CategoriaDAO().alterarCategoria(categoria);
    }
    
}
