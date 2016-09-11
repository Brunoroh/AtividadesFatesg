package persistencia;

import entidade.EAssociado;
import entidade.EMovimentacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PMovimentacao {
    
    public void incluir(EMovimentacao parametro) throws SQLException{
        
        String sql = "INSERT INTO movimentacao (hora_entrada ,codigo_associado)"
                +"VALUES (?,?)";
        
        Connection cnn = util.Conexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setTimestamp(1, parametro.getDataHoraEntrada());
        prd.setInt(2, parametro.getEAssociado().getCodigo());
        
        
        prd.execute();
        cnn.close();
        
    }
    
    public void alterar(EMovimentacao parametro) throws SQLException{
        
        String sql = "UPDATE associado SET hora_saida = ?"
                +"WHERE codigo = ?";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setTimestamp(1, parametro.getDataHoraSaida());
        
        prd.execute();
        cnn.close();
        
    }
    
    public EMovimentacao consultar(int codigoAssociado) throws SQLException{
        
        String sql = "SELECT * FROM consultar WHERE codigo_associado = ? ORDER BY hora_entrada DESC limit 1 ";
        
        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigoAssociado);
        
        ResultSet rs = prd.executeQuery();
        
        EMovimentacao eMovimentacao = new EMovimentacao();
        PAssociado pAssociado = new PAssociado();
        EAssociado eAssociado = new EAssociado();
        if(rs.next()){
            eAssociado = pAssociado.consultar(rs.getInt("codigo_associado"));
            eMovimentacao.setCodigo(rs.getInt("codigo"));
            eMovimentacao.setDataHoraEntrada(rs.getTimestamp("hora_entrada"));
            eMovimentacao.setDataHoraSaida(rs.getTimestamp("hora_saida"));
            eMovimentacao.setEAssociado(eAssociado);
        }
        
        rs.close();
        cnn.close();
    
        return eMovimentacao;
    }
    
}
