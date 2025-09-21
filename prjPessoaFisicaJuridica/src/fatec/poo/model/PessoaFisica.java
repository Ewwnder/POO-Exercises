package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private double base;
    
    public PessoaFisica(String n, int ai, String c){
        super(n, ai);
        cpf = c;
    }
    
    public double calcBonus(int anoAtual){
        if (getTotalCompras()>12000){
            int ano = anoAtual-getAnoInscricao();
            return ano*base;
        }
        
        return 0;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public double getBase(){
        return base;
    }
    
}
