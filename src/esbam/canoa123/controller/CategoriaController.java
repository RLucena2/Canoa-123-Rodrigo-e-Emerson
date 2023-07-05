package esbam.canoa123.controller;

import esbam.canoa123.controller.DAO.ExceptionDAO;
import esbam.canoa123.model.Barcos;
import esbam.canoa123.model.Categorias;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CategoriaController {

    public boolean cadastrarCategoria(String nome) throws ExceptionDAO {
        if (nome != null && nome.length() > 0) {
            Categorias categorias = new Categorias(nome);
            categorias.cadastrarCategorias(categorias);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "ERRO EM CATEGORIA CONTROLLER");
            return false;
        }

    }

    public ArrayList<Categorias> listarCategoria(String nome) throws ExceptionDAO {
        return new Categorias().listarCategoria(nome);
    }

    //
    public boolean alterarCategoria(int categoriaId, String nome) throws ExceptionDAO {
        if (nome != null && nome.length() > 0) {
            Categorias categoria = new Categorias(nome);
            categoria.setId(categoriaId);
            categoria.alterarCategoria(categoria);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "ERRO NO CATEGORIA  CONTROLLER");
            return false;
        }

    }

}
