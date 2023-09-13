public class Comprovante {
    private int codigo;
    private double total;

    private Cliente cliente;
    private Item[] itens;


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
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
