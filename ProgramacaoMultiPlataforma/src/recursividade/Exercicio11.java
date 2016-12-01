package recursividade;



public class Exercicio11 {
    
    public static int somatorio(int a,int b){

        
        int s;

        if(a >= 100){
            return 0; 
        }else{
            s = a/b;
            return s + somatorio(a+2 ,b+1);  
        }

    }
    
    public static void main(String[] args) {
        System.out.println(somatorio(1,1));
    }


    
    
}
