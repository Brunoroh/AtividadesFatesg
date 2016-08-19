package console;

import entidade.ETipoAssociado;
import java.sql.SQLException;
import persistencia.PTipoAssociado;

public class PTipoAssociadoTeste {
    public static void main(String[] args) throws SQLException  {
        
        System.out.println("Testando a inclusao do tipo associado");
        
        ETipoAssociado tipoAssociado = new ETipoAssociado();
        
        tipoAssociado.setDescricao("Socio Titular");
        tipoAssociado.setValorMensalidade(100.0);
        
        PTipoAssociado persistencia = new PTipoAssociado();
        persistencia.incluir(tipoAssociado);
        
        if(tipoAssociado.getCodigo() != 0 ){
            System.out.println("Inclusao efetuada com sucesso");
        }else{
            System.out.println("Deu Ruim");
        }
        
    }
}
