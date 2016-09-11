package entidade;

import java.sql.Date;
import java.sql.Timestamp;

public class EMovimentacao {
    
    private int codigo;
    private Timestamp dataHoraEntrada;
    private Timestamp dataHoraSaida;
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

    public Timestamp getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(Timestamp dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Timestamp getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Timestamp dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }
    
    public EAssociado getEAssociado() {
        return eAssociado;
    }

    public void setEAssociado(EAssociado eAssociado) {
        this.eAssociado = eAssociado;
    }
    
}
