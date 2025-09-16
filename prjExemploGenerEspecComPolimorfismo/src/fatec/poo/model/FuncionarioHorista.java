package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class FuncionarioHorista extends Funcionario{
    
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, String c, double vht){
        super(r, n, dtAdm, c);
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
    
    public double calcSalLiquido(){
        return calcSalBruto()+calcGratificacao()-calcDesconto();
    }
}
