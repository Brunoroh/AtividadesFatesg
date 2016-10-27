
package listacircular;


public class ListaCircular {
    private Pessoa fim;

    public ListaCircular() {
        fim = null;
    }
    
    public boolean vazia(){
        return fim == null;
    }
    
    public void insereFim(Pessoa p){
        if(vazia()){
            fim = p;
            p.setProximo(fim);
        }else{
            p.setProximo(fim.getProximo());
            fim.setProximo(p);
            fim = p;
        }
    }
    
    public void removeInicio(){
        if(vazia()){
            System.out.println("Lista Vazia");
        }else{
            fim.setProximo(fim.getProximo().getProximo());
        }
    }
    
    public void MostraLista(){
        Pessoa aux;
        if(vazia()){
            System.out.println("Lista Vazia");
        }else{
            aux = fim.getProximo();
            while(aux != fim){
                System.out.println(aux);
                aux = aux.getProximo();
            }
            System.out.println(fim);
        }
    }    
    
    
}
