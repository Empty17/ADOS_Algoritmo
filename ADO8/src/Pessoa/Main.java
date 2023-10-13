package Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String pessoa = ler.nextLine();

        System.out.println("Digite seu ano de nacimento");
        int ano = ler.nextInt();

        Pessoa pes = new Pessoa(pessoa,ano);

        System.out.println("\nPrimeiro nome: " + pes.getPrimeiroNome());
        System.out.println("Ultimo nome: " + pes.getUltimoNome());
        System.out.println("Idade: " + pes.getIdade());
    }
}
