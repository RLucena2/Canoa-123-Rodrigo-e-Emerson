package esbam.canoa123.controller;

import esbam.canoa123.controller.DAO.ExceptionDAO;
import esbam.canoa123.model.Cidades;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CidadesController {

    // cadastrar cidade
    public boolean cadastrarCidade(String estado, String localidade) throws ExceptionDAO {
        if (estado != null && estado.length() > 0 && localidade != null && localidade.length() > 0) {
            Cidades cidade = new Cidades(localidade, estado);
            cidade.CadastrarCidades(cidade);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "ERRO EM CIDADE CONTROLLER");
            return false;
        }

    }

    // listar cidade
    public ArrayList<Cidades> listarCidades(String nome) throws ExceptionDAO {
        return new Cidades().listarCidades(nome);
    }

    // ALTERAR CIDADE
    public boolean alterarCidade(int cidadeId, String estado, String localidade) throws ExceptionDAO {
        if (estado != null && estado.length() > 0 && localidade != null && localidade.length() > 0) {
            Cidades cidade = new Cidades(localidade, estado);
            cidade.setId(cidadeId);
            cidade.alterarCidade(cidade);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "ERRO NO BARCO CONTROLLER");
            return false;
        }

    }

}
