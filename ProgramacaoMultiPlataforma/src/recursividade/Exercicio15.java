package recursividade;

public class Exercicio15 {
    
    public static double somatorio(double a){
        if((1000-(a-1)*3) < 1){
            return 0;
        }else{
            return (Math.pow(-1,a+1)*(1000-(a-1)*3))/a + somatorio(a+1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(somatorio(1));
    }
}
