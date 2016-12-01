package recursividade;

public class Exercicio09 {
    
    public static void parCrescente(int n){
        if(n < 0){
           return;
        }else{
            parCrescente(n-2);
            System.out.println(n);
        }
        
    }
    
    public static void main(String[] args) {
        parCrescente(8);
    }
}
