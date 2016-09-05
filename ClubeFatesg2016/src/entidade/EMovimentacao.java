package entidade;

import java.sql.Date;

public class EMovimentacao {
    
    private int codigo;
    private Date dataHoraEntrada;
    private Date dataHoraSaida;
    private EAssociado eAssociado;

    public EMovimentacao() {
        this.eAssociado = new EAssociado();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(Date dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }
    
    public EAssociado getEAssociado() {
        return eAssociado;
    }

    public void setEAssociado(EAssociado eAssociado) {
        this.eAssociado = eAssociado;
    }
    
    public void registrarMovimentacao(int codigo,String senha){
        
    }
    
    public void registrarEntrada(){
        
    }
    
    public void registrarSaida(){
        
    }
    
    public void verificarEntrada(){
        
    }
    
    
    
}
