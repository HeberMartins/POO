

/**
 *
 * @author mhebe
 */
public class Aplic {


    public static void main(String[] args) {
         
        Retangulo objRet; //definição do ponteiro
        
        //instanciação(alocação) de um objeto da classe Retnagulo
        objRet = new Retangulo();
        
        //implementando o caso de montar figuras
        //Geométrica do Retangulo
        objRet.setAltura(5.0); //passando menssagens pro objeto
        objRet.setBase(8.0);
       
        
        System.out.println("Medida da altura:" + objRet.getAltura());
        System.out.println("Medida da base:" + objRet.getBase());
        
        //implementando o caso de consultar área
        //Geométrica do Retangulo
        System.out.println("Medida da área:" + objRet.calcArea());
        
        //implementando o caso de consultar perimetro
        //Geométrica do Retangulo
        System.out.println("Medida do perimetro:" + objRet.calcPerimetro());
        
        //implementando o caso de calcular diagonal
        //Geométrica do Retangulo
        System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
    }
    
}
