package console;

import entidade.EMovimentacao;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import negocio.NAssociado;
import negocio.NMovimentacao;

public class NMovimentacaoTeste {
    
    public static void main(String[] args) throws SQLException {
        
        Calendar calendar = Calendar.getInstance();
        Timestamp timestamp = new Timestamp(calendar.getTime().getTime());
        Date date = new Date(calendar.getTime().getTime());
        EMovimentacao movimentacao = new EMovimentacao();
        movimentacao.setDataHoraEntrada(timestamp);
        movimentacao.setEAssociado(new NAssociado().consultar(1));
        
        NMovimentacao nMovimentacao = new NMovimentacao();
        nMovimentacao.registrarEntrada(movimentacao);
        
        
        
    }
    
}
