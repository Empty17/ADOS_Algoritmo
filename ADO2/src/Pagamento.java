public class Pagamento {
    double taxa = 0;
    public double calcularTotal(Compra compra){
        double totalFim;
        totalFim = compra.getCompra() * ((1+ this.buscarTaxa(compra.getParcelas())));
        return totalFim;
    }
    public double calcularParcelas(double totalFinal, int parcelas){
        double parcelasParaPagar = totalFinal / parcelas;
        return parcelasParaPagar;
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
            taxa = 0.12;
            return taxa;
        }else
            return taxa;
    }
    public double mostrarJuros(int juros){
        Compra compra = new Compra();
        double parcelas = buscarTaxa(juros);
        double view = parcelas *100;
        return view;
    }
}
