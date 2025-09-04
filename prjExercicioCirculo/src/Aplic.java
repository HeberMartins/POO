import java.util.Scanner;
/**
 *
 * @author mhebe
 */
public class Aplic {

    public static void main(String[] args) {
        double medRaio;
        int opcao;
        Circulo objCir;
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        System.out.print("Digite a medida do raio: ");
        medRaio = entrada.nextDouble();
        
        objCir = new Circulo();
        objCir.setRaio(medRaio);
        
        do{
            System.out.println("1 - Consultar Medida Área");
            System.out.println("2 - Consultar Medida Perimetro");
            System.out.println("3 - Consultar Medida Diametro");
            System.out.println("4 - Encerrar");
            System.out.print("\n\t");
            opcao = entrada.nextInt(); 
            
            if(opcao == 1){
                System.out.println("\n" + "Medida da aréa: " + objCir.calcArea() + "\n");
            } else if (opcao == 2){
                System.out.println("\n" + "Medida do perimetro: " + objCir.calcPerimetro() + "\n");
            } else if (opcao == 3){
                System.out.println("\n" + "Medida do Diametro: " + objCir.calcDiametro() + "\n");
            } else {
                System.out.println("\n" + "Programa Encerrado" + "\n");
            }
           
        }while(opcao < 4);
        
    }
    
}
