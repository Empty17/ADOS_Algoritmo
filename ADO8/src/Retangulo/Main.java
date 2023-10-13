package Retangulo;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a altura do Retangulo");
        double altura = ler.nextDouble();

        System.out.println("Digite a base do Retangulo");
        double base = ler.nextDouble();

        Retangulo retangulo = new Retangulo(altura, base);
        System.out.println("Area retangulo: "+ retangulo.getArea());
        System.out.println("Perimetro retangulo " + retangulo.getPerimetro());
    }
}