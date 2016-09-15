/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author Thiago
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private String rg;
    private LocalDate datanascimento;

    
    public PessoaFisica(){
        
        System.out.println("Classe PessoaFisica ");
        
    }
    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String rg, LocalDate dataNascimento){
        
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.datanascimento = dataNascimento;
        this.rg = rg;
        
         
    }
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the datanascimento
     */
    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    /**
     * @param datanascimento the datanascimento to set
     */
    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }
    
    
}
