package ExercicioMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random();
        
        String[] estado = {"AC","AL","AP","AM","BA","CE","ES","GO","MA","MT","MS",
                        "MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO"
                        ,"RR","SC","SP","SE","TO"}; 
        int municipio = 10;
        int maiorPopulacao;
        int media = 0;
        int[][] populacao = new int[estado.length][municipio]; 
        
        for (int i = 0; i < populacao.length; i++) {
            System.out.print("\n"+"Digite a populacao dos municipios do "+estado[i]+"\n");
            for (int j = 0; j < populacao[i].length; j++) {
                System.out.print((j+1)+"º Municipio : ");
                populacao[i][j] = scanner.nextInt();
            }
        }

        /*
        for (int i = 0; i < populacao.length; i++) {
            //System.out.print("Digite a populacao dos municipios do "+estado[i]+"\n");
            for (int j = 0; j < populacao[i].length; j++) {
                //System.out.print((j+1)+"º Municipio : ");
                populacao[i][j] = random.nextInt(300000);
            }
        }*/

        maiorPopulacao = populacao[0][0];
        String municipioComMaiorPopulacao = populacao[0]+"do estado do "+estado[0];
        
        for (int i = 0; i < populacao.length; i++) {
            for (int j = 1; j < populacao[i].length; j++) {
                if(populacao[i][j] > maiorPopulacao){
                    maiorPopulacao = populacao[i][j];
                    municipioComMaiorPopulacao = j+"º municipio do estado do "+estado[j];
                }
            }
        }
        
        System.out.println("O Municipio com maior população é o "+municipioComMaiorPopulacao);
        
        
        for (int i = 0; i < populacao[0].length; i++) {
            media += populacao[0][i];
        }
        media = media/estado.length;
        
        System.out.println("A Populacao media das capitais é : "+media);
    }
}
