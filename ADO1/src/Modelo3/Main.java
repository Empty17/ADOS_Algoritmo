package Modelo3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Boletim boletim = new Boletim();
        double[] notas = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a %d nota: ", i+1);
            notas[i] = ler.nextDouble();
        }

        double media = boletim.calcularMedia(notas[0], notas[1], notas[2]);
        String situacao = boletim.verificarSituacao(media);

        System.out.println("****************************");
        System.out.println("BOLETIM:");
        System.out.println("****************************");
        System.out.printf("NOTA 1 = %.2f\nNOTA 2 = %.2f\nNOTA 3 = %.2f\nMEDIA = %.2f\n%s", notas[0], notas[1], notas[2],
                media,situacao);
        System.out.println("\n****************************");
    }
}
