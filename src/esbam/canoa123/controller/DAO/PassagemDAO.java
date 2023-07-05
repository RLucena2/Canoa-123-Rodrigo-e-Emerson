package esbam.canoa123.controller.DAO;

import esbam.canoa123.model.Barcos;
import esbam.canoa123.model.Passagens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class PassagemDAO {
    
    
    // LISTAR ORIGEM - LOCALIDADE
     public ResultSet listarOrigem (){
          
        String sql = "select *from cidade order by localidade";
        
        PreparedStatement psta = null;
        Connection conn = null;
        
        try {
            conn = new  ConnectionMVC().conectaBD();
            psta = conn.prepareStatement(sql);
            return psta.executeQuery();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
        
    
     // LISTAR DESTINO - ESTADO
     
     public ResultSet listarDestino (){
          
        String sql = "select *from cidade order by estado";
           //String sql = "select destino_id from rota where origem_id = ?";
        PreparedStatement psta = null;
        Connection conn = null;
        
        try {
            conn = new  ConnectionMVC().conectaBD();
            psta = conn.prepareStatement(sql);
            return psta.executeQuery();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    

    public void cadastrarPassagem(Passagens passagem) throws ExceptionDAO {
        
        int idPassageiro = passagem.getPassageiro().getId();
        int idRota = passagem.getRota().getId();

        String sql = "insert into passagem (rota_id, passageiro_id) value (?,?)";
        PreparedStatement psta = null;
        Connection conn = null;
        try {
            conn = new ConnectionMVC().conectaBD();
            psta = conn.prepareStatement(sql);
            psta.setInt(1, idRota);
            psta.setInt(2, idPassageiro);
            psta.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("erro EM PASSAGEMDAO " + e);
        } finally {
            try {
                if (psta != null) {
                    psta.close();
                }

            } catch (SQLException e) {
                throw new ExceptionDAO("erro ao fechar psta " + e);
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("erro ao fechar conn " + e);
            }
        }
    }

}
