package Desafio2_ContagemRegessiva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Scanner ler = new Scanner(System.in);
        Contagem_Regressiva cont = new Contagem_Regressiva();

        ui.menu();

        System.out.printf("Digite um numero: ");
        int num = ler.nextInt();

        cont.contar(num);
    }
}