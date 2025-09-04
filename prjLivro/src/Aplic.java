import java.util.Scanner;
/**
 *
 * @author mhebe
 */
public class Aplic {
    public static void main(String[] args) {
        int opc, id, dias;
        String titulo;
        double  multa = 3.0;
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        System.out.println("Digite o ISBN do livro");
        id = entrada.nextInt();
        
        entrada.nextLine();
        System.out.println("Digite o Titulo do livro");
        titulo = entrada.nextLine();
        
        Livro objLivro = new Livro(id, titulo);
        objLivro.setValMultaDiaria(multa); 

        
        
        do{
            System.out.println("1 - Consultar Livro");
            System.out.println("2 - Emprestar Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Sair");
            System.out.println("\n\t Digite a opção: ");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("\n Titulo do Livro: " + objLivro.getTitulo());
                    System.out.println("\n Situação do Livro: ");
                        if(objLivro.getSituacao()){
                               System.out.println("Livro Indisponível");
                        } else {
                                System.out.println("Livro Disponível");
                        }
                    System.out.println("ISBN do Livro: " + objLivro.getIdentificacao());
                    break;
                case 2:
                    if(objLivro.getSituacao()){
                        System.out.println("O Livro está emprestado");
                    } else {
                        objLivro.emprestar();
                        System.out.println("Operação de empréstimo realizada com sucesso");
                    }
                    break;
                case 3:
                    if(objLivro.getSituacao()) {
                       System.out.println("insira os dias de atraso");
                        dias = entrada.nextInt();
                        multa = objLivro.devolver(dias);
                        System.out.println("\nOperação de devolução realizada com sucesso");
                        if(dias > 0){
                            System.out.println("Valor da multa em R$: " + multa);
                        }
                    } else {
                        System.out.println("O livro já está disponível");
                    }
            }
            
        }while(opc < 4);
    }
    
}
