package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class FuncionarioHorista extends Funcionario{
    
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, double vht){
        super(r, n, dtAdm);
        valHorTrab = vht;
    }
    
    public void setQtdeHorTrab(int qht){
        qtdeHorTrab = qht;
    }
    
    //Aplicando o polimorfismo de calcular salário bruto.
    public double calcSalBruto(){
        return valHorTrab*qtdeHorTrab;
    }
    
    public double calcGratificacao(){
        return calcSalBruto()*0.075;
    }
    
    //Polimorfismo e utilizando método calcSalLiquido que já está 66,66% pronta, apenas adicionando a Gratificação.
    public double calcSalLiquido(){
        return super.calcSalLiquido() + calcGratificacao();
    }
}
