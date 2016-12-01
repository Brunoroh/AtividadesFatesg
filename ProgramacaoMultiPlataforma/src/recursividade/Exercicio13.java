package recursividade;

public class Exercicio13 {
     public static double somatorio(int a){
        double s;

        if(a > 37){
            return 0; 
        }else{
            s = (38-a)*(39-a) / a;
            return s + somatorio(a+1);  
        }
        
       
    }
     
    public static void main(String[] args) {
        System.out.println(somatorio(1));
    }
}