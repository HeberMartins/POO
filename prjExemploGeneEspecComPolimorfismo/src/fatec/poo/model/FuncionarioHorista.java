package fatec.poo.model;

/**
 *
 * @author mhebe
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtadm, double vht){
        super(r, n, dtadm); //chama o método da Super Classe
        valHorTrab = vht;
    }
    
    public void setQtdeHoraTrab(int qht){
        qtdeHorTrab = qht;
    }
    
    //Aplicando polimorfismo
    //sobreposicao (override) de métodos
    public double calcSalBruto() {
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return(0.075 * calcSalBruto());
    }
    
    //Aplicar o polimorfismo
    //Sobreposição (override) do método
    public double calSalLiquido() {
        return((calcSalBruto() + calcGratificacao()) - calcDesconto());
    }
}
