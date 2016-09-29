
package ExercicioOrdenar04;

import java.io.BufferedReader;
import java.io.FileReader;


public class ClassePrincipal {
    
    public static void main(String[] args) {
        String arquivo = "./src/ExercicioOrdenar04/ListaGeralDeDados.csv";
        Aluno lista[] = new Aluno[901];
        lerDados(lista, arquivo);
        
        System.out.println("Matricula;Nome;Ingresso;Turno;Matriz");
        
//        imprimir(lista);
        
//        OrdenarPorNomeBubbleSort(lista);
//        
//        imprimir(lista);
//        
//        OrdenarPorMatriculaBubbleSort(lista);
//        
//        imprimir(lista);
//        
//        OrdenarPorNomeShellSort(lista);
//        
//        imprimir(lista);
//        
        OrdenarPorMatriculaShellSort(lista);
        
        imprimir(lista);  
    }
    
    public static void lerDados(Aluno lista[], String arq) {

        try {

            FileReader fr = new FileReader(arq);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            int i = 0;
            while ((linha = br.readLine()) != null) {
                String[] dados;
                dados = linha.split(";");
                Aluno listaGeral = new Aluno();
                listaGeral.setMatricula(dados[0]);
                listaGeral.setNome(dados[1]);
                listaGeral.setIngresso(dados[2]);
                listaGeral.setTurno(dados[3]);
                listaGeral.setMatriz(dados[4]);
                lista[i] = listaGeral;
                i++;
            }

        } catch (Exception erro) {
            System.out.println("Erro ao abrir o arquivo.");
        }

    }
    
    public static void imprimir(Aluno lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    private static void OrdenarPorNomeBubbleSort(Aluno[] lista) {
        Aluno aux = null;
        
        for(int i = lista.length -1; i > 0; i--){
		for(int j = 0; j< i; j++){
			if(lista[j].getNome().compareToIgnoreCase(lista[j+1].getNome()) > 0){
				aux = lista[j];
				lista[j] = lista[j+1];
				lista[j+1] = aux;
			}
		}
	}
    }

    private static void OrdenarPorMatriculaBubbleSort(Aluno[] lista) {
       Aluno aux = null;
        
        for(int i = lista.length -1; i > 0 ; i--){
		for(int j = 0; j < i; j++){
			if(lista[j].getMatricula().compareToIgnoreCase(lista[j+1].getMatricula()) > 0){ 
				aux = lista[j];
				lista[j] = lista[j+1];
				lista[j+1] = aux;
			}
		}
	}
    }

    private static void OrdenarPorNomeShellSort(Aluno[] lista) {
        Aluno tmp;
        int j;
        for(int gap = lista.length/2; gap > 0; gap /= 2){
            for(int i = gap; i < lista.length; i++){
                tmp = lista[i];
                for(j = i ; j >= gap && (tmp.getNome().compareToIgnoreCase(lista[j-gap].getNome())) < 0 ; j -= gap ){
                    lista[j] = lista[j - gap];
                }
                lista[j] = tmp;
            }
        }
    }

    private static void OrdenarPorMatriculaShellSort(Aluno[] lista) {
         Aluno tmp;
        int j;
        for(int gap = lista.length/2; gap > 0; gap /= 2){
            for(int i = gap; i < lista.length; i++){
                tmp = lista[i];
                for(j = i ; j >= gap && (tmp.getMatricula().compareToIgnoreCase(lista[j-gap].getMatricula())) < 0 ; j -= gap ){
                    lista[j] = lista[j - gap];
                }
                lista[j] = tmp;
            }
        }
    }
    
}

