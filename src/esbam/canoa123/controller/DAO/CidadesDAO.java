
package esbam.canoa123.controller.DAO;


import esbam.canoa123.model.Cidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CidadesDAO {
    
   // Connection conn;
   // PreparedStatement pstm;

     public void cadastrarCidade (Cidades cidade) throws ExceptionDAO{
        String sql = "insert into cidade (localidade, estado) values (?,?)";
        PreparedStatement psta = null;
        Connection conn = null;
        try{
            conn = new  ConnectionMVC().conectaBD();
            psta = conn.prepareStatement(sql);
            psta.setString(1, cidade.getLocalidade());
            psta.setString(2, cidade.getEstado());
            
            psta.execute();
        }catch(SQLException e){
            throw new ExceptionDAO ("erro EM CIDADEDAO " + e);
        }finally{
            try{
              if (psta != null){psta.close();}   
              
            }catch (SQLException e){
                throw new ExceptionDAO ("erro ao fechar psta " + e);
        } try {
            if (conn != null){ conn.close();}
        } catch (SQLException e){
            throw new ExceptionDAO ("erro ao fechar conn " + e);
        }
        }
        }
    
    
  
    
     // FUNCAO BUSCAR CIDADE
    
     public ArrayList<Cidades> listarCidades (String nome) throws ExceptionDAO{
          
            String sql = "select *from cidade where localidade like '%" + nome + "%' order by localidade";
            Connection conn = null;
            PreparedStatement pstm = null;
            ArrayList<Cidades> cidades = null;
             try{
            conn = new  ConnectionMVC().conectaBD();
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);
                if(rs != null){
                    cidades = new ArrayList <Cidades>();
                    while(rs.next()){
                        Cidades cidade = new Cidades();
                        cidade.setId(rs.getInt("id"));
                        cidade.setLocalidade(rs.getString("localidade"));
                        cidade.setEstado(rs.getString("estado"));
                        cidades.add(cidade);
                    }
                }
                
             }catch(SQLException e){
            throw new ExceptionDAO ("erro EM CIDADEDAO " + e);
        }finally{
            try{
              if (pstm != null){pstm.close();}   
              
            }catch (SQLException e){
                throw new ExceptionDAO ("erro ao fechar psta " + e);
        } try {
            if (conn != null){ conn.close();}
        } catch (SQLException e){
            throw new ExceptionDAO ("erro ao fechar conn " + e);
        }
        }
            
            return cidades;
        }
     
     
     
     /// ALTERAR BARCO
     
     public void alterarCidade (Cidades cidade) throws ExceptionDAO{
        String sql = "update cidade set localidade = ?, estado = ? where id = ?";
        PreparedStatement psta = null;
        Connection conn = null;
        try{
            conn = new  ConnectionMVC().conectaBD();
            psta = conn.prepareStatement(sql);
            psta.setString(1, cidade.getEstado());
            psta.setString(2, cidade.getLocalidade());
            psta.setInt(3, cidade.getId());
            psta.execute();
        }catch(SQLException e){
            throw new ExceptionDAO ("erro EM CIDADEDAO " + e);
        }finally{
            try{
              if (psta != null){psta.close();}   
              
            }catch (SQLException e){
                throw new ExceptionDAO ("erro ao fechar psta " + e);
        } try {
            if (conn != null){ conn.close();}
        } catch (SQLException e){
            throw new ExceptionDAO ("erro ao fechar conn " + e);
        }
        }
        }
     
     // LISTAR LOCALIDADE - ORIGEM
     
    
    
}
