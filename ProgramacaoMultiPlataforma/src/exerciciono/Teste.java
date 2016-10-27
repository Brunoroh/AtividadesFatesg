package exerciciono;

import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            
            lista.insereOrdenado(new NumeroInteiro(random.nextInt(100)));
        }
        
        lista.mostraLista();
    }
}
