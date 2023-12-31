public class Pagamento {
    public double calcularTotal(Compra compra){
        double totalFim;
        totalFim = compra.getCompra() * ((1+ this.buscarTaxa(compra.getParcelas())));
        return totalFim;
    }
    public double calcularParcelas(double totalFinal, int parcelas){
        return totalFinal / parcelas;
    }

    private double buscarTaxa(int parcelas ) {
        double taxa = 0;
        if (parcelas >= 1 && parcelas <= 3) {
            taxa = 0.03;
            return taxa;
        } else if (parcelas > 3 && parcelas < 12) {
            taxa = 0.05;
            return taxa;
        } else if (parcelas >= 12) {
            taxa = 0.10;
            return taxa;
        }else
            return taxa;
    }
    public double mostrarJuros(int juros){
        double parcelas = buscarTaxa(juros);
        return parcelas *100;
    }
}
