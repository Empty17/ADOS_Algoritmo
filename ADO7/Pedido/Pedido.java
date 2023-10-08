package Pedido;
import java.math.*;

public class Pedido {
    private double valor;
    private int parcelas;

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

    public double total(){
       return juros();
    }

    private double juros(){

        double parcela = this.valor/this.parcelas;

        if (parcela == 0)
            return this.valor;
        else {
            double juros = this.valor * Math.pow(1 + 0.01, this.parcelas);
            return juros;
        }
    }


}
