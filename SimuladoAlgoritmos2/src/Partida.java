import java.util.ArrayList;

public class Partida {
    private Time mandante;
    private Time visitante;
    private boolean encerrada;

    public void iniciar(String mandante, String visitante){
        Time t1 = new Time();
        Time t2 = new Time();
        t1.setNome(mandante);
        t2.setNome(visitante);

        this.mandante = t1;
        this.visitante = t2;
    }

    public void encerrar(){
        this.encerrada = true;

        this.mandante.listarGols(0);
        this.visitante.listarGols(0);
    }

    public void golMandante(String jogador, int tempo){
        Gol gol = new Gol();
        gol.setJogador(jogador);
        gol.setTempo(tempo);

        this.mandante.novoGol(gol);
    }

    public void golVisitante(String jogador, int tempo){
        Gol gol = new Gol();
        gol.setJogador(jogador);
        gol.setTempo(tempo);
        
        this.visitante.novoGol(gol);

    }
}
