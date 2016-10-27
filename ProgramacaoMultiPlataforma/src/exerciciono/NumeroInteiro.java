package exerciciono;

public class NumeroInteiro {
    private int numero;
    private NumeroInteiro proximo;

    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NumeroInteiro getProximo() {
        return proximo;
    }

    public void setProximo(NumeroInteiro proximo) {
        this.proximo = proximo;
    }
    
    
}
