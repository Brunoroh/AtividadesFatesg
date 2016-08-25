package persistencia;

import entidade.EAssociado;
import entidade.ETipoAssociado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        
        EAssociado eAssociado = new EAssociado();
        if(rs.next()){
            eAssociado.setCodigo(rs.getInt("codigo"));
            eAssociado.setNome(rs.getString("nome"));
            eAssociado.setEndereco(rs.getString("endereco"));
            eAssociado.setTelefone(rs.getString("telefone"));
            eTipoAssociado.setCodigo(rs.getInt("codigo_tipo_associado"));
            eAssociado.setTipoAssociado(eTipoAssociado);
        }
        rs.close();
        cnn.close();
        
        return eAssociado;      
    }
    
    
}
