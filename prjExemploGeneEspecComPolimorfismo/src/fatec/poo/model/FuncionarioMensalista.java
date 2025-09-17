package fatec.poo.model;

/**
 *
 * @author mhebe
 */
public class FuncionarioMensalista extends Funcionario {
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dt, double vlm){
        super(r, n, dt);
        valSalMin = vlm;
    }
    
    public void setNumSalMin(double sm){
        numSalMin = sm;
    }
    
    public double calcSalBruto(){
        return(valSalMin * numSalMin);
    }
}
