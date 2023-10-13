package Pedido;

public class Pedido {
    private double valor;
    private int parcelas;

    private double total;
    private double juros;

    public Pedido(double valor, int parcelas) {
        this.valor = valor;
        this.parcelas = parcelas;

        total();
        juros();
    }

    public double getTotal() {
        return total;
    }

    public double getJuros() {
        return juros;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void total(){
        total = getJuros();
    }
    public  void juros(){
        double parcela = this.valor/this.parcelas;

        if (parcela == 0)
            juros = this.valor;
        else {
            double juros1 = this.valor * Math.pow(1 + 0.01, this.parcelas);
            juros = juros1;
        }
    }
}
