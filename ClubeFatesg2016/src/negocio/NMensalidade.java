package negocio;

import entidade.EAssociado;
import entidade.EMensalidade;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import persistencia.PMensalidade;

public class NMensalidade {

    PMensalidade persistencia;
    
    public NMensalidade() {
    
        persistencia = new PMensalidade();
        
    }
    
    
    
    public boolean existeMensalidadeEmAberto(EAssociado associado) throws SQLException{
        
        List<EMensalidade> lista;
        
        Calendar calendar = Calendar.getInstance();
        Timestamp dataAtual = new Timestamp(calendar.getTime().getTime());
        
        lista = persistencia.listar(associado.getCodigo());
        
        for(EMensalidade mensalidade : lista){
            if(mensalidade.getDataPagamento() == null){
                Timestamp dataVencimento = mensalidade.getDataVencimento();
                int diferencaEmDias =(int) (dataAtual.getTime() - dataVencimento.getTime()) / (1000*60*60*24);
                if(diferencaEmDias > 15){
                    return false;
                }
            }
        }
        
        return true;
    }
    
}
