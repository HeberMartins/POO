
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author mhebe
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        funcHor.setQtdeHoraTrab(90);
        funcHor.setCargo("Diretor Geral");
        System.out.println("Registro: " + funcHor.getRegistro() + " | Nome: " + funcHor.getNome() + " | Data de Admissão: " + funcHor.getDtAdmissao() + " | Cargo: " + funcHor.getCargo());
        System.out.println("Salário Bruto: " + df.format(funcHor.calcSalBruto()));
        System.out.println("Gratificação: " + df.format(funcHor.calcGratificacao()));
        System.out.println("Desconto: " + df.format(funcHor.calcDesconto()));
        System.out.println("Salário Liquido: " + df.format(funcHor.calSalLiquido()));
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Juliana Morais", "7/11/2001", 1400.50);
        funcMen.setNumSalMin(3);
        funcMen.setCargo("Diretor regional");
        System.out.println("\nRegistro: " + funcMen.getRegistro() + " | Nome: " + funcMen.getNome() + " | Data de Admissão: " + funcMen.getDtAdmissao() + " | Cargo: " + funcMen.getCargo());
        System.out.println("Sálario Bruto: " + df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funcMen.calcDesconto()));
        System.out.println("Salário: " + df.format(funcMen.calcSalLiquido()));
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Adam louis", "30/01/2007", 10);
        funcCom.setSalBase(900);
        funcCom.addVendas(1000);
        funcCom.addVendas(3000);
        funcCom.addVendas(4000);
        funcCom.setCargo("Vendedor");
        System.out.println("\nRegistro: " + funcCom.getRegistro() + " | Nome: " + funcCom.getNome() + " | Data de Admissão: " + funcCom.getDtAdmissao() + " | Cargo: " + funcCom.getCargo());
        System.out.println("Sálario Bruto: " + df.format(funcCom.calcSalBruto()));
        System.out.println("Sálario Base: " + df.format(funcCom.getSalBase()));
        System.out.println("Comissão: " + df.format(funcCom.getTaxaComissao()));
        System.out.println("Desconto: " + df.format(funcCom.calcDesconto()));
        System.out.println("Gratificação: " + df.format(funcCom.calcGratificacao()));
        System.out.println("Vendas: " + df.format(funcCom.getTotalVendas()));
        System.out.println("Salário: " + df.format(funcCom.calcSalLiquido()));
    }
    
}
