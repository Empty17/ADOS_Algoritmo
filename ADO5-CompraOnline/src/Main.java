public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        ui.boasVindas();

        Cliente cliente = new Cliente();
        ui.infoCliente();
        cliente.setNome(ui.pedirTexto("NOME: "));
        cliente.setEmail(ui.pedirTexto("EMAIL: "));

        Compra compra = new Compra();
        compra.setCliente(cliente);
        ui.infoCompra();
        int qtd = ui.pedirInt("Quantos produtos comprou?: ");

        Item[] itens = new Item[qtd];
        for (int i = 0; i < itens.length; i++) {
            Item item = new Item();

            item.setNome(ui.pedirTexto("Nome do Produto: "));
            item.setPreco(ui.pedirDouble("Preço do Produto: "));
            itens[i] = item;

            System.out.println("----------");
        }

        compra.setCarrinho(itens);

        compra.setCupom(ui.pedirTexto("Cupom: "));
        compra.setFormaPag(ui.pedirTexto("Forma de Pagamento (CRÉDITO, DÉBITO E PIX): "));
        if(compra.getFormaPag().equals("CRÉDITO"))
            compra.setParcelas(ui.pedirInt("Quantas parcelas deseja realizar?: "));



        LojaOnline lojaOnline = new LojaOnline();
        NotaFiscal notaFiscal = lojaOnline.efetuarCompra(compra);
        notaFiscal.setItens(compra.getCarrinho());

        ui.NotaFiscal(notaFiscal);
    }
}