package Retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        System.out.println("Digite a altura do Retangulo");
        ret.setAltura( ler.nextDouble());

        System.out.println("Digite a base do Retangulo");
        ret.setBase(ler.nextDouble());

        double x1 = ret.area();
        double x2 = ret.perimetro();

        System.out.println("\nA área do retângulo é " +x1);
        System.out.println("O perimetro do retãngulo é "+ x2);
    }
}
