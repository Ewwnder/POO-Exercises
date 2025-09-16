package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public abstract class Funcionario {
    
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    public Funcionario(int r, String n, String dtAdm, String c){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
        cargo = c;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return 0.10*calcSalBruto();
    }
    
    public double calcSalLiquido(){
        return calcSalBruto()-calcDesconto();
    }
    
    public int getRegistro(){
        return registro;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDtAdmissao(){
        return dtAdmissao;
    }
    
    public String getCargo(){
        return cargo;
    }
}
