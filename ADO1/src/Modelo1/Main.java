package Modelo1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double[] notas = new double[3];
        double media = 0;

        //Lendo nota
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite %dº a nota: ",i+1);
            notas[i] = ler.nextDouble();
        }

        //Criando media
        for (int j = 0; j < 3; j++) {
            media += notas[j];
        }
        media /= 3;

        String situacao;
        if (media >= 6){
            situacao = "Aprovado";
        }else {
            situacao = "Desaprovado";
        }

        System.out.println("****************************");
        System.out.println("BOLETIM:");
        System.out.println("****************************");
        System.out.printf("NOTA 1 = %.2f\nNOTA 2 = %.2f\nNOTA 3 = %.2f\nMEDIA = %.2f\n%s", notas[0], notas[1], notas[2],
                media,situacao);
        System.out.println("\n****************************");
    }
}