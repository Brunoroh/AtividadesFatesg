package Exercicio14;

public class Caminhao extends Veiculo {
    
    private int eixos;

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(int eixos, String placa, int ano) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Numero de eixos : "+eixos);
    }
    
    
    
}
