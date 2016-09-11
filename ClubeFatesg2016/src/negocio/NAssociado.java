package negocio;

import entidade.EAssociado;
import java.sql.SQLException;
import java.util.List;
import persistencia.PAssociado;

public class NAssociado {
    
    private PAssociado persistencia;

    public NAssociado() {
        this.persistencia = new PAssociado();
    }
    
    public void salvar(EAssociado parametro) throws SQLException{
        
        if(parametro.getCodigo() == 0){
            persistencia.incluir(parametro);
        }else{
            persistencia.alterar(parametro);
        }
        
    }
    
    public void excluir(int parametro) throws SQLException{
        persistencia.excluir(parametro);
    }
    
    public EAssociado consultar(int parametro) throws SQLException{
        return persistencia.consultar(parametro);
    }
    
    public List<EAssociado> listar(String parametro) throws SQLException{
        return persistencia.listar(parametro);
    }
    
    public boolean validarLogin(EAssociado parametro, String senha) throws SQLException{
     
        if(parametro.getSenha().equals(senha)){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    
}
