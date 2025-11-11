package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class PessoaJuridica extends Pessoa {
    
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String n, int ai, String c){
        super(n, ai);
        cgc = c;
    }
    
    public double calcBonus(int anoAtual){
        int ano = anoAtual-getAnoInscricao();
        return ano * (getTotalCompras()*taxaIncentivo);
    }
    
    public String getCgc(){
        return cgc;
    }
    
    public void setTaxaIncentivo(double tx){
        taxaIncentivo = tx/100.0;
    }
    
    public double getTaxaIncentivo(){
        return taxaIncentivo;
    }
    
}