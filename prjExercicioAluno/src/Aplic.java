import java.util.Scanner;
/**
 *
 * @author mhebe
 */
public class Aplic {

    public static void main(String[] args) {
        int opcao, RA;
        double P1, P2, T1, T2;
        Aluno objAl;
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        System.out.println("Digite seu RA: ");
        RA = entrada.nextInt();
        
        entrada = new Scanner(System.in);
        System.out.println("Digite sua nota da P1: ");
        P1 = entrada.nextDouble();
        
        entrada = new Scanner(System.in);
        System.out.println("Digite sua nota da P2: ");
        P2 = entrada.nextDouble();
        
        entrada = new Scanner(System.in);
        System.out.println("Digite sua nota do T1: ");
        T1 = entrada.nextDouble();
        
        entrada = new Scanner(System.in);
        System.out.println("Digite sua nota do T2: ");
        T2 = entrada.nextDouble();
        
        objAl = new Aluno();
        objAl.setRA(RA);
        objAl.setNtPrv1(P1);
        objAl.setNtPrv2(P2);
        objAl.setNtTrab1(T1);
        objAl.setNtTrab2(T2);
        objAl.isAprovado();
        
     do{
            System.out.println("\n" + "1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            System.out.print("\n\t Digite a opção: ");
            opcao = entrada.nextInt(); 
            
            if(opcao == 1){
                System.out.println("\n" + "Seu RA: " + RA + "\n");
                System.out.println("Nota da Primeira Prova(P1): " + P1 + "\n");
                System.out.println("Nota da Segunda Prova(P2): " + P2 + "\n");
                System.out.println("Nota do Primeiro Trabalho(T1): " + T1 + "\n");
                System.out.println("Nota do Segundo Trabalho(T2): " + T2 + "\n");
            } else if (opcao == 2){
                System.out.println("\n" + "Seu RA: " + RA + "\n");
                System.out.println("Medida dos Trabalhos: " + objAl.calcMediaTrab() + "\n");
                System.out.println("Medida das Provas: " + objAl.calcMediaProva() + "\n");
            } else if (opcao == 3){
                System.out.println("\n" + "Seu RA: " + RA + "\n");
                System.out.println("Medida Final: " + objAl.calcMediaFinal() + "\n");
                if (objAl.isAprovado()) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
            } else {
                System.out.println("\n" + "Programa Encerrado" + "\n");
            }
           
        }while(opcao < 4);
    }
    
}
