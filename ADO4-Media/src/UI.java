import java.util.Scanner;

public class UI {
    Scanner entrada = new Scanner(System.in);
    public void boasVindas(){
        System.out.println("################################");
        System.out.println("       Gerador de Boletim       ");
        System.out.println("################################");
        pularLinha();
    }

    public String pedirTexto(String texto){
        System.out.printf(texto);
        String resul = entrada.next();
        return resul;
    }
    public int pedirInt(String texto){
        System.out.printf(texto);
        int resul = entrada.nextInt();
        return resul;
    }
    public double pedirDouble(String texto){
        System.out.printf(texto);
        double resul = entrada.nextDouble();
        return resul;
    }

    public void pularLinha(){
        System.out.println("\n");
    }


    public void boletimFinal(Resultado res){
        pularLinha();
        pularLinha();
        System.out.println("################################");
        System.out.println("         BOLETEIM GERADO        ");
        System.out.println("################################");
        System.out.printf("\nNome: %s", res.getAluno().getNome());
        System.out.printf("\nChamada: %s", res.getAluno().getChamada());
        System.out.printf("\nCurso: %s", res.getAluno().getCurso());
        System.out.printf("\nTurma: %s", res.getAluno().getTurma());

        for (NotaDisciplina item: res.getDisciplinas()) {
            System.out.printf("\n\n%s", item.getDisciplina());
            System.out.printf("\nMedia: %.1f", item.getMedia());
            System.out.printf("\nFaltas: %d", item.getFaltas());
        }

        pularLinha();
        System.out.printf("SITUAÇÂO:");
        System.out.printf("\nQtd. Aprovações: %d", res.getQtdAprovacoes());
        System.out.printf("\nQtd. Reprovações: %d", res.getQtdReprovacoes());
        System.out.printf("\nSituação Final: %s", res.getSituacao());
        System.out.println("\n################################");

    }
}
