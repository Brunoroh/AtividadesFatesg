package recursividade;


public class Exercicio06 {

    public static int multRecursiva(int a,int b){
        
        if(b == 1){
            return a;
        }else{
            return a+multRecursiva(a, b-1);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        System.out.println(multRecursiva(5, 5));
    }
    
}
