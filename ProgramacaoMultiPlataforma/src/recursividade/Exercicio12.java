package recursividade;


public class Exercicio12 {

    public static double somatorio(int a){
        double s;

        if(a > 50){
            return 0; 
        }else{
            s = 2*a/(51-a);
            return s + somatorio(a+1);  
        }
    }
    
    public static void main(String[] args) {
        System.out.println(somatorio(1));
    }
    
}
