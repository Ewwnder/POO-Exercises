
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 *
 * @author Nicolas Ap
 */
public class Aplic {

    public static void main(String[] args) {
        
        FuncionarioHorista objFunHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1999", "Desenvolvedor", 15.80);
        
        objFunHor.setQtdeHorTrab(90);
        
        System.out.println("--Funcionário Horista--\n");
        System.out.println("Registro: " + objFunHor.getRegistro());
        System.out.println("Nome: " + objFunHor.getNome());
        System.out.println("Data Admissão: " + objFunHor.getDtAdmissao());
        System.out.println("Cargo: " + objFunHor.getCargo());
        System.out.println("Salário Bruto => " + objFunHor.calcSalBruto());
        System.out.println("Desconto => " + objFunHor.calcDesconto());
        System.out.println("Gratificaçao => " + objFunHor.calcGratificacao());
        System.out.println("Salário Líquido => " + objFunHor.calcSalLiquido());
        System.out.println("");
        
        FuncionarioMensalista objFunMen = new FuncionarioMensalista(2020, "Milena Santos", "17/08/2000", "Setor Financeiro", 1500.50);
        
        objFunMen.setNumSalMin(4);
        
        System.out.println("\n--Funcionário Mensalista--\n");
        System.out.println("Registro: " + objFunMen.getRegistro());
        System.out.println("Nome: " + objFunMen.getNome());
        System.out.println("Data Admissão: " + objFunMen.getDtAdmissao());
        System.out.println("Cargo: " + objFunMen.getCargo());
        System.out.println("Salário Bruto => " + objFunMen.calcSalBruto());
        System.out.println("Desconto => " + objFunMen.calcDesconto());
        System.out.println("Salário Líquido => " + objFunMen.calcSalLiquido());
        
    }
    
}
