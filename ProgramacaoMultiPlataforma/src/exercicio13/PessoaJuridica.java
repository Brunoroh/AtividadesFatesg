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
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    private String inscrEstadual;
    private String inscrMunicipal;

    public PessoaJuridica(){
        
        System.out.println("Classe PessoaJuridica");
    }
    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String inscrEstadual, String inscrMunicipal){
        super(nome, endereco, telefone);
        
        this.cnpj = cnpj;
        this.inscrEstadual = inscrEstadual;
        this.inscrMunicipal = inscrMunicipal;
        
        
    }
    
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the inscrEstadual
     */
    public String getInscrEstadual() {
        return inscrEstadual;
    }

    /**
     * @param inscrEstadual the inscrEstadual to set
     */
    public void setInscrEstadual(String inscrEstadual) {
        this.inscrEstadual = inscrEstadual;
    }

    /**
     * @return the inscrMunicipal
     */
    public String getInscrMunicipal() {
        return inscrMunicipal;
    }

    /**
     * @param inscrMunicipal the inscrMunicipal to set
     */
    public void setInscrMunicipal(String inscrMunicipal) {
        this.inscrMunicipal = inscrMunicipal;
    }
    
    
}
