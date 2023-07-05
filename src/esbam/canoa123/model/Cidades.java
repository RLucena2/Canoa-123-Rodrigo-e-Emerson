
package esbam.canoa123.model;

import esbam.canoa123.controller.DAO.CidadesDAO;
import esbam.canoa123.controller.DAO.ExceptionDAO;
import java.util.ArrayList;


public class Cidades {
    private int id;
    private String localidade;
    private String estado;

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
     * @return the localidade
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     * @param localidade the localidade to set
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Cidades(){
        
    }
    
     public Cidades(String localidade, String estado){
        this.localidade = localidade;
        this.estado = estado;
    }
    
    
    // FUNCAO CADASTRAR CIDADE
         public void CadastrarCidades(Cidades cid) throws ExceptionDAO{
             new CidadesDAO().cadastrarCidade(cid);
         }
    
    
    // FUNCAO BUSCAR CIDADE
    
     public ArrayList<Cidades> listarCidades (String nome) throws ExceptionDAO{
         return new CidadesDAO().listarCidades(nome);
     }
     
     //ALTERAR CIDADE
     
      public void alterarCidade(Cidades cidade) throws ExceptionDAO{
        new CidadesDAO().alterarCidade(cidade);
    }
}
