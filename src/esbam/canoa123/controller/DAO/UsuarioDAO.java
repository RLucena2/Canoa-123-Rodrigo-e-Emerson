/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.controller.DAO;


import esbam.canoa123.model.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UsuarioDAO {

   

    public ResultSet autenticacaoUsuario(Usuario usu) {
         Connection conn;
        conn = new ConnectionMVC().conectaBD();

        try {
            String sql = "Select *from usuario where nome_usuario = ? and senha_usuario = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, usu.getNome_usuario());
            pstm.setString(2, usu.getSenha_usuario());
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
    }
}

