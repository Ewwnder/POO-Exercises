package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class Cliente extends Pessoa{
    
    private String cpf;
    private double peso;
    private double altura;
    
    public Cliente(String c, String n, String tel){
        super(n, tel);
        cpf = c;
    }
    
    public void setPeso(double p){
        peso = p;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public double getAltura(){
        return altura;
    }
}

