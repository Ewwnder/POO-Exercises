/**
 *
 * @author Nicolas Ap
 */

import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int identLivro, opcao;
        String titLivro;
        double valMultDia;
        
        System.out.print("Informe a identificação do livro: ");
        identLivro = entrada.nextInt();
        
        System.out.print("Informe o título do livro: ");
        titLivro = entrada.next();
        
        Livro objLivro = new Livro(identLivro, titLivro);
        
        System.out.print("Informe o valor da multa diária: ");
        valMultDia = entrada.nextDouble();
        objLivro.setValMultaDiaria(valMultDia);

        do{
            System.out.println("\n1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            
            System.out.print("\n\tInforme a opção desejada: ");
            opcao = entrada.nextInt();
            
            switch (opcao){
                case 1:
                    System.out.println("\nIdentificação do livro: " + objLivro.getIdentificacao());
                    System.out.println("Título do livro: " + objLivro.getTitulo());
                    System.out.println("Situação do livro: " + (objLivro.getSituacao() ? "Emprestado":"Disponível"));
                    break;
                
                case 2:
                    if (objLivro.getSituacao()){
                        System.out.println("\nO livro está emprestado");
                    }
                    else{
                        objLivro.emprestar();
                        System.out.println("\nOperação de empréstimo realizada com sucesso.");
                    }
                    break;
                
                case 3:
                    if (!objLivro.getSituacao()){
                        System.out.println("\nO livro já está disponível");
                    }
                    else{
                        System.out.print("\nInforme a quantidade de dias em atraso: ");
                        int diaAtraso = entrada.nextInt();
                        double valorMulta = objLivro.devolver(diaAtraso);
                        
                        System.out.println("\nOperação de devolução realizada com sucesso.");
                        
                        if (valorMulta>0){
                            System.out.println("Valor da multa a pagar: R$ " + valorMulta);
                        }
                    }
            }
            
        }while (opcao<4);
        
    }
    
}
