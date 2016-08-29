package Exercicio11;

public class Pessoa {
    private String nome;
    private String descricao;
    private int respostas[];

    public Pessoa(String nome, int[] respostas) {
        this.nome = nome;
        this.respostas = respostas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int[] getRespostas() {
        return respostas;
    }

    public void setRespostas(int[] respostas) {
        this.respostas = respostas;
    }
    
    public String toString(){
        String saida=nome+" : ";
        
        for (int i = 0; i < respostas.length; i++) {
            
            saida += ", "+respostas[i];
            
        }
        
        return saida;
    }
    
}
