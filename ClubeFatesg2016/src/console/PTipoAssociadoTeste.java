package console;

import entidade.ETipoAssociado;
import java.sql.SQLException;
import negocio.NTipoAssociado;

public class PTipoAssociadoTeste {

    public static void main(String[] args) throws SQLException {

        System.out.println("Testando a inclusao do tipo associado");
        
        ETipoAssociado tipoAssociado = new ETipoAssociado();
        
        tipoAssociado.setDescricao("Socio dependente");
        tipoAssociado.setValorMensalidade(0.0);
        
        NTipoAssociado nTipoAssociado = new NTipoAssociado();
        nTipoAssociado.salvar(tipoAssociado);

        if(tipoAssociado.getCodigo() != 0 ){
            System.out.println("Inclusao efetuada com sucesso.");
        }else{
            System.out.println("Erro na inclusão.");
        }
        
        
//        System.out.println("Testando a alteração");
//        
//        ETipoAssociado tipo = new ETipoAssociado();
//        PTipoAssociado persistencia = new PTipoAssociado();
//        
//        tipo.setCodigo(2);
//        tipo.setDescricao("socio dependente");
//        tipo.setValorMensalidade(75.00);
//        
//        persistencia.alterar(tipo);
//
//        System.out.println("Tipo alterado com sucesso");


//          System.out.println("Testando exclusão");
//          
//          PTipoAssociado persistencia = new PTipoAssociado();
//          persistencia.excluir(3);
//          System.out.println("Excluido com sucesso");

//        System.out.println("Testando o consultar");
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Digite o codigo : ");
//        int codigo = scanner.nextInt();
//
//        PTipoAssociado persistencia = new PTipoAssociado();
//        ETipoAssociado tipo = persistencia.consultar(codigo);
//
//        if (tipo.getCodigo() != 0) {
//            System.out.println("Codigo.............: "+tipo.getCodigo());
//            System.out.println("Descricao..........: "+tipo.getDescricao());
//            System.out.println("Valor Mensalidade..: "+tipo.getValorMensalidade());
//        } else {
//            System.out.println("Tipo Associado não encontrado");
//        }
//
//        System.out.println("Testando o Listar");
//        
//        System.out.println("Digite o codigo : ");
//
//        PTipoAssociado persistencia = new PTipoAssociado();
//        List<ETipoAssociado> lista = persistencia.listar();
//        
//        for (ETipoAssociado tipo : lista) {
//            System.out.println("Codigo.............: "+tipo.getCodigo());
//            System.out.println("Descricao..........: "+tipo.getDescricao());
//            System.out.println("Valor Mensalidade..: "+tipo.getValorMensalidade());
//            System.out.println("");
//        }
        
    }
}
