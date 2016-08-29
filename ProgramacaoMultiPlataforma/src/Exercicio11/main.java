package Exercicio11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Pessoa pessoas [] = new Pessoa[1];
        
        
        lerDados(pessoas);
        mostrarPessoas(pessoas);
    }
    
    public static void lerDados(Pessoa pessoas[]){
        Scanner entrada = new Scanner(System.in);
        int resp[];
        String nome;
        
        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Digite o nome da pessoa "+(i+1)+" :");
            nome = entrada.next();
            //ler as respostas desta pessoa
            resp = new int[10];
            System.out.print("\nDigite a resposta do(a) "+nome+" : ");
            for (int j = 0; j < 10; j++) {
                System.out.print("\nResposta da questão "+(j+1)+" : ");
                resp[j] = entrada.nextInt();
            }
            
            pessoas[i] = new Pessoa(nome,resp);
            
            
            
        }
        
        
    }
    
    public static void mostrarPessoas(Pessoa[] vetorPessoa){
        for (int i = 0; i <  vetorPessoa.length ;i++) {
        
            System.out.println(vetorPessoa[i]);
        }
    }
}
