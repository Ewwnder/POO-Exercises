package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class Pessoa {
    
    private String nome;
    private String telefone;
    
    public Pessoa (String n, String tel){
        nome = n;
        telefone = tel;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
}
