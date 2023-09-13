import java.util.*;

public class UI {
    static Scanner ler = new Scanner(System.in);

    public void apresentarPrograma() {
        escrever("##### PROGRAMA DA PIZZARIA #####\n");
    }

    public void escrever(String msg, Object... values) {
        System.out.printf(msg+"\n", values);
    }

    public double pedirDouble(String msg, Object... values) {
        System.out.printf(msg, values);
        double valor = ler.nextDouble();
        return valor;
    }

    public int pedirInt(String msg, Object... values) {
        System.out.printf(msg, values);
        int valor = ler.nextInt();
        return valor;
    }

    public String pedirTexto(String msg, Object... values) {
        System.out.printf(msg, values);
        String valor = ler.nextLine();
        return valor;
    }

    public void pularLinha() {
        System.out.println();
    }



    public void exibirCompra(Comprovante comprovante) {
        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("    COMPRA REALIZADA!");
        escrever("=========================");

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("         ITENS");
        escrever("=========================");

        for (Item item : comprovante.getItens()) {
            escrever("%s  R$ %.2f ", item.getDescricao(), item.getPreco());
        }

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("    TOTAL DA COMPRA");
        escrever("=========================");
        escrever("R$ %.2f", comprovante.getTotal());

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("        ENTREGA");
        escrever("=========================");
        escrever("  Código: %d", comprovante.getCodigo());
        escrever(" Cliente: %s", comprovante.getCliente().getNome());
        escrever("Telefone: %s", comprovante.getCliente().getTelefone());
        escrever("Endereço: %s", comprovante.getCliente().getEndereco());

        pularLinha();
        pularLinha();
        escrever("=========================");
        escrever("          FIM");
        escrever("=========================");
        pularLinha();
        pularLinha();
        pularLinha();
    }
}
