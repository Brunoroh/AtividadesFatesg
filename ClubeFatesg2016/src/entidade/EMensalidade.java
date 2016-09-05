package entidade;

import java.sql.Date;

public class EMensalidade {

    private int codigo;
    private String referencia;
    private Date dataVencimento;
    private Date dataPagamento;
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

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
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
