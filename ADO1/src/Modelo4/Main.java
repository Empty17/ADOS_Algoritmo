package Modelo4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Classes
        Boletim boletim = new Boletim();
        NotasAluno notas = new NotasAluno();

        //Pegando notas
        System.out.println("Digite a 1° nota:");
        notas.setNota1(ler.nextDouble());
        System.out.println("Digite a 2° nota:");
        notas.setNota2(ler.nextDouble());
        System.out.println("Digite a 3° nota:");
        notas.setNota3(ler.nextDouble());

        //Saida
        System.out.println("****************************");
        System.out.println("BOLETIM:");
        System.out.println("****************************");
        System.out.printf("NOTA 1 = %.2f\nNOTA 2 = %.2f\nNOTA 3 = %.2f\nMEDIA = %.2f\n%s", notas.getNota1(), notas.getNota2(),
                notas.getNota3(), boletim.calcularMedia(notas), boletim.verificarSituacao(boletim.calcularMedia(notas)));
        System.out.println("\n****************************");
    }
}
