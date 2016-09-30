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
     
        for (int i = 0; i < numeros.length && continuar; i++) {
            
            int numero = random.nextInt(90);
            
            if(Sortear(numeros, numero,i)){
                
                ordenar(numeros,i);
                escrever(numeros,i);
                
                System.out.println("Enter para continuar e $ para Parar");
                String digitado = teclado.nextLine();
                
                if(digitado.equals("$")){
                    continuar = false;
                }
                
            }else{
                i--;
            }
            
                       
        }
        
       
        
        
    }
    
    public static void ordenar(int[] vetor, int qtd) {

        for (int j = 1; j < vetor.length; j++) {
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
    
    public static void escrever(int numeros[], int qtd){
        
        String texto = "";
        
         for (int i = 0; i <= qtd; i++) {
            texto += " "+numeros[i]; 
            if(i/10 == 0){
                System.out.println("\n");
            }
        }
         System.out.print(texto+"\n");
    }
    
    public static boolean Sortear(int numeros[], int numero, int posicao){
        
        boolean retorno = false;
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > 0 && numeros[i] == numero){
                retorno = false;
            }else{
                numeros[posicao] = numero;
                retorno = true;
            }
        }
        
        return retorno;
        
    }
}
