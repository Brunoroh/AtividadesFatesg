package exerciciobuscar05;

import java.util.Scanner;

public class PrincipalProduto {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[11];
        Scanner teclado = new Scanner(System.in);
        
        boolean novoProduto = true;
        int i;
        
        for ( i = 0; i < 11/*produtos.length && novoProduto == true*/; i++) {
            Produto produto = new Produto();
            System.out.println("Digite codigo :");
            produto.setCodigo(teclado.nextInt());
//            System.out.println("Digite descrição :");
//            produto.setDescricao(teclado.next());
//            System.out.println("Digite o preço ");
//            produto.setPreco(teclado.nextDouble());
//            
//            System.out.println("Deseja inserir um novo produto? (y para sim)");
//            String texto = teclado.next();
            
//            if(!texto.equalsIgnoreCase("y")){
//                novoProduto = false;
//            }

            produtos[i] = produto;
        }
        
        ordenacaoBolha(produtos);
        
        System.out.println("Digite o Codigo que deseja buscar");
        int codigoProduto = teclado.nextInt();
        
        int qtdBin = buscaBinaria(produtos, codigoProduto);
        int qtdSeq = buscaSequencial(produtos, codigoProduto);
        
        System.out.println("Numero buscado : "+codigoProduto
        +"\n quantidade de comparações com metodo de busca binario "+qtdBin
        +"\n quantidade de comparações com metodo de busca sequencial "+qtdSeq);
        
        System.out.println("Digite o Codigo que deseja buscar");
        codigoProduto = teclado.nextInt();
        
        qtdBin = buscaBinaria(produtos, codigoProduto);
        qtdSeq = buscaSequencial(produtos, codigoProduto);
        
        System.out.println("Numero buscado : "+codigoProduto
        +"\n quantidade de comparações com metodo de busca binario "+qtdBin
        +"\n quantidade de comparações com metodo de busca sequencial "+qtdSeq);
        
        System.out.println("Digite o Codigo que deseja buscar");
        codigoProduto = teclado.nextInt();
        
        qtdBin = buscaBinaria(produtos, codigoProduto);
        qtdSeq = buscaSequencial(produtos, codigoProduto);
        
        System.out.println("Numero buscado : "+codigoProduto
        +"\n quantidade de comparações com metodo de busca binario "+qtdBin
        +"\n quantidade de comparações com metodo de busca sequencial "+qtdSeq);
        
    }

    private static void ordenacaoBolha(Produto[] produtos) {
        Produto aux;
        for (int i = produtos.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (produtos[j].getCodigo() > produtos[j+1].getCodigo()) {
                    aux = produtos[j];
                    produtos[j] = produtos[j + 1];
                    produtos[j + 1] = aux;
                }
            }
        }
    }
    
     private static int buscaSequencial(Produto[] produtos, int codigoProduto) {
        
        int i;
        for (i = 0; i < produtos.length ; i++) {
            if (codigoProduto == produtos[i].getCodigo()) {
                return i;
            }else if(codigoProduto < produtos[i].getCodigo()){
                
                return -1;
            }
        }
        
        return -1;
        
    }
     
     private static int buscaBinaria(Produto[] produtos, int codigoProduto) {
        
        int inicio = 0;
        int fim = produtos.length;
        int meio = (inicio+fim)/2;
        boolean localizador = false;
        int i;
        for (i = 0; inicio <= fim && localizador == false; i++) {
            if(produtos[meio].getCodigo() == codigoProduto){
                localizador = true;
            }else{
                if(codigoProduto < produtos[meio].getCodigo()){
                    fim = meio -1;
                }else{
                    inicio = meio+1;
                }
                meio = (inicio+fim)/2;
            }
        }
        
        if(localizador){
            return i;
        }else{
            return -1;
        }
        
    }
}
