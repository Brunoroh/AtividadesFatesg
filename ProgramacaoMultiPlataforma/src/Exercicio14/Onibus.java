package Exercicio14;

public class Onibus extends Veiculo {
    
    private int assentos;

    public Onibus(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(int assentos, String placa, int ano) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Numero de assentos"+assentos);
    }
    
    
    
}
