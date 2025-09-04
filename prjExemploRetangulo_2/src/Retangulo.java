
/**
 *
 * @author Heber
 */
public class Retangulo {
    private double altura;
    private double base;
    
    
    //retorna o contéudo do método Altura
    public double getAltura(){
        return(altura);
    }
    
    //tem como parâmetro a medida da altura    
    public void setAltura(double a){
        altura = a;
    }
    
    //retorna o contéudo do método Base
    public double getBase(){
        return(base);
    }
    
    //tem como parâmetro a medida da base  
    public void setBase(double b){
        base = b;
    }
    
    public double calcArea(){
        return(altura * base);
    }
    
    public double calcPerimetro(){
        return(2 * (altura + base));
    }
    
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(altura, 2)+ Math.pow(base, 2)));
    }
}
