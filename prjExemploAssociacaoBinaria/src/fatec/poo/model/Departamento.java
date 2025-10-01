package fatec.poo.model;

/**
 *
 * @author Nicolas Ap
 */
public class Departamento {
    
    private String sigla;
    private String nome;
    private Funcionario funcionarios[]; //multiplicidade 1..*
    private int numFunc;
    
    

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
        numFunc = 0; // Indica a posição do primeiro elemento na matriz
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }   
    
    
    //Tem como parâmetro de entrada o endereço de um objeto da classe FuncionarioHorista ou FuncionarioMensalista ou Funcionario Comissionado
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionario(){
        System.out.println("\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. de Funcionários: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for(int cont=0;cont<numFunc;cont++){
            System.out.print(funcionarios[cont].getRegistro() + "\t\t");
            System.out.print(funcionarios[cont].getNome()  + "\t\t");
            System.out.print(funcionarios[cont].getCargo() + "\n");

        }
    }
}

