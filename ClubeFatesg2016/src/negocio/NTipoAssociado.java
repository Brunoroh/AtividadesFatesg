package negocio;

import entidade.ETipoAssociado;
import java.sql.SQLException;
import java.util.List;
import persistencia.PTipoAssociado;

public class NTipoAssociado {

    PTipoAssociado persistencia;
    
    public NTipoAssociado() {
        persistencia = new PTipoAssociado();
    }
    
    public void salvar(ETipoAssociado parametro) throws SQLException{
        if(parametro.getCodigo() == 0){
            persistencia.incluir(parametro);
        }else{
            persistencia.alterar(parametro);
        }
    }
    
    public void excluir(int parametro) throws SQLException{
        persistencia.excluir(parametro);
    }
    
    public ETipoAssociado consultar(int parametro) throws SQLException{
        return persistencia.consultar(parametro);
    }
    
    public List<ETipoAssociado> listar() throws SQLException{
        return persistencia.listar();
    }

    
    
}
