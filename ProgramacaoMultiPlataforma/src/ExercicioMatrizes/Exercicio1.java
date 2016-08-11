package ExercicioMatrizes;

public class Exercicio1 {
    public static void main(String[] args) {
    int a = 12;
    int b = 31;
    int c = 32;
    int aux;
    
    if( b > a){
        aux = a;
        a = b;
        b = aux;
    }
    
    if( c > a){
        aux = a;
        a = c;
        c = aux;
    }
    
    if(c > b){
        aux = b;
        b = c;
        c = aux;
    }
    
    System.out.println(a+" > "+b+" > "+c);
    
    }
}
