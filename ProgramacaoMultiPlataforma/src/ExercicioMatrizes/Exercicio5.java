package ExercicioMatrizes;

public class Exercicio5 {

    public static void main(String[] args) {
        int[] numero = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int maiorNumero;
        int segundoMaior;

        maiorNumero = numero[0];
        if (numero[1] > maiorNumero) {
            segundoMaior = maiorNumero;
            maiorNumero = numero[1];
        } else {
            segundoMaior = numero[1];
        }
        for (int i = 2; i < 15; i++) {
            if (numero[i] > maiorNumero) {
                segundoMaior = maiorNumero;
                maiorNumero = numero[i];
            } else {
                segundoMaior = numero[i];
            }
        }

        System.out.println("Maior : " + maiorNumero + "\nSegundo Maior : " + segundoMaior);
    }
}
