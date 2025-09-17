package fatec.poo.model;

/**
 *
 * @author mhebe
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    public Funcionario(int r, String n, String dt){
        registro = r;
        nome = n;
        dtAdmissao = dt;
    }
    
    public double getRegistro(){
        return registro;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDtAdmissao(){
        return dtAdmissao;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String c){
        cargo = c;
    }
    
    
    //metodo abstrato
    //É o metodo que possui apenas a assinatura
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
       return(0.10 * calcSalBruto());
    }
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
    
    
}
