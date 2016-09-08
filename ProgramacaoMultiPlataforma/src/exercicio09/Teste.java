package exercicio09;

public class Teste {
    
    public static void main(String[] args) {
        Oficina oficina = new Oficina();
        
        Veiculo veiculo = oficina.proximo();
        
        oficina.manutencao(veiculo);
    }
    
}
