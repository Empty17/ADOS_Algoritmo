public class Pagamento {

    public Comprovante faturarPedido(Pedido pedido) {
        double total = this.calcularTotal(pedido);
        int codigo = this.gerarCodigo();

        Comprovante compr = new Comprovante();
        compr.setCliente(pedido.getCliente());
        compr.setItens(pedido.getItens());
        compr.setCodigo(codigo);
        compr.setTotal(total);

        return compr;
    }

    private int gerarCodigo() {
        int codigo = (int) (Math.random() * 999);
        return codigo;
    }

    private double calcularTotal(Pedido pedido) {
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        return total;
    }
}