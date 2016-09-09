package exercicio09;

import java.util.Random;

public class Oficina {
    
    public Veiculo proximo(){
        
        Random random = new Random();
        
        int i = random.nextInt(2);
        
        if(i == 0){
            return new Bicicleta();
        }else{
            return new Automovel();
        }
        
    }
    
    public void manutencao(Veiculo parametro){
        
        parametro.listarVerificacoes();
        parametro.ajustar();
        parametro.limpar();

        if(parametro.getClass().equals(Automovel.class)){
            ((Automovel)parametro).mudarOleo();
        }
        
    }
    
}
