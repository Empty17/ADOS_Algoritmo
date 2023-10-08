package Pedido;

import java.util.Scanner;

public class UI {
    Scanner ler = new Scanner(System.in);
    Pedido pedido = new Pedido();

    public void boasVindas(){
        System.out.println("*******************");
        System.out.println("     Pedidos.com   ");
        System.out.println("*******************");
    }

    public void pedidoValor(){
        System.out.println("Digite o valor do Produto:");
        pedido.setValor(ler.nextDouble());
    }

    public void pedidoParcelas(){
        System.out.println("Digite em quantas parcelas deseja pagar:");
        pedido.setParcelas(ler.nextInt());
    }


    public void notaFiscal(){
        System.out.println("*********************************");
        System.out.println("    Pedidos.com (Nota Fiscal)    ");
        System.out.println("*********************************");

        System.out.printf("VALOR PEDIDO: %.2f \n", pedido.getValor());
        System.out.printf("PARCELAS: %d\n\n", pedido.getParcelas());

        System.out.printf("VALOR PARCELAS: %.3f\n", pedido.total()/pedido.getParcelas());
        System.out.printf("VALOR TOTAL: %.2f\n", pedido.total());
        System.out.println("*********************************");
        System.out.println("'lembrete': compras parceladas teram juros de 1% ao mês ");
    }
}
