
package listacircular;

import java.util.Scanner;

public class Testar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();
        System.out.println("Escolha a opcao desejada");
        System.out.println("1- Inserir Pessoa na fila\n"
                + "2- Remover Pessoa da fila\n"
                + "3- Listar Pessoas em Fila");
        int opcao = teclado.nextInt();
        
        if(opcao == 1){
            Pessoa pessoa = new Pessoa(teclado.next(), teclado.nextLong(), teclado.nextInt(), null);
            lista.insereFim(pessoa);
        }else if(opcao == 2){
            lista.removeInicio();
        }else if(opcao == 3){
            lista.MostraLista();
        }else{
            System.out.println("Opcao Invalida");
        }
    }
}
