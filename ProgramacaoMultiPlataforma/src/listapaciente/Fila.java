package listapaciente;

public class Fila {
    private Paciente inicio;
    private Paciente fim;
    private int qdePacientes;
    
    public Fila(){
        inicio = null;
        fim = null;
        qdePacientes = 0;
    }
    
    public boolean vazia(){
        return inicio == null;
    }
    
    public void enfileirar(Paciente p){
        qdePacientes++;
        p.setProximo(null);
        if(vazia()){
            inicio = p;
        }else{
            fim.setProximo(p);
        }
        
        fim = p;
    }
    
    public void desinfilerar(){
        qdePacientes--;
        inicio = inicio.getProximo();
    }
    
    public Paciente mostrarProximo(){
        
        return inicio;
        
    }
    
    
}
