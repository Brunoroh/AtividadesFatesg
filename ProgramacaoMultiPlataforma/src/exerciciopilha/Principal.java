package exerciciopilha;

import java.util.Random;

public class Principal {
    
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha(); 
        preencherPilha(pilha);
        pilha.listarPilha();
        
        ordenarPilha(pilha);
        
        pilha.listarPilha();
        
    }
    
    public static void ordenarPilha(Pilha pilhaDesordenada){
        Pilha pilhaOrdenada = new Pilha();
        Pilha aux = new Pilha();
        pilhaOrdenada.incluir(pilhaDesordenada.remover());
        for (int i = 0; pilhaDesordenada.verProximo()!= null && aux.verProximo() == null; i++) {
            
            if(pilhaDesordenada.verProximo().getNumero() > pilhaOrdenada.verProximo().getNumero()){
                pilhaOrdenada.incluir(pilhaDesordenada.remover());
            }else (){
                
            }
            
        }
        
    }
    
    public static void preencherPilha(Pilha pilha){
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            pilha.incluir(new NumeroInteiro(random.nextInt(100)));
        }
    }
    
}
