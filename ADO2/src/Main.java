import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Classes
        UI ui = new UI();
        Pagamento pagamento = new Pagamento();
        Compra compra = new Compra();

        ui.boasVindas();

        System.out.println("Digite o valor da compra:");
        compra.setCompra(ler.nextDouble());
        System.out.println("Digite a quantidade de parcelas");
        compra.setParcelas(ler.nextInt());

        double totalPagar = pagamento.calcularTotal(compra);
        System.out.println(totalPagar);
        System.out.println((1 + pagamento.taxas(compra.getParcelas())));

    }
}