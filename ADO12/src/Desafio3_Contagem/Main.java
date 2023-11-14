package Desafio3_Contagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Scanner ler = new Scanner(System.in);
        Contagem cont = new Contagem();

        ui.menu();

        System.out.printf("Digite o numero inicial: ");
        int numInicial = ler.nextInt();
        System.out.printf("Digite o numero Final: ");
        int numFim = ler.nextInt();

        System.out.println("\nContagem de Numeros:");
        cont.contar(numInicial,numFim);
        System.out.println("\nContagem de Numeros x2:");
        cont.contarPares(numInicial,numFim);
    }
}