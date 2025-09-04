/**
 *
 * @author mhebe
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    
    public ContaCorrente(int nrm, double sald){
        numero = nrm;
        saldo = sald;
    }
    
    public int getNumero(){
        return(numero);
    }
    
    public double getSaldo(){
        return(saldo);
    }
    
    public void sacar(double sac){
        saldo = saldo - sac;
    }
    
    public void deposito(double dep){
        saldo = saldo + dep;
    }
}
