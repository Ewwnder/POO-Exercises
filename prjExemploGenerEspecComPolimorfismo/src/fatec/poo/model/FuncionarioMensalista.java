package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dtAdm, String c, double vsm){
        super(r,n,dtAdm, c);
        valSalMin = vsm;
    }
    
    public void setNumSalMin(double nsl){
        numSalMin = nsl;
    }
    
    public double calcSalBruto(){
        return valSalMin*numSalMin;
    }
}
