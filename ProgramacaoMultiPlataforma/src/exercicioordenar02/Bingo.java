package exercicioordenar02;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        int[] numeros = new int[90];
        
        boolean continuar = true;
        
        int sorteados;
     
        for (int i = 0; i < 90 && continuar; i++) {
            
                Sortear(numeros,i);
                ordenar(numeros);
                escrever(numeros,i);
                
                System.out.println("Enter para continuar e $ para Parar");
                String digitado = " ";
                
                if(digitado.equals("$")){
                    continuar = false;
                }
                
            
                
            
            
        }
        
    }
    
    public static void ordenar(int[] vetor) {

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
    
    public static void escrever(int numeros[], int qtd){
        
        String texto = "";
        
         for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > 0)                
                texto += " "+numeros[i]; 
             
        }
         System.out.println(texto);
    }
    
    public static void Sortear(int numeros[], int posicao){
        
        Random random = new Random();
        
        int numero;
        boolean procurandoNumero = true;
        
        while(procurandoNumero){
            numero = (random.nextInt(90))+1;
            boolean numeroIgual = false;
            for (int i = 0; i < numeros.length && numeroIgual == false; i++) {
                if (numeros[i] == numero) {
                    numeroIgual = true;
                }
            }
            if(numeroIgual == false){
                numeros[posicao] = numero;
                procurandoNumero = false;
            }
        }
      
        
    }
}
