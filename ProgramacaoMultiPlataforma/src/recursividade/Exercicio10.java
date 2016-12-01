package recursividade;

public class Exercicio10 {
    
    public static void parCrescente(int n){
        if(n < 0){
           return;
        }else{
            System.out.println(n);
            parCrescente(n-2);
        }
        
    }
    
    public static void main(String[] args) {
        parCrescente(8);
    }
}
