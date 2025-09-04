
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;


/**
 *
 * @author mhebe
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Aluno objAlu = new Aluno(1010, "Carlos Silveira", "15/03/1971");
       objAlu.setMensalidade(1500);
       
        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());
        
        
       Professor objProf = new Professor (2020, "Flauco Todesco", "14/05/1967");
       objProf.setSalario(250000);
       
        System.out.println("Registro funcionário: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de Nascimento: " + objProf.getDataNascimento());
        System.out.println("Sálario: " + objProf.getSalario());
    }
    
}
