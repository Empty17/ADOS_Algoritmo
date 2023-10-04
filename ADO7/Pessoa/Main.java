package Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome completo:");
        pessoa.setNomeCompleto( ler.nextLine());

        System.out.println("Digite seu ano de nacimento");
        pessoa.setAnoNasc(ler.nextInt());

        String primeiroNome = pessoa.primeiroNome();
        String ultimoNome = pessoa.ultimoNome();
        int idade = pessoa.idade();

        System.out.println("\nPrimeiro nome: " + primeiroNome);
        System.out.println("Ultimo nome: " + ultimoNome);
        System.out.println("Idade: " + idade);
    }
}
