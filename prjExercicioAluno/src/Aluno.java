
/**
 *
 * @author mhebe
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    private boolean isAprovado;
    
    public void setRA(int ra){
        RA = ra;
    }
    
    public void setNtPrv1(double P1){
        NtPrv1 = P1;
    }
    
    public void setNtPrv2(double P2){
        NtPrv2 = P2;
    }
    
    public void setNtTrab1(double T1){
        NtTrab1 = T1;
    }
    
    public void setNtTrab2(double T2){
        NtTrab2 = T2;
    }
    
    public int getRA (){
        return(RA);
    }
    
    public double getNtPrv1(){
        return(NtPrv1);
    }
    
    public double getNtPrv2(){
        return(NtPrv2);
    }
    
    public double getNtTrab1(){
        return(NtTrab1);
    }
    
    public double getNtTrab2(){
        return(NtTrab2);
    }
    
    public double calcMediaProva(){
        return(0.75 * (NtPrv1 + 2 * NtPrv2)/3);
    }
    
    public double calcMediaTrab() {
        return(0.25 * (NtTrab1 + NtTrab2)/2);
    }
    
    public double calcMediaFinal(){
        return(calcMediaProva() + calcMediaTrab());
    }
    
    public boolean isAprovado(){
        return(calcMediaFinal() > 5);
    }
            
}
