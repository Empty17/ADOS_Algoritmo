public class Pedido {
    private Cliente cliente;
    private Item[] itens;

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Item[] getItens() {
        return itens;
    }
    public void setItens(Item[] itens) {
        this.itens = itens;
    }

}
