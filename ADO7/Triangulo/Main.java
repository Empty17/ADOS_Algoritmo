package Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Triangulo tri = new Triangulo();

        System.out.println("Digite o valor do cateto adjacente:");
        tri.setCatetoAdjacente(ler.nextDouble());

        System.out.println("Digite o valor do cateto oposto:");
        tri.setCatetoOposto(ler.nextDouble());

        double hipo = tri.hipotenua();
        double area = tri.area();
        double peri = tri.perimetro();

        System.out.printf("\nA hipotenusa do triangulo: %.2f", hipo);
        System.out.printf("\nA área do triangulo: %.2f", area);
        System.out.printf("\nO perimetro do triangulo: %.2f", peri);
    }
}
