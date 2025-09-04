
/**
 *
 * @author mhebe
 */
public class Livro {
    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria = 3.0;
    
    public Livro (int id, String titl){
        identificacao = id;
        titulo = titl;
    }
    
    public void setValMultaDiaria (double mult){
        valMultaDiaria = mult;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public boolean getSituacao(){
        return situacao;
    }
    
    public void emprestar(){
        situacao = true;
    }
    
    public double devolver(int dias){
        this.situacao = false;
        if (dias > 0) {
            return dias * valMultaDiaria;
        }
        return 0.0;
    }
}
