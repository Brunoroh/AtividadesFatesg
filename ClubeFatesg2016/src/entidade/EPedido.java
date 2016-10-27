package entidade;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class EPedido {
    
    private int codigo;
    private Date data;
    private double valorTotal;
    private EAssociado associado;
    private List<EItemPedido> listaDeItens;

    public EPedido() {
        associado = new EAssociado();
        listaDeItens = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public EAssociado getAssociado() {
        return associado;
    }

    public void setAssociado(EAssociado associado) {
        this.associado = associado;
    }

    public List<EItemPedido> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(List<EItemPedido> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }
    
    
    
    
}
