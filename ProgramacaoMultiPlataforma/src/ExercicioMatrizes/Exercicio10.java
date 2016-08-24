package ExercicioMatrizes;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Numero de Armazéns : ");
        int numeroArmazens = scanner.nextInt();
        
        System.out.print("Numero de Produtos : ");
        int numeroProdutos = scanner.nextInt();
        
        int[][] matriz = new int[numeroArmazens][numeroProdutos]; 
        int[] totalArmazem = new int[numeroArmazens];
        double[] valorProduto = new double[numeroProdutos];
        
        //recebe a quantidade de produto de cada em cada armazem
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Quantidade de Produto "+(j+1)+" no armazem "+(i+1)+" : ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("");
        
        //recebe o valor de cada produto
        for (int i = 0; i < valorProduto.length ; i++) {
            System.out.println("Valor do produto "+(i+1));
            valorProduto[i] = scanner.nextInt();
        }
        
        //calcula o total de produtos em cada armazem
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                totalArmazem[i] += matriz[i][j];
            }
            System.out.print("O total de produtos no Armazem "+(i+1)+" é de : "+totalArmazem[i]+"\n");
        }
        
        
        // verifica qual armazem contem mais produtos e imprimi
        int qtdProdutos = totalArmazem[0];
        String ArmazemComMaisProdutos = "O Armazem com mais produtos é o armazem "+1;
        for(int i = 1; i< totalArmazem.length ;i++   ){
            if(totalArmazem[i] > qtdProdutos){
                qtdProdutos = totalArmazem[i];
                ArmazemComMaisProdutos = "O Armazem com mais produtos é o armazem "+(i+1);
            }
        }
        System.out.println("");
        System.out.println(ArmazemComMaisProdutos);
        System.out.println("");
        
        
        //verifica e imprime qual armazem tem mais produto 2 e imprimi
        String ArmazemComMaisProdutos2 = "O Armazem com mais produtos 2 é o armazem "+1;
        int qtdProdutos2 = matriz[0][1];
        for(int i = 0; i< matriz.length ;i++   ){
            if(matriz[i][1] > qtdProdutos2){
                qtdProdutos = matriz[i][1];
                ArmazemComMaisProdutos = "O Armazem com mais produtos 2 é o armazem "+(i+1);
            }
        }
        System.out.println("");
        System.out.println(ArmazemComMaisProdutos);
        System.out.println("");
        
        
        //verifica o valor total de cada produto em cada armazem e imprimi
        double[] valorTotal = new double [numeroArmazens];
        double valorDoProduto;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("O Valor total do produto "+(j+1)+" no armazem "+(i+1)+" é de : ");
                valorDoProduto = matriz[i][j]*valorProduto[j];
                System.out.println(valorDoProduto);
                valorTotal[i] = valorTotal[i]+valorDoProduto;
            }
        }
        //imprime o valor total de cada armazem
        for (int i = 0; i < valorTotal.length; i++) {
            System.out.println("Valor total do Armazem "+(i+1)+" é de : "+valorTotal[i]);
        }
        
        double[] valorTotal2 = new double [numeroProdutos];
        double valorDoProduto2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                valorTotal2[j] = matriz[j][i];
                System.out.print("O valor total do produto "+(i+1)+" é de : "+valorTotal[j]);
            }
        }
        //imprime o valor total de cada armazem
        for (int i = 0; i < valorTotal.length; i++) {
            System.out.println("Valor total do Produto "+(i+1)+" em todos os armazens é de : "+valorTotal2[i]);
        }
    }
}
