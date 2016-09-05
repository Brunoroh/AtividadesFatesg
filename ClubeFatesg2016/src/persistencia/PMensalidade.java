package persistencia;

import entidade.EMensalidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PMensalidade {
    
    public void incluir(EMensalidade parametro) throws SQLException{
        String sql = "INSERTO INTO mensalidade (referencia, data_vencimento, data_pagamento, valor_mensalidade, valor_pagamento, codigo_associado)"
                +"VALUES (?,?,?,?,?,?)";
        
        Connection cnn = util.Conexao.getConexao();
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setString(1, parametro.getReferencia());
        prd.setDate(2, parametro.getDataVencimento());
        prd.setDate(3, parametro.getDataPagamento());
        prd.setDouble(4, parametro.getValorMensalidade() );
        prd.setDouble(5, parametro.getValorPagamento());
        prd.setInt(6, parametro.getEAssociado().getCodigo());
        
        prd.execute();
        cnn.close();
                
    }
    
}
