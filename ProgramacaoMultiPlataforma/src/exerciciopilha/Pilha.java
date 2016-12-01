package exerciciopilha;

public class Pilha {
    
    NumeroInteiro fim;
    
    public Pilha(){
    }
    
    public void incluir(NumeroInteiro numero){
        if(fim != null){
            numero.setProximo(fim);
        }
       
        fim = numero;
    }
    
    public NumeroInteiro remover(){
        if(fim != null){
           fim = fim.getProximo();
        }
        
        return fim;
    }
    
    public NumeroInteiro verProximo(){
        return fim;
    }
    
    public void listarPilha(){
        
        NumeroInteiro aux = fim;
        
        if(fim == null){
            System.out.println("Pilha Vazia");
        }else{
            for (int i = 0; aux != null; i++) {
                System.out.println(aux);
                aux = aux.getProximo();
            }
        }
    }
    
    
    
    
}
