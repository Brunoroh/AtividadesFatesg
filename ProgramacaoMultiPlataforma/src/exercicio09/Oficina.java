package exercicio09;

import java.util.Random;

public class Oficina {
    
    public Veiculo proximo(){
        Veiculo retorno = null;
        
        Random random = new Random();
        
        int i = random.nextInt(2);
        
        if(i == 0){
            retorno = new Bicicleta();
        }else if(i == 1){
            retorno = new Automovel();
        }
        
        return retorno;
    }
    
    public void manutencao(Veiculo parametro){
        
        
        if(parametro.getClass() == Bicicleta.class){
            parametro.listarVerificacoes();
            parametro.ajustar();
            parametro.limpar();
            
        }else{
            parametro.listarVerificacoes();
            parametro.ajustar();
            parametro.limpar();
            parametro.mudarOleo();
            
        }
        
    }
    
}
