package ExercicioMatrizes;

import java.util.Random;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int[][] questionario = new int[10][5];
        
        for (int i = 0; i < questionario.length; i++) {
            for(int j = 0; j < 30; j++){
                questionario[i][(random.nextInt(5))]++ ; 
            }       
        }
        
        
        for (int i = 0; i < questionario.length; i++) {
            for(int j = 0; j < questionario[i].length; j++){
                System.out.print(" "+questionario[i][j]);; 
            }     
            System.out.println("");
        }
    }
}
