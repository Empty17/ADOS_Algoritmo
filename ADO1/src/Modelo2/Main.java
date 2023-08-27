package Modelo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicialização
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[3];

        //Pedindo notas
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a sua %d nota: ", i+1);
            notas[i] = ler.nextDouble();
        }
        //Media e Situação
        double media = calcularMedia(notas[0], notas[1], notas[2]);
        String situacao = verificarSituacao(media);

        //Saida
        System.out.println("****************************");
        System.out.println("BOLETIM:");
        System.out.println("****************************");
        System.out.printf("NOTA 1 = %.2f\nNOTA 2 = %.2f\nNOTA 3 = %.2f\nMEDIA = %.2f\n%s", notas[0], notas[1], notas[2],
                media,situacao);
        System.out.println("\n****************************");

    }

    private static String verificarSituacao(double media) {
        if (media >= 6)
            return "Aprovado";
        else
            return "Desaprovado";
    }

    public static double calcularMedia(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

}
