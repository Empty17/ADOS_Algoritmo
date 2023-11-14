package Desafio1_Fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Scanner ler = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();

        ui.menu();

        System.out.printf("Digite um numero: ");
        int num = ler.nextInt();

        int resul = fatorial.calcular(num);
        System.out.println(resul);
    }
}