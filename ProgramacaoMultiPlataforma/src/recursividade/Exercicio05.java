package recursividade;

public class Exercicio05 {
    private static int numero = 0;
    private static int numero2 = 1;
    private static int aux = 0;
    
    public static int calculaVibonacci(int n){
        
        
        if(n == 1 )
            return numero;
        else{
            
            aux = numero;
            numero += numero2;
            numero2 = aux;
            return calculaVibonacci(n-1);
            
        }

        
        
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(calculaVibonacci(10));
    }
    
    
    
    
}
