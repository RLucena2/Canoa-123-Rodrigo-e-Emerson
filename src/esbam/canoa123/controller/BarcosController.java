/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.controller;

import esbam.canoa123.controller.DAO.BarcoDAO;
import esbam.canoa123.controller.DAO.ExceptionDAO;
import esbam.canoa123.model.Barcos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author erico
 */
public class BarcosController {
    
    public boolean cadastrarBarco (String nome, int capacidade) throws ExceptionDAO{
        if (nome !=null && nome.length()>0 && capacidade != 0 && capacidade>0){
                 Barcos barco = new Barcos(nome, capacidade);
                 barco.cadastrarBarco(barco);
                 return true;
       } else{
            JOptionPane.showMessageDialog(null, "ERRO NO BARCO CONTROLLER");
           return false;
        }           
    
}
    
    
     public ArrayList<Barcos> listarBarcos (String nome) throws ExceptionDAO{
         return new Barcos().listarBarcos(nome);
     }
     
     
      public boolean alterarBarco (int barcoId, String nome, int capacidade) throws ExceptionDAO{
        if (nome !=null && nome.length()>0 && capacidade != 0 && capacidade>0){
                 Barcos barco = new Barcos(nome, capacidade);
                 barco.setId(barcoId);
                 barco.alterarBarco(barco);
                 return true;
       } else{
            JOptionPane.showMessageDialog(null, "ERRO NO BARCO CONTROLLER");
           return false;
        }           
    
}
    
}
