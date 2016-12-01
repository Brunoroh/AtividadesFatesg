package recursividade;

public class Exercicio14 {
    
    
    
    public static double somatorio(double a ){
        
        if(a > 4){
            return 0;
        }else{
            if(a%2 != 0){
                return a/Math.pow(a, 2) + somatorio(a+1);
            }else{
                return -(a/Math.pow(a, 2)) + somatorio(a+1);
            }
        }
    }
    
    public static double somatorio2(double a){
        
        if(a < 1){
            return 0;
        }else{
            return Math.pow(-1,a+1)*a/(a*a) + somatorio2(a-1);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(somatorio(1));
    }
    
}
