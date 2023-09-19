import java.util.Random;

public class LojaOnline {
    public NotaFiscal efetuarCompra(Compra compra){
       NotaFiscal notaFiscal = new NotaFiscal();
       Item item = new Item();
       Cliente cliente = new Cliente();

       notaFiscal.setCliente(cliente);
       notaFiscal.setCodNota(gerarCodNota());
       notaFiscal.setValorParcelas(compra.getParcelas());
       notaFiscal.setTotal(calcularTotal(compra));

       return notaFiscal;
    }
    private double calcularTotal(Compra compra){
        double valorFinal = 0;
        for (Item item: compra.getCarrinho()) {
            String formaPag = compra.getFormaPag();
            double valorInicial = item.getPreco();

            //Cupom
            double cupom = verificarCupom(compra.getCupom());
            valorInicial -= cupom;

           //Forma de pagamento
            if (formaPag.equals("DÉBITO")){
                valorFinal = valorInicial - (valorInicial * 0.05);
                return valorFinal;
            } else if (formaPag.equals("PIX")) {
                valorFinal = valorInicial - (valorInicial * 0.10);
                return valorFinal;
            } else if (formaPag.equals("CRÉDITO")) {
                double parc = calcularParcela(item.getPreco(), compra.getParcelas());
                if ( parc > 0){
                    valorFinal = valorInicial - parc;
                    return valorFinal;
                }
                return valorFinal;
            }
            return valorFinal;
        }
        return valorFinal;
    }
    private double verificarCupom(String cupom) {
        double disconto = 0;
        if (cupom.equals("QUERO100")) {
            disconto = 100;
        } else if (cupom.equals("QUERO200")) {
            disconto = 200;
        } else if (cupom.equals("QUERO500")) {
            disconto = 500;
        }
        return disconto;
    }
    private double calcularParcela(double total, int parcelas){
        if (parcelas > 0) {
            return total / parcelas;
        }
        else
            return 0;
    }

    private int gerarCodNota(){
        NotaFiscal nf = new NotaFiscal();
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000);
        return numeroAleatorio;
    }
}
