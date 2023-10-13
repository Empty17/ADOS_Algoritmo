package Pedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Scanner ler = new Scanner(System.in);

        ui.boasVindas();

        System.out.println("Digite o valor do Produto:");
        double valor = ler.nextDouble();
        System.out.println("Digite em quantas parcelas deseja pagar:");
        int parc = ler.nextInt();

        Pedido pedido = new Pedido(valor, parc);

        System.out.println("*********************************");
        System.out.println("    Pedidos.com (Nota Fiscal)    ");
        System.out.println("*********************************");

        System.out.printf("VALOR PEDIDO: %.2f \n", pedido.getValor());
        System.out.printf("PARCELAS: %d\n\n", pedido.getParcelas());

        System.out.printf("VALOR PARCELAS: %.3f\n", pedido.getJuros()/pedido.getParcelas());
        System.out.printf("VALOR TOTAL: %.2f\n", pedido.getJuros());
        System.out.println("*********************************");
        System.out.println("'lembrete': compras parceladas teram juros de 1% ao mês ");

    }
}
