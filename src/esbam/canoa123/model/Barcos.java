
package esbam.canoa123.model;

import esbam.canoa123.controller.DAO.BarcoDAO;
import esbam.canoa123.controller.DAO.ExceptionDAO;
import java.util.ArrayList;


public class Barcos {
    private int id;
    private String nome;
    private int capacidade;

  //  public Barcos() {
   //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  //  }
            
    public Barcos(){
        
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Barcos( String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }
    
    public void cadastrarBarco(Barcos barco) throws ExceptionDAO{
        new BarcoDAO().cadastrarBarco(barco);
    }
  
    
    public ArrayList<Barcos> listarBarcos (String nome) throws ExceptionDAO{
         return new BarcoDAO().listarBarcos(nome);
     }
    
    
    public void alterarBarco(Barcos barco) throws ExceptionDAO{
        new BarcoDAO().alterarBarco(barco);
    }
}
    

    
