
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat; //Fazemos o import de algo que já vem com o JDK

/**
 *
 * @author Nicolas Ap
 */
public class Aplic {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00"); //Classe DecimalFormat para deixar no formato brasileiro
        
        FuncionarioHorista objFunHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1999", 15.80);
        
        objFunHor.setQtdeHorTrab(90);
        objFunHor.setCargo("Desenvolvedor");
        
        System.out.println("--Funcionário Horista--\n");
        System.out.println("Registro: " + objFunHor.getRegistro());
        System.out.println("Nome: " + objFunHor.getNome());
        System.out.println("Data Admissão: " + objFunHor.getDtAdmissao());
        System.out.println("Cargo: " + objFunHor.getCargo());
        System.out.println("Salário Bruto => " + df.format(objFunHor.calcSalBruto())); //Antes de chamar os métodos colocamos o df.format("método")
        System.out.println("Desconto => " + df.format(objFunHor.calcDesconto()));
        System.out.println("Gratificaçao => " + df.format(objFunHor.calcGratificacao()));
        System.out.println("Salário Líquido => " + df.format(objFunHor.calcSalLiquido()));
        
        FuncionarioMensalista objFunMen = new FuncionarioMensalista(2020, "Milena Santos", "17/08/2000", 1500.50);
        
        objFunMen.setNumSalMin(4);
        objFunMen.setCargo("Gerente de Equipe");
        
        System.out.println("\n--Funcionário Mensalista--\n");
        System.out.println("Registro: " + objFunMen.getRegistro());
        System.out.println("Nome: " + objFunMen.getNome());
        System.out.println("Data Admissão: " + objFunMen.getDtAdmissao());
        System.out.println("Cargo: " + objFunMen.getCargo());
        System.out.println("Salário Bruto => " + df.format(objFunMen.calcSalBruto()));
        System.out.println("Desconto => " + df.format(objFunMen.calcDesconto()));
        System.out.println("Salário Líquido => " + df.format(objFunMen.calcSalLiquido()));
        
        FuncionarioComissionado objFunCom = new FuncionarioComissionado(3030, "Francisco Amaral", "15/01/1981", 8.0);
        
        objFunCom.setCargo("Engenheiro Elétrico");
        objFunCom.setSalBase(2000.0);
        objFunCom.addVendas(7500);
        
        System.out.println("\n--Funcionário Comissionado--\n");
        System.out.println("Registro: " + objFunCom.getRegistro());
        System.out.println("Nome: " + objFunCom.getNome());
        System.out.println("Data Admissão: " + objFunCom.getDtAdmissao());
        System.out.println("Cargo: " + objFunCom.getCargo());
        System.out.println("Salário Bruto => " + df.format(objFunCom.calcSalBruto()));
        System.out.println("Desconto => " + df.format(objFunCom.calcDesconto()));
        System.out.println("Gratificação => " + df.format(objFunCom.calcGratificacao()));
        System.out.println("Salário Líquido => " + df.format(objFunCom.calcSalLiquido()));
        
    }
    
}
