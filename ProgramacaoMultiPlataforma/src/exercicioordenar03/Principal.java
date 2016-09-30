package exercicioordenar03;

import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Random novoRandom = new Random();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor a ser ordenado [Tamanho maximo 100 itens] : ");
        int nItens = teclado.nextInt();
        
        while(nItens > 100){
            System.out.println("Tente com uma quantidade menor de itens");
            System.out.print("\n\nDigite o tamanho do vetor a ser ordenado : [Tamanho maximo 100 itens]");
            nItens = teclado.nextInt();
        }
        
        int[] numeros = new int[nItens];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = novoRandom.nextInt(100);
        }
        
         ordenacaoSelecao(numeros);
 //       ordenacaoInsercao(numeros);
 //       ordenacaoBolha(numeros);

        System.out.println("\n------------------------------------------");
        imprimir(numeros);
        System.out.println("------------------------------------------");
        
        if (numeros.length%2 == 0) 
            System.out.println("\n\nMediana: "+( (double)(numeros[numeros.length/2]) + (numeros[numeros.length/2-1] ))/2);
        else 
            System.out.println("\n\nMediana: "+ (numeros[numeros.length / 2]));
    }

    public static void ordenacaoSelecao(int[] vetor) {
        for (int i = 0; i <= vetor.length - 2; i++) {
            int minimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minimo]) {
                    minimo = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[minimo];
            vetor[minimo] = temp;
        }
    }

    public static void ordenacaoInsercao(int[] vetor) {

        for (int j = 1; j > vetor.length; j++) {
            int i;
            int aux;
            aux = vetor[j];
            i = j - 1;

            while (i >= 0 && vetor[i] > aux) {
                vetor[i + 1] = vetor[i];
                i = i - 1;
            }
            vetor[i + 1] = aux;
        }
    }

    public static void ordenacaoBolha(int[] vetor) {
        int tmp;
        int aux;
        for (int i = vetor.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void imprimir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
