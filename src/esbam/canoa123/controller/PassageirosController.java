package esbam.canoa123.controller;

import esbam.canoa123.controller.DAO.ExceptionDAO;
import esbam.canoa123.model.Passageiros;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PassageirosController {

    //CADASTRAR PASSAGEIROS
    
      public boolean cadastrarPassageiros (String nome, String cpf, int telefone, String senha) throws ExceptionDAO{
        if (nome !=null && nome.length()>0 && cpf !=null && cpf.length()>0){
                Passageiros passageiro = new Passageiros(nome, cpf, telefone, senha);
                passageiro.cadastrarPassageiro(passageiro);
                return true;
       } else{
            JOptionPane.showMessageDialog(null, "ERRO EM PASSAGEIRO CONTROLLER");
           return false;
        }           
    
}
 
    
    
    // listar Passageiros
    public ArrayList<Passageiros> listarPassageiros(String nome) throws ExceptionDAO {
        return new Passageiros().listarPassageiros(nome);

    }
    
    // ALTERAR PASSAGEIROS
    public boolean alterarPassageiro (int passageiroId, String nome, String cpf,int telefone, String senha) throws ExceptionDAO{
        if (nome !=null && nome.length()>0 && cpf !=null && cpf.length()>0){
                 Passageiros passageiro = new Passageiros(nome, cpf, telefone, senha);
                 passageiro.setId(passageiroId);
                 passageiro.alterarPassageiro(passageiro);
                 return true;
       } else{
            JOptionPane.showMessageDialog(null, "ERRO EM PASSAGEIRO CONTROLLER");
           return false;
        }           
    
}
    
    
    //LISTAR PASSAGEIRO CPF COMPRA DE PASSAGEM
    
     public ArrayList<Passageiros> listarPassageirosCpf(String cpf) throws ExceptionDAO {
        return new Passageiros().listarPassageirosCpf(cpf);

    }
}
