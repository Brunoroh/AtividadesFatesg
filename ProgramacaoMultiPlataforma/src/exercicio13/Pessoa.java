/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

/**
 *
 * @author Thiago
 */
public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telfone;

   
    public Pessoa(){
        
        System.out.println("Classe Pessoa");
    }
    
    public Pessoa(String nome, String endereco, String telefone){
        
        this.nome = nome;
        this.endereco = endereco;
        this.telfone = telefone;
        
        
        
        
    }
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telfone
     */
    public String getTelfone() {
        return telfone;
    }

    /**
     * @param telfone the telfone to set
     */
    public void setTelfone(String telfone) {
        this.telfone = telfone;
    }
    
    public double CalcularEmpostoDeRenda(){
        
       double i;
       i= 10;
       return i;
    }
    
    
}
