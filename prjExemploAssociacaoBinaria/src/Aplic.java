
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 *
 * @author Nicolas Ap
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                      "Joao Mendes",
                                                                      "10/12/1975",
                                                                      10);
        
        
        Departamento dep1 = new Departamento ("CP", "Compras");
        Departamento dep2 = new Departamento ("RH", "Recursos Humanos");
        
        funcHor.setCargo("Programador");
        funcMen.setCargo("Aux. Administrativo");
        funcCom.setCargo("Vendedor");
     
        //Estabelece a associação entre um objeto da classse FuncionárioHorista
        //com um objeto da classe Departamento
        
        funcHor.setDepartamento(dep1);
        System.out.println("O funcionario horista: " + funcHor.getNome() + " trabalha no departamento de: " + funcHor.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classse FuncionárioMensalista
        //com um objeto da classe Departamento
        
        funcMen.setDepartamento(dep1);
        System.out.println("O funcionário mensalista: " + funcMen.getNome() + " trabalha no departamento de: " + funcMen.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classse FuncionárioComissionado
        //com um objeto da classe Departamento
        
        funcCom.setDepartamento(dep2);
        System.out.println("O funcionário comissionado: " + funcCom.getNome() + " trabalha no departamento de: " + funcCom.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto das classes FuncionarioHorista e FuncionarioMensalista
        
        dep1.addFuncionario(funcHor);
        
        dep1.addFuncionario(funcMen);
        
        dep1.listarFuncionario();
    
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto da classe FuncionarioComissionado
        
        dep2.addFuncionario(funcCom);
        
        dep2.listarFuncionario();
      
    
    }    
}

