/**
 *
 * @author Nicolas Ap
 */
public class Livro {

    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;
    
    public Livro (int ident, String tit){
        identificacao = ident;
        titulo = tit;
        situacao = false;
    }
    
    public void setValMultaDiaria(double valMultDia){
        valMultaDiaria = valMultDia;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public boolean getSituacao(){
        return situacao;
    }
    
    public void emprestar(){
        if(!situacao){
            situacao = true;
        }
    }
    
    public double devolver(int diasAtraso){
        if (situacao){
            situacao = false;
            
            if (diasAtraso>0){
                return diasAtraso*valMultaDiaria;
            }
            else{
                return 0.0;
            }
        }
        else{
            return 0.0;
        }
    }
}
