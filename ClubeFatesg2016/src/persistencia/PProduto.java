package persistencia;

import entidade.EAssociado;
import entidade.EProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PProduto {
    
    public void incluir(EProduto eProduto)throws SQLException{
        
        String sql = "INSERT INTO produto(nome,quantidade,valor)"
                +"VALUES(?,?,?)";
        
        Connection cnn = util.Conexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setString(1, eProduto.getNome());
        prd.setDouble(2, eProduto.getQuantidade());
        prd.setDouble(3, eProduto.getValor());
        
        prd.execute();
        cnn.close();
        
        
    }
    
    public void alterar(EProduto eProduto)throws SQLException{
        String sql = "UPDATE produto SET nome = ?, "
                + "quantidade = ?, "
                + "valor = ? "
                + "WHERE codigo = ?";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setString(1, eProduto.getNome());
        prd.setDouble(2, eProduto.getQuantidade());
        prd.setDouble(3, eProduto.getValor());
        
        prd.execute();
        cnn.close();
                
    }
    
    public void excluir(int codigo)throws SQLException{
        
        String sql = "DELETE FROM produto WHERE codigo = ";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setInt(1, codigo);
        
        prd.execute();
        cnn.close();
    
    }
    
    public EProduto consultar(int codigo) throws SQLException{
        String sql = "SELECT * FROM associado WHERE codigo = ?";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);
        
        ResultSet rs = prd.executeQuery();
        
        EProduto eProduto = new EProduto();
        if(rs.next()){
            eProduto.setCodigo(rs.getInt("codigo"));
            eProduto.setQuantidade(rs.getDouble("quantidade"));
            eProduto.setValor(rs.getDouble("valor"));
        }
        
        rs.close();
        cnn.close();
        
        return eProduto;
        
    }
    
    public List<EAssociado> listar(String nome)throws SQLException{
        
      
    }
    
    
    
}
