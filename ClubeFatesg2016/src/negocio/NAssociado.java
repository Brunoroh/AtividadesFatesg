package negocio;

import entidade.EAssociado;
import java.sql.SQLException;
import java.util.List;
import persistencia.PAssociado;

public class NAssociado {
    
    private PAssociado persistencia;

    public NAssociado(PAssociado persistencia) {
        this.persistencia = persistencia;
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
    
    
    
}
