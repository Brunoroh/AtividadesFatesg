package recursividade;

public class Somatorio {
    
    public static int somarAteN(int n){
        
        if(n == 0)
            return 0;
        else
            return n+somarAteN(n-1);
        
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(somarAteN(5));
        
    }
    
}
