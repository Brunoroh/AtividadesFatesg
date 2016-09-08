package exercicio09;

public class Bicicleta extends Veiculo {

    public Bicicleta() {
        System.out.println("Bicicleta");
    }
    
    
    
    @Override
    public void listarVerificacoes(){
        System.out.println("Metodo listar verificacoes");
    }
    
    @Override
    public void ajustar(){
        System.out.println("Metodo ajustar");
    }
    
    @Override
    public void limpar(){
        System.out.println("Metodo limpar");
    }
}
