package ExercicioOrdenar04;

public class Aluno {

    private String matricula;
    private String nome;
    private String ingresso;
    private String turno;
    private String matriz;

    public Aluno(String matricula, String nome, String ingresso, String turno, String Matriz) {
        this.matricula = matricula;
        this.nome = nome;
        this.ingresso = ingresso;
        this.turno = turno;
        this.matriz = Matriz;
    }
    
    public String toString(){
        return String.format(matricula+" : "+nome+" : "+ingresso+" : "+turno+" : "+matriz);
    }

    

    
    
    public Aluno() {
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngresso() {
        return ingresso;
    }

    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getMatriz() {
        return matriz;
    }

    public void setMatriz(String Matriz) {
        this.matriz = Matriz;
    }
    
    
    
}
