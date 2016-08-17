package ExercicioMatrizes;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];
        int dividendo;
        int divisor;
        int mmc = 0;
        boolean numeroPrimo = true;
        int contVetor2 = -1;
        
        for(int x = 0;x < 50;x++){
            vetor1[x] = x+1;
            System.out.printf("%2d ",vetor1[x]);
        }
        
        System.out.printf("\n");
        
        for (int x = 1; x <= 50; x++) {
            divisor = dividendo = x;
            numeroPrimo = true;
           
            while (divisor > 0 && numeroPrimo == true) {
                if (dividendo % divisor == 0 && divisor != 1 && dividendo != divisor) {
                    numeroPrimo = false;
                }
                divisor--;
            }
            if(numeroPrimo == true){
            contVetor2++;  
            vetor2[contVetor2] = dividendo;
            }
            
        }
        
        for(int x = 0;x < 50;x++){
            if(vetor2[x] != 0)
            System.out.printf("%2d ",vetor2[x]);
        }
    }
}
