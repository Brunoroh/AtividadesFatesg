
package ExercicioMatrizes;


public class Exercicio4 {
    public static void main(String[] args) {
        
    int[] avaliacao = new int[]{1,1,1,1,1,2,2,2,3,3,4,4,4,4,5,5,5,5,5,5};
    int[] notas = new int[5];
    double porcentagem;
    
    for(int i = 0 ; i < 20 ; i++){
        notas[((avaliacao[i])-1)] = notas[((avaliacao[i])-1)] +1; 
    }
    
    for(int i = 0;i< 5; i++){
        System.out.println("Avaliacao "+(i+1)+" "+notas[i]);
    }
    
    porcentagem = (notas[3]+notas[4]);
    porcentagem = porcentagem / 20;
    porcentagem = porcentagem * 100;
    
    System.out.print("4 e 5 corresponde a "+porcentagem+" %");
    
    }
}
