package negocio;

import entidade.EAssociado;
import entidade.EMovimentacao;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import persistencia.PMovimentacao;

public class NMovimentacao {
 
    private PMovimentacao persistencia;

    public NMovimentacao() {
        this.persistencia = new PMovimentacao();
    }
    
    
    public void registrarMovimentacao(EMovimentacao movimentacao,EAssociado associado, String senha) throws SQLException{
        
        if(verificarEntrada(associado,senha)){
            if(movimentacao.getCodigo() != 0 ){
                registrarEntrada(movimentacao);
            }else{
                registrarSaida(movimentacao);
            }
        }else{
            System.out.println("Usuario e senha incorreto");
        }
        
        Calendar calendar = Calendar.getInstance();
        Timestamp timestamp = new Timestamp(calendar.getTime().getTime());
        
        
    }
    
    public void registrarEntrada(EMovimentacao movimentacao) throws SQLException{
        persistencia.incluir(movimentacao);
    }
    
    public void registrarSaida(EMovimentacao movimentacao) throws SQLException{
        persistencia.alterar(movimentacao);
    }
    
    public boolean verificarEntrada(EAssociado associado, String senha) throws SQLException{
        if(new NAssociado().validarLogin(associado, senha)){
            return true;
        }else{
            return false;
        }
    }
    
}
