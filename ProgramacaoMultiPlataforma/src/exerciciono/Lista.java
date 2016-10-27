package exerciciono;

public class Lista {
        private NumeroInteiro inicio;
        private NumeroInteiro fim;
        
        public Lista(){
            inicio = null;
            fim = null;
        }
        
        public boolean listaVazia(){
            
            return (inicio == null);
        
        }
        
        public void insereInicio(NumeroInteiro numero){
            if(listaVazia()){
            this.inicio = numero;
            this.fim = numero;
            }else{
                numero.setProximo(inicio);
                inicio = numero;
            }
        }
        
        public void insereFim(NumeroInteiro numero){
            if(listaVazia()){
                this.inicio = numero;
                this.fim = numero;
            }else{
                fim.setProximo(numero);
                fim = numero;
            }
        }
        
        public void insereOrdenado(NumeroInteiro numero){
            if(listaVazia()){
                insereInicio(numero);
                return;
            }
            
            NumeroInteiro ant = null;
            NumeroInteiro pro = inicio;
            
            while(pro != null && pro.getNumero() < numero.getNumero()){
                ant = pro;
                pro = pro.getProximo();
            }
            
            if(pro == null){
                insereFim(numero);
            }else{
                if(ant == null){
                insereInicio(numero);
                
                }else{
                
                ant.setProximo(numero);
                numero.setProximo(pro);
}
            }
            
            
            
        }
        
        public void mostraLista(){
            NumeroInteiro aux = inicio;
            System.out.println("Elementos da lista");
            if(listaVazia()){
                System.out.println("Lista vazia");
            }
            while(aux != null){
                System.out.printf("%d\t",aux.getNumero());
                aux = aux.getProximo();
            }
        }
}
