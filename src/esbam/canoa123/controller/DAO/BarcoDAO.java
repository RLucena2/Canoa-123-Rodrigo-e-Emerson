
package esbam.canoa123.controller.DAO;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import esbam.canoa123.model.Barcos;
import javax.swing.JOptionPane;
import java.sql.ResultSet;    
import java.util.ArrayList;
    
public class BarcoDAO {
    PreparedStatement psta = null;
    Connection conn = null;
    
    public void cadastrarBarco (Barcos barco) throws ExceptionDAO{
        String sql = "insert into barco (nome, capacidade) value (?,?)";
        PreparedStatement psta = null;
        Connection conn = null;
        try{
            conn = new  ConnectionMVC().conectaBD();
            psta = conn.prepareStatement(sql);
            psta.setString(1, barco.getNome());
            psta.setInt(2, barco.getCapacidade());
            psta.execute();
        }catch(SQLException e){
            throw new ExceptionDAO ("erro EM BARCODAO " + e);
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
    
    
    // FUNCAO BUSCAR BARCO
    
     public ArrayList<Barcos> listarBarcos (String nome) throws ExceptionDAO{
          
            String sql = "select *from barco where nome like '%" + nome + "%' order by nome";
            Connection conn = null;
            PreparedStatement pstm = null;
            ArrayList<Barcos> barcos = null;
             try{
            conn = new  ConnectionMVC().conectaBD();
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);
                if(rs != null){
                    barcos = new ArrayList <Barcos>();
                    while(rs.next()){
                        Barcos barco = new Barcos();
                        barco.setId(rs.getInt("id"));
                        barco.setNome(rs.getString("nome"));
                        barco.setCapacidade(rs.getInt("capacidade"));
                        barcos.add(barco);
                    }
                }
                
             }catch(SQLException e){
            throw new ExceptionDAO ("erro EM BARCODAO " + e);
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
            
            return barcos;
        }
     
     
     
     /// ALTERAR BARCO
     
     public void alterarBarco (Barcos barco) throws ExceptionDAO{
        String sql = "update barco set nome = ?, capacidade = ? where id = ?";
        PreparedStatement psta = null;
        Connection conn = null;
        try{
            conn = new  ConnectionMVC().conectaBD();
            psta = conn.prepareStatement(sql);
            psta.setString(1, barco.getNome());
            psta.setInt(2, barco.getCapacidade());
            psta.setInt(3, barco.getId());
            psta.execute();
        }catch(SQLException e){
            throw new ExceptionDAO ("erro EM BARCODAO " + e);
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
    

           
    }

