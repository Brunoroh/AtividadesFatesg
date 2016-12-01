package listapaciente;

public class Paciente {
    private String nome;
    private int cpf;
    private int fone;
    private String email;
    private Paciente proximo;

    public Paciente(int cpf) {
        this.cpf = cpf;
    }
    
    public Paciente() {
    }


    public Paciente(String nome, int cpf, int fone, String email, Paciente proximo) {
        this.nome = nome;
        this.cpf = cpf;
        this.fone = fone;
        this.email = email;
        this.proximo = proximo;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Paciente getProximo() {
        return proximo;
    }

    public void setProximo(Paciente proximo) {
        this.proximo = proximo;
    }
    
}
