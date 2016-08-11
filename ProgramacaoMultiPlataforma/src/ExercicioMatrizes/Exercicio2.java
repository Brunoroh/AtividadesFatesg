package ExercicioMatrizes;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] notasAlunos = new int[]{7,12,100,4,45,56,57,66,32,33,80,87,92,46,74,22};
        int[] intervaloNotas = new int[11];
        
        for(int i = 0; i < notasAlunos.length; i++){
            intervaloNotas[notasAlunos[i]/10]++;
              
        }
        
        for(int i = 0; i < intervaloNotas.length; i++){
            if(i == intervaloNotas.length-1){
                System.out.print("100 : "+intervaloNotas[i] );
            }else{
                System.out.printf("%02d-%02d: ", i*10, i*10+9);
                System.out.printf(""+intervaloNotas[i]);
            }
            System.out.println("");
        }
        
    }
}
