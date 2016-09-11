package entidade;

import java.sql.Date;
import java.sql.Timestamp;

public class EMensalidade {

    private int codigo;
    private String referencia;
    private Timestamp dataVencimento;
    private Timestamp dataPagamento;
    private double valorMensalidade;
    private double valorPagamento;
    private EAssociado eAssociado;
    
    
    public EMensalidade() {
        eAssociado = new EAssociado();
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Timestamp getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Timestamp dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Timestamp getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Timestamp dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public EAssociado getEAssociado() {
        return eAssociado;
    }

    public void setEAssociado(EAssociado eAssociado) {
        this.eAssociado = eAssociado;
    }
    
    
    
}
