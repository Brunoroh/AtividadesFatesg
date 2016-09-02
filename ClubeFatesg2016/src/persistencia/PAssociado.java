package persistencia;

import entidade.EAssociado;
import entidade.ETipoAssociado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PAssociado {
    
    public void incluir(EAssociado parametro)throws SQLException{
        String sql = "INSERT INTO associado (nome, endereco, telefone, codigo_tipo_associado)"
                +"VALUES (?,?,?,?)";
        
        Connection cnn = util.Conexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setString(1, parametro.getNome());
        prd.setString(2, parametro.getEndereco());
        prd.setString(3, parametro.getTelefone());
        prd.setInt(4, parametro.getTipoAssociado().getCodigo());
        
        prd.execute();
        
        cnn.close();
    } 
    
    public void alterar(EAssociado parametro)throws SQLException{
        
        String sql = "UPDATE associado SET nome = ?, "
                +"endereco = ?, "
                +"telefone = ?, "
                +"codigo_tipo_associado = ? "
                +"WHERE codigo = ?";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setString(1, parametro.getNome());
        prd.setString(2 , parametro.getEndereco());
        prd.setString(3, parametro.getTelefone());
        prd.setInt(4, parametro.getTipoAssociado().getCodigo());
        prd.setInt(5, parametro.getCodigo());
        
        prd.execute();
        cnn.close();
        
    }
    
    public void excluir(int codigo)throws SQLException{
        
        String sql = "DELETE FROM associado WHERE codigo = ?";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setInt(1, codigo);
        
        prd.execute();
        cnn.close();
        
        
    }
    
    public EAssociado consultar(int codigo) throws SQLException{
        
        String sql = "SELECT * FROM associado WHERE codigo = ?";
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);
        
        ResultSet rs = prd.executeQuery();
        
        ETipoAssociado eTipoAssociado = new ETipoAssociado();
        PTipoAssociado pTipoAssociado = new PTipoAssociado();
        
        EAssociado eAssociado = new EAssociado();
        if(rs.next()){
            eTipoAssociado = pTipoAssociado.consultar(rs.getInt("codigo_tipo_associado"));
            eAssociado.setCodigo(rs.getInt("codigo"));
            eAssociado.setNome(rs.getString("nome"));
            eAssociado.setEndereco(rs.getString("endereco"));
            eAssociado.setTelefone(rs.getString("telefone"));
            eAssociado.setTipoAssociado(eTipoAssociado);
        }
        rs.close();
        cnn.close();
        
        return eAssociado;      
    }
    
    
    public List<EAssociado> listar(String nome)throws SQLException{
        
        String sql = "SELECET * FROM associado WHERE nome = %"+nome+"% ";
        
        Connection cnn = util.Conexao.getConexao();
        Statement stm = cnn.createStatement();
        
        
        ResultSet rs = stm.executeQuery(sql);
        
        List<EAssociado> lista = new ArrayList<>();
        
        while(rs.next()){
            EAssociado associado = new EAssociado();
            
            associado.setCodigo(rs.getInt("codigo"));
            associado.setNome(rs.getString("nome"));
            associado.setEndereco(rs.getString("endereco"));
            associado.setTelefone(rs.getString("telefone"));
            associado.getTipoAssociado().setCodigo(rs.getInt("codigo_tipo_associado"));
            lista.add(associado);
        }
        
        return lista;
    }
    
}
