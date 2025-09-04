
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;

/**
 *
 * @author Nicolas
 */
public class Aplic {
    public static void main(String[] args) {
        
        Instrutor objInstrutor = new Instrutor(1010, "Milena Santos", "(11) 99999-9999");
        
        Cliente objCliente = new Cliente("111.111.111-11", "João Aparecido", "(11) 11111-1111");
        
        objInstrutor.setAreaAtuacao("Informática");
        
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("Identificação: " + objInstrutor.getIdentificacao());
        System.out.println("Área de atuação: " + objInstrutor.getAreaAtuacao());
        
        objCliente.setAltura(1.85);
        objCliente.setPeso(75);
        
        System.out.println("\nNome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("CPF: " + objCliente.getCpf());
        System.out.println("Peso: " + objCliente.getPeso() + " kg");
        System.out.println("Altura: " + objCliente.getAltura() + " m");

    }
    
}
