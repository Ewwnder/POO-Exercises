
import fatec.poo.model.Palestra;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Participante;
import java.text.DecimalFormat;

/**
 *
 * @author Nicolas Ap
 */
public class Aplic {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Palestrante palestrante1 = new Palestrante("111.111.111-11", "Adilson Pest'Anna", "Bananinha Corp");
        palestrante1.setTaxaCobranca(85);
        
        Participante p1 = new Participante("222.222.222-22", "Bruno Lucas", 'E');
        Participante p2 = new Participante("333.333.333-33", "Joana Silva", 'I');
        Participante p3 = new Participante("444.444.444-44", "Sérgio Pereira", 'C');
        Participante p4 = new Participante("555.555.555-55", "Milena Santos", 'C');
        Participante p5 = new Participante("666.666.666-66", "Cesar Ferreira", 'E');
        
        Palestra palestra1 = new Palestra("Introdução a Grafos Avançados", 5000);
        palestra1.setData("08/10/2025");
        palestra1.addParticipantes(p1);
        palestra1.addParticipantes(p2);
        palestra1.addParticipantes(p3);
        
        Palestra palestra2 = new Palestra("Algoritmo Djikistra", 300);
        palestra2.setData("09/10/2025");
        palestra2.addParticipantes(p4);
        palestra2.addParticipantes(p5);
        
        palestrante1.addPalestras(palestra1);
        palestrante1.addPalestras(palestra2);
        
        System.out.println("CPF palestrante: " + palestrante1.getCpf());
        System.out.println("Nome: " + palestrante1.getNome());
        System.out.println("Taxa de Cobrança: " + df.format(palestrante1.getTaxaCobranca()) + " %");
        System.out.println("Valor total a receber pelas palestras: " + df.format(palestrante1.calcTotalReceberPalestras()));
        
    }
    
}
    