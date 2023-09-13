public class Main {

    public static void main(String[] args) throws Exception {
        UI tela = new UI();

        tela.apresentarPrograma();

        Cliente cliente = new Cliente();
        cliente.setNome(tela.pedirTexto(" Cliente: "));
        cliente.setTelefone(tela.pedirTexto("Telefone: "));
        cliente.setEndereco(tela.pedirTexto("Endereço: "));

        int qtd = tela.pedirInt("\nQuantos itens irá comprar: ");
        tela.pularLinha();

        Item[] itens = new Item[qtd];

        for (int i = 0; i < itens.length; i++) {
            tela.pedirTexto("");

            Item item = new Item();
            item.setDescricao(tela.pedirTexto("Item %s: ", i + 1));
            item.setPreco(tela.pedirDouble(" Preço: "));

            itens[i] = item;

            tela.pularLinha();
        }


        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setItens(itens);


        Pagamento pag = new Pagamento();
        Comprovante compr = pag.faturarPedido(pedido);


        tela.exibirCompra(compr);
    }

}
