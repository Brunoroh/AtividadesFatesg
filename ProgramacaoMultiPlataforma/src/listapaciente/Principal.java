package listapaciente;

import java.util.Scanner;

public class Principal {
    
    static Fila fila = new Fila();
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int op = 10;

        while(op != 0){

            System.out.println("\nDigite a opção desejada");
            System.out.println("1 Adicionar Paciente na fila");
            System.out.println("2 Atender Paciente");
            System.out.println("3 Verificar Proximo");
            
            op = teclado.nextInt();

            if(op == 1 ){
                
                System.out.println("\nDigite o CPF do cliente");
                Paciente paciente = new Paciente(teclado.nextInt());
                fila.enfileirar(paciente);
                System.out.println("\nPaciente adicionado na fila");
            }else if(op == 2){
                fila.desinfilerar();
                System.out.println("\nPaciente removido da Fila");
            }else{
                System.out.println("\nPaciente com cpf  \""+fila.mostrarProximo().getCpf()+"\" é o proximo da fila");
            }
            
        }
    
    
    }
}
