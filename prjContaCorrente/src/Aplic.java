import java.util.Scanner;
/**
 *
 * @author mhebe
 */
public class Aplic {

    public static void main(String[] args) {
        int numero, opcao;
        double saldo, saque, deposito;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número da conta: ");
        numero = entrada.nextInt();
        
        System.out.println("Digite o saldo inicial: ");
        saldo = entrada.nextDouble();
        
        ContaCorrente objCont = new ContaCorrente(numero, saldo);
        
        do{
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - sair");
            
            System.out.println("\t" + "\n" + "Digite a opção: ");
            opcao = entrada.nextInt();
            
            System.out.println("\n Número da conta: " + objCont.getNumero());
            if(opcao == 1){
                System.out.println("Digite o valor a ser depositado: ");
                deposito = entrada.nextDouble();
                objCont.deposito(deposito);
                System.out.println("\n Saldo final: " + objCont.getSaldo() + "\n");
                
            } else if(opcao == 2) {
                System.out.println("\n Digite o valor que deseja sacar: " + "\n");
                saque = entrada.nextDouble();
                    if(saque > saldo){
                        System.out.println("\n Saldo insuficinete 😢" + "\n");
                    } else {
                        objCont.sacar(saque);
                        System.out.println("\n Saldo Final: " + objCont.getSaldo() + "\n");
                    }
            } else if(opcao == 3) {
                System.out.println("\n Seu saldo é de: " + objCont.getSaldo() + "\n");
            }
        } while(opcao < 4);
        
        
    }
    
}
