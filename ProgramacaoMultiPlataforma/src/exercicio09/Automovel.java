package exercicio09;

public class Automovel extends Veiculo {

    public Automovel() {
        System.out.println("Automovel");
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
    
    public void mudarOleo(){
        System.out.println("Metodo Mudar Oleo");
    }
    
    
    
}
