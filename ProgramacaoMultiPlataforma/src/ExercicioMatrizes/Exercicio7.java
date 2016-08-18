package ExercicioMatrizes;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vet[] = new int[5];
        boolean achou;
        for(int i = 0; i < vet.length ; i++){
            System.out.println("Digite o "+(i+1)+"o. numero : ");
            int n = ler.nextInt();
            achou=false;
            for(int j = 0; j < i && !achou; j++){
                if(n == vet[j]){
                    achou = true;
                }
            }
            if(!achou)
                vet[i] = n;
            else{
                System.out.println(n + "ja existe no vetor");
                i--;
            }
        }
        System.out.println("Elementos armazenados no vetor");
        for(int i= 0; i < vet.length; i++){
            System.out.printf("%6d\t",vet[i]);
        }
        System.out.println("");
        
    }
}
