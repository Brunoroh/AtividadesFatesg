package Exercicio14;

import java.util.Random;
import java.util.Scanner;

public class ClasseDeTeste {
    
    public static void main(String[] args) {
        
        Boolean executar = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Veiculo[] vetor = new Veiculo[100];
        
        int indexVetor = 0;
        
        while(executar){
            
            
            
            System.out.print("Selecione uma opcao \n 1 - Inserir onibus \n"
                    + "2 - Inserir Caminhao \n"
                    + "3 - Sair \n"
                    + "opcao : ");
            
            int menu = scanner.nextInt();
            
            if(menu == 1){
                
                System.out.print("Digite a placa : ");
                String placa = scanner.next();
                System.out.print("\nDigite o ano : ");
                int ano = scanner.nextInt();
                System.out.print("\nDigite o Numero de assentos : ");
                int assentos = scanner.nextInt();
                vetor[indexVetor] = new Onibus(assentos, placa, ano);
            }else if(menu == 2){
                
                System.out.print("Digite a placa : ");
                String placa = scanner.next();
                System.out.print("\nDigite o ano : ");
                int ano = scanner.nextInt();
                System.out.print("\nDigite o Numero de Eixos : ");
                int eixos = scanner.nextInt();
                vetor[indexVetor] = new Caminhao(eixos, placa, ano);
                
            }else{
                executar = false;
            }
            
            indexVetor++;
            
        }
        
        for(int i = 0; i < (indexVetor-1); i++){
            
            System.out.println(vetor[i].getClass().getName());
        }
        
        for(int i = 0; i < (indexVetor-1); i++){
            
//            if(vetor[i].getClass() == Onibus.class){
//                Onibus onibus = (Onibus)vetor[i];
//                onibus.exibirDados();
//                System.out.println("---------");
//            }else{
//                Caminhao caminhao = (Caminhao)vetor[i];
//                caminhao.exibirDados();
//                System.out.println("--------");
//            }

                vetor[i].exibirDados();
                System.out.println("--------");
        }
        
       
            
    }
    
}
