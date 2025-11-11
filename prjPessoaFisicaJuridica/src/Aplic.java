import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 *
 * @author Nicolas Ap
 */
public class Aplic {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        PessoaFisica objPessoaFisica = new PessoaFisica("Milena Santos", 2020, "111.111.111-11");
        objPessoaFisica.addCompras(1000);
        objPessoaFisica.addCompras(11001);
        objPessoaFisica.setBase(10);
        
        PessoaJuridica objPessoaJuridica = new PessoaJuridica("Rodrigo Sofia", 2010, "11.111.111/0001-11");
        objPessoaJuridica.addCompras(1000);
        objPessoaJuridica.addCompras(5000);
        objPessoaJuridica.setTaxaIncentivo(10);
        
        int anoAtual = 2025;
        
        System.out.println("== Pessoa Física ==");
        System.out.println("Nome: " + objPessoaFisica.getNome());
        System.out.println("CPF: " + objPessoaFisica.getCpf());
        System.out.println("Ano de Inscrição: " + objPessoaFisica.getAnoInscricao());
        System.out.println("Total Compras: R$ " + df.format(objPessoaFisica.getTotalCompras()));
        System.out.println("Base: R$ " + df.format(objPessoaFisica.getBase()));
        System.out.println("Bônus: R$ " + df.format(objPessoaFisica.calcBonus(anoAtual)));
        
        System.out.println("\n== Pessoa Jurídica ==");
        System.out.println("Nome: " + objPessoaJuridica.getNome());
        System.out.println("CGC: " + objPessoaJuridica.getCgc());
        System.out.println("Ano de Inscrição: " + objPessoaJuridica.getAnoInscricao());
        System.out.println("Total Compras: R$ " + df.format(objPessoaJuridica.getTotalCompras()));
        System.out.println("Taxa de Incentivo: " + df.format(objPessoaJuridica.getTaxaIncentivo() * 100) + "%");
        System.out.println("Bônus: R$ " + df.format(objPessoaJuridica.calcBonus(anoAtual)));
    }
    
}