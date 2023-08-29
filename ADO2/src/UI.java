public class UI {
    public void boasVindas(){
        System.out.println("*********************************************************");
        System.out.println("SEJA BEM-VINDO AO SISTEMA DE JUROS");
        System.out.println("Aqui o total da compra e o valor das parcelas \na partir da quantidade de " +
                "vezes que você deseja PAGAR!");
        System.out.println("*********************************************************");
    }

    public void extrato(Compra compra, Pagamento pagamento){
        System.out.println("\n\n****************************");
        System.out.println("EXTRATO DA COMPRA");
        System.out.println("****************************");
        System.out.printf("VALOR DA COMPRA: %.2f\n", compra.getCompra());
        System.out.printf("QUANTIDADE DE PARCELAS: %d\n\n", compra.getParcelas());
        System.out.printf("VALOR A SER PAGO: %.2f", pagamento.calcularTotal(compra));
        System.out.printf("\nPARCELAS MENSAIS: %.2f", pagamento.calcularParcelas(pagamento.calcularTotal(compra),compra.getParcelas()));
        System.out.println("\n****************************");



    }
}
