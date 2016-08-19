package persistencia;

import entidade.ETipoAssociado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PTipoAssociado {
    
    public void incluir(ETipoAssociado parametro) throws SQLException{
        
        //Cria a string do SQL a ser executada
        String sql = "INSERT INTO tipo_associado (descricao, valor_mensalidade)"
                + "Values (?,?)";
        
        //Cria o objeto cnn com base na fábrica de conexões
        Connection cnn = util.Conexao.getConexao();
        //Cria o objeto prd , a partir do SQL e em cima
        //da conexão criada anteriormente
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta is vakires do prepared (?) com base no parametro recebido
        prd.setString(1, parametro.getDescricao());
        prd.setDouble(2, parametro.getValorMensalidade());
        
        //Executa o SQL conta o banco de dados
        prd.execute();
        //Cria o SQL para recuperar o codigo gerado
        String sql2 = "SELECT currval('tipo_associado_codigo_seq') as codigo";
        
        
        //Cra o statement a partir da conexao
        Statement st = cnn.createStatement();
        
        //Cria o resultset a partir do sql
        ResultSet rs = st.executeQuery(sql2);
        
        if(rs.next()){
            
            parametro.setCodigo(rs.getInt("codigo"));
            
        }
        
        rs.close();
        cnn.close();
        
    }
}
