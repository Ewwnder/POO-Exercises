package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class FuncionarioComissionado extends Funcionario {
    
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado (int r, String n, String dtAdm, double txc){
        super(r,n,dtAdm);
        taxaComissao = txc/100.0;
    }
  
    public void setSalBase(double ssb){
        salBase = ssb;
    }
    
    public double getSalBase(){
        return salBase;
    }
    
    public double getTotalVendas(){
        return totalVendas;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    public void addVendas(double vendas){
        totalVendas+=vendas;
    }
    
    public double calcSalBruto(){
        return salBase + totalVendas*taxaComissao;
    }
    
    public double calcGratificacao(){
        if (totalVendas>10000){
            return 0.05*calcSalBruto();
        }
        else if (totalVendas>5000){
            return 0.03*calcSalBruto();
        }
        else{
            return 0.0;
        }
    }
    
    public double calcSalLiquido(){
        return super.calcSalLiquido()+calcGratificacao();
    }
    
}
