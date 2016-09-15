package exercicio13;

import java.time.LocalDate;
import java.util.Calendar;



/**
 *
 * @author Thiago
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pessoa pessoa = new Pessoa("thiago", "rua", "99999999");
       
        PessoaFisica pessoa2;
        
        Calendar calendar = Calendar.getInstance();
        
        LocalDate date = LocalDate.now();
        
        pessoa2 = new PessoaFisica("thiago", "rua", "99999999", "02165072190", "5112482" , date);
        
        PessoaJuridica pj = new PessoaJuridica("thiago", "rua", "99999999", "11100001-111", "123456", "123123");
        
        Pessoa pessoa3 = new Pessoa();
        
        PessoaFisica pf3 = new PessoaFisica();
        
        PessoaJuridica pj3 = new PessoaJuridica();
        
        
    }
    
}
