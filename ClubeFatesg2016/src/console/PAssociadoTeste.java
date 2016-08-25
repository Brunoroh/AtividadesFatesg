package console;

import entidade.EAssociado;
import entidade.ETipoAssociado;
import java.sql.SQLException;
import java.util.Scanner;
import persistencia.PAssociado;
import persistencia.PTipoAssociado;

public class PAssociadoTeste {

    public static void main(String[] args) throws SQLException {

//        System.out.println("Testando a inclusao do associado");
//        
//        PTipoAssociado pTipoAssociado = new PTipoAssociado();
//        ETipoAssociado eTipoAssociado = pTipoAssociado.consultar(1);
//        
//        EAssociado associado = new EAssociado();
//        associado.setNome("Bruno");
//        associado.setEndereco("Rua sr 07");
//        associado.setTelefone("6232085002");
//        associado.setTipoAssociado(eTipoAssociado);
//        
//        PAssociado pAssociado = new PAssociado();
//        
//        pAssociado.incluir(associado);
//        
//        System.out.println("Fim do teste de inclusão de associado");


//        System.out.println("Testando a alteração do associado");
//
//        PTipoAssociado pTipoAssociado = new PTipoAssociado();
//        ETipoAssociado eTipoAssociado = pTipoAssociado.consultar(1);
//
//        EAssociado associado = new EAssociado();
//        associado.setCodigo(1);
//        associado.setNome("Bruno Rodrigues");
//        associado.setEndereco("Rua sr 07");
//        associado.setTelefone("6232085002");
//        associado.setTipoAssociado(eTipoAssociado);
//        
//        PAssociado pAssociado = new PAssociado();
//        
//        pAssociado.alterar(associado);
//        
//        System.out.println("Teste de Alteração concluido");


//        System.out.println("Testando exclusão");
//        PAssociado persistencia = new PAssociado();
//        persistencia.excluir(1);
//        

        System.out.println("Testando o consultar");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o codigo : ");
        int codigo = scanner.nextInt();
        
        PTipoAssociado persistencia = new PTipoAssociado();
        ETipoAssociado tipo = persistencia.consultar(codigo);
    

    }
}
