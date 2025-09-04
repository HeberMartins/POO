import java.util.Scanner;
/**
 *
 * @author mhebe
 */
public class Aplic {

  
    public static void main(String[] args) {
        double medAlt, medBase;
        int opcao;
        Retangulo objRet;
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        System.out.print("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble();
        
        System.out.print("Digite a medida da base do retângulo: ");
        medBase = entrada.nextDouble();
        
        //instanciando um objeto de classe retangulo
        objRet = new Retangulo();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("1 - Consultar Medida Área");
            System.out.println("2 - Consultar Medida Perimetro");
            System.out.println("3 - Consultar Medida Diagonal");
            System.out.println("4 - Encerrar");
            System.out.print("\n\t");
            opcao = entrada.nextInt(); 
            
            if(opcao == 1){
                System.out.println("\n" + "Medida da aréa: " + objRet.calcArea() + "\n");
            } else if (opcao == 2){
                System.out.println("\n" + "Medida do perimetro: " + objRet.calcPerimetro() + "\n");
            } else if (opcao == 3){
                System.out.println("\n" + "Medida da diagonal: " + objRet.calcDiagonal() + "\n");
            } else {
                System.out.println("\n" + "Programa Encerrado" + "\n");
            }
           
        }while(opcao < 4);
    }
    
}
