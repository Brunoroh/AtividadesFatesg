package listacircular;

public class Pessoa {
    private String nome;
    private long cpf;
    private int telefone;
    private Pessoa proximo;

    public Pessoa(String nome, long cpf, int telefone, Pessoa proximo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.proximo = proximo;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Pessoa getProximo() {
        return proximo;
    }

    public void setProximo(Pessoa proximo) {
        this.proximo = proximo;
    }
    
    public String toString(){
        return String.format("%s, %d e %d",nome,cpf,telefone);
    }
    
}
