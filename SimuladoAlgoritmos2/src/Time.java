
import java.util.ArrayList;


public class Time {
    private String nome;
    private ArrayList<Gol> gols = new ArrayList<>();

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void novoGol(Gol gol){
       this.gols.add(gol);
    }

    public void listarGols(){
        if(this.gols.isEmpty()) {
            System.out.println("Acabou");
        }

        System.out.println("Jogador: "+this.gols.get(this.gols.size()-1).getJogador()+"Tempo"+gols.get(gols.size()-1).getTempo());
        this.gols.remove(this.gols.size()-1);

        listarGols();
         
    }

    public int totalGols(){
        if(gols.isEmpty()){
            return 0;
        }else{
            return gols.size();
        }
    }
}
