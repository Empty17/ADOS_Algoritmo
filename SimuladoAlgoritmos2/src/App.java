import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Gol gol = new Gol();
        Partida partida = new Partida();

        System.out.println("Informe o time mandante:");
        String nome1 = ler.nextLine();

        System.out.println("Informe o time visitante:");
        String nome2 = ler.nextLine();
        
        partida.iniciar(nome1, nome2);
        boolean fim = false;

        while(fim != true){
            System.out.println("\nO que deseja fazer:" +
        "\n1 - Gol mandante\n2 - Gol visitante\n3 - Encerrar");
        int acao = ler.nextInt();

        switch (acao){
            case 1: System.out.println("Nome do Jogador: ");
            String nomeJogador1 =  ler.next();
            System.out.println("Tempo do Gol: ");
            int tGol =  ler.nextInt();
            partida.golMandante(nomeJogador1, tGol);
            break;

            case 2: System.out.println("Nome do Jogador: ");
            String nomeJogador2 =  ler.next();
            System.out.println("Tempo do Gol: ");
            int tGol2 =  ler.nextInt();
            partida.golVisitante(nomeJogador2, tGol2);
            break;

            case 3: partida.encerrar();
            fim = true;
            break;
            
        }
        }
        




        
    }
}
