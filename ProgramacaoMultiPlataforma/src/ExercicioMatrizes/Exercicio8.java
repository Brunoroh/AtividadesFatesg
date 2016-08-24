package ExercicioMatrizes;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int produto = 0;
        
        System.out.print("Numero de linhas : ");
        int numeroDeLinhas = scanner.nextInt();
        
        System.out.print("Numero de colunas : ");
        int numeroDeColunas = scanner.nextInt();
        
        int[][] matrizA = new int[numeroDeLinhas][numeroDeColunas]; 
        int[][] matrizB = new int[numeroDeLinhas][numeroDeColunas+1]; 
        
        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("A["+i+"]["+j+"] : ");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                if(j == 0){
                    produto = matrizA[i][j];
                }else if(j < matrizB[i].length-1){
                    produto = produto * matrizA[i][j];
                }
                if(j == matrizB[i].length -1 ){
                    matrizB[i][j] = produto;
                }else{
                    matrizB[i][j] = matrizA[i][j];
                }
                
            }
        }
        
        System.out.println("");
        System.out.println("Matriz A : ");
        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz B : ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
