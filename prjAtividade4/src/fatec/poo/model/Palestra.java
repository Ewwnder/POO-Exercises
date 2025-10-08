package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class Palestra {
    
    private String data;
    private String tema;
    private double valor;
    private Palestrante palestrante;
    private Participante[] participantes;
    private int numParticipantes;
    

    public Palestra(String tema, double valor) {
        this.tema = tema;
        this.valor = valor;
        participantes = new Participante[3];
        numParticipantes = 0;
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public double getValor() {
        return valor;
    }
    
    public double calcTotalFaturado(){
        double total = 0;
        
        for(int i=0;i<numParticipantes;i++){
            double valorPg = valor;
            Participante p = participantes[i];
            
            switch(p.getTipo()){
                case 'E':
                    valorPg*=0.85;
                    break;
                case 'I':
                    valorPg*=0.80;
                    break;      
            }
            
            total+=valorPg;
        }
        
        return total;
    }
    
    public Palestrante getPalestrante(){
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
    
    public void addParticipantes(Participante p){
        participantes[numParticipantes] = p;
        numParticipantes++;
    }
    
    
}
