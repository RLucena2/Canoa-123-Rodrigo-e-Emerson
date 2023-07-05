/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.model;

/**
 *
 * @author erico
 */
public class Rotas {
    private int id;
    private float valor;
    private Cidades origem;
    private Cidades destino;
    private Categorias categoria;

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
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the origem
     */
    public Cidades getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(Cidades origem) {
        this.origem = origem;
    }

    /**
     * @return the destino
     */
    public Cidades getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Cidades destino) {
        this.destino = destino;
    }

    /**
     * @return the categoria
     */
    public Categorias getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
}
