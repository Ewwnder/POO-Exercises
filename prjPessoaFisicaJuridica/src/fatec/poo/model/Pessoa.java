package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public abstract class Pessoa {
    
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    public Pessoa (String n, int ai){
        nome = n;
        anoInscricao = ai;
    }
    
    abstract public double calcBonus(int b);
    
    public void addCompras(double compra){
        totalCompras+=compra;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getAnoInscricao(){
        return anoInscricao;
    }
    
    public double getTotalCompras(){
        return totalCompras;
    }
}