package exerciciobusca01;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroBuscado = random.nextInt(100000);
        
        
        int[] vetor = new int[100000];
        int[] vetorNoRepeat;
        
        
        preencherVetor(vetor);
        ordenacaoBolha(vetor);
        vetorNoRepeat = eliminarRepetidos(vetor);
        
        int qtdBin = buscaBinaria(vetorNoRepeat, numeroBuscado);
        int qtdSeq = buscaSequencial(vetorNoRepeat, numeroBuscado);
        
        System.out.println("Numero buscado : "+numeroBuscado
        +"\n quantidade de comparações com metodo de busca binario "+qtdBin
        +"\n quantidade de comparações com metodo de busca sequencial "+qtdSeq);
        
        
        
        
        
        
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
     
     public static void preencherVetor(int[] vetor){
         Random random = new Random();
         
         for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = random.nextInt(100000);
            
        }
     }

    private static int[] eliminarRepetidos(int[] vetor) {
        int[] vetor2 = new int[vetor.length];
        int numero = vetor[0];
        vetor2[0] = numero;
        int j = 1;
        
        for (int i = 1; i < vetor.length; i++) {
            if(numero != vetor[i]){
                vetor2[j] = vetor[i];
                numero = vetor[i];
                j++;
            }
        }
        
        int[] retorno = new int[j];
        for (int i = 0; i < retorno.length; i++) {
            retorno[i] = vetor2[i];
        }
        
        return retorno;
    }

    private static int buscaSequencial(int[] vetorNoRepeat, int numeroBuscado) {
        
        int i;
        for (i = 0; i < vetorNoRepeat.length ; i++) {
            if (numeroBuscado == vetorNoRepeat[i]) {
                return i;
            }else if(numeroBuscado < vetorNoRepeat[i]){
                return -1;
            }
        }
        
        return -1;
        
    }

    private static int buscaBinaria(int[] vetorNoRepeat, int numeroBuscado) {
        
        int inicio = 0;
        int fim = vetorNoRepeat.length;
        int meio = (inicio+fim)/2;
        boolean localizador = false;
        int i;
        for (i = 0; inicio <= fim && localizador == false; i++) {
            if(vetorNoRepeat[meio] == numeroBuscado){
                localizador = true;
            }else{
                if(numeroBuscado < vetorNoRepeat[meio]){
                    fim = meio -1;
                }else{
                    inicio = meio+1;
                }
                meio = (inicio+fim)/2;
            }
        }
        
        if(localizador){
            return i;
        }else{
            return -1;
        }
        
    }
    
    
}
