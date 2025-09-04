package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class Instrutor extends Pessoa{
    
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int i, String n, String tel){
        super(n, tel);
        identificacao = i;
    }
    
    public void setAreaAtuacao(String area){
        areaAtuacao = area;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    
    public String getAreaAtuacao(){
        return areaAtuacao;
    }
    
}
