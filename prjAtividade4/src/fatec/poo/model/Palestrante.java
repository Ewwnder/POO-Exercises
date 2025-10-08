package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class Palestrante extends Pessoa{
    private String empresa;
    private double taxaCobranca;
    private Palestra[] palestras;
    private int numPalestras;

    public Palestrante(String empresa, String cpf, String nome) {
        super(cpf, nome);
        this.empresa = empresa;
        palestras = new Palestra[2];
        numPalestras = 0;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }

    public void setTaxaCobranca(double taxaCobranca) {
        this.taxaCobranca = taxaCobranca;
    }
    
    public double calcTotalReceberPalestras(){
        double total = 0;
        
        for(int i=0;i<numPalestras;i++){
            total+=palestras[i].calcTotalFaturado();
        }
        
        return total*(taxaCobranca/100.0);
    }
    
    public void addPalestras(Palestra p){
        palestras[numPalestras] = p;
        numPalestras++;
    }

}
