package persistencia;

import entidade.EAssociado;
import entidade.EMensalidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PMensalidade {
    
    public void incluir(EMensalidade parametro) throws SQLException{
        String sql = "INSERTO INTO mensalidade (referencia, data_vencimento, data_pagamento, valor_mensalidade, valor_pagamento, codigo_associado)"
                +"VALUES (?,?,?,?,?,?)";
        
        Connection cnn = util.Conexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setString(1, parametro.getReferencia());
        prd.setTimestamp(2, parametro.getDataVencimento());
        prd.setTimestamp(3, parametro.getDataPagamento());
        prd.setDouble(4, parametro.getValorMensalidade() );
        prd.setDouble(5, parametro.getValorPagamento());
        prd.setInt(6, parametro.getEAssociado().getCodigo());
        
        prd.execute();
        cnn.close();
                
    }
    
    public EMensalidade consultar(int codigo) throws SQLException{
        
        String sql = "SELECT * FROM mensalidade WHERE codigo = ?";
        
        Connection cnn = util.Conexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);
        
        ResultSet rs = prd.executeQuery();
        
        EMensalidade eMensalidade = new EMensalidade();
        EAssociado eAssociado = new EAssociado();
        PAssociado pAssociado = new PAssociado();
        if(rs.next()){
            eAssociado = pAssociado.consultar(rs.getInt("codigo_associado"));
            eMensalidade.setCodigo(rs.getInt("codigo"));
            eMensalidade.setReferencia(rs.getString("referencia"));
            eMensalidade.setDataPagamento(rs.getTimestamp("data_vencimento"));
            eMensalidade.setDataVencimento(rs.getTimestamp("data_pagamento"));
            eMensalidade.setValorMensalidade(rs.getDouble("valor_mensalidade"));
            eMensalidade.setValorPagamento(rs.getDouble("valor_pagamento"));
            eMensalidade.setEAssociado(eAssociado);
        }
        
        rs.close();
        cnn.close();
        
        return eMensalidade;
    }
    
    public List<EMensalidade> listar(int codigoAssociado)throws SQLException{
        
        String sql = "SELECT * FROM mensalidade WHERE codigo_associado = ?";
        
        Connection cnn = util.Conexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
    }
    
    
    
}
