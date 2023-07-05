/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.model;

import esbam.canoa123.controller.DAO.PassageirosDAO;
import esbam.canoa123.controller.DAO.ExceptionDAO;
import java.util.ArrayList;

/**
 *
 * @author erico
 */
public class Passageiros {

    private int id;
    private String nome;
    private String cpf;
    private int telefone;
    private String senha;

    //  public Passageiros(String nome, String cpf, int fone) {
    //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //  }
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

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Passageiros() {

    }

    public Passageiros(String nome, String cpf, int telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public void cadastrarPassageiro(Passageiros passageiro) throws ExceptionDAO {
        new PassageirosDAO().cadastrarPassageiro(passageiro);
    }

    public ArrayList<Passageiros> listarPassageiros(String nome) throws ExceptionDAO {
        return new PassageirosDAO().listarPassageiros(nome);

    }

    public void alterarPassageiro(Passageiros passageiro) throws ExceptionDAO {
        new PassageirosDAO().alterarPassageiros(passageiro);
    }

    
    // LISTAR PASSAGEIRO POR CPF
   public ArrayList<Passageiros> listarPassageirosCpf(String cpf) throws ExceptionDAO {
        return new PassageirosDAO().listarPassageirosCpf(cpf);

    }

}
