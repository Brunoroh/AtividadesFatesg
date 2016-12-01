package recursividade;

public class Exercicio16 {
    
    public static int fatorial(int a){
        
        if(a < 1){
            return 0; 
        }else{
            return a * fatorial(a-1);
        }
        
    }
    
    public static double calculaSen(double a){
        return 1;
    }
    
    public static void main(String[] args) {
        
    }
}
