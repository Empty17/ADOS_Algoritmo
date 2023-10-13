package Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o cateto adjacente");
        double cA = ler.nextDouble();

        System.out.println("Digite o cateto oposto");
        double cO = ler.nextDouble();

        Triangulo tri = new Triangulo(cO, cA);
        System.out.println("Area: " + tri.getArea());
        System.out.printf("Perimetro: %.3f", tri.getPerimetro());
        System.out.printf("\nHipotenusa: %.3f", tri.getHipotenusa());
    }
}
