import java.util.Scanner;
public class UI {

        Scanner entrada = new Scanner(System.in);
        public void boasVindas(){
            System.out.println("################################");
            System.out.println("       COMPRAS   ONLINE         ");
            System.out.println("################################");
            pularLinha();
        }

        public void infoCliente(){
            System.out.println("INFORMAÇÕES DO CLIENTE");
        }
    public void infoCompra(){
        System.out.println("\nINFORMAÇÕES DA COMPRA");
    }

        public String pedirTexto(String texto){
            System.out.printf(texto);
            String resul = entrada.next();
            return resul;
        }
        public int pedirInt(String texto){
            System.out.printf(texto);
            int resul = entrada.nextInt();
            return resul;
        }
        public double pedirDouble(String texto){
            System.out.printf(texto);
            double resul = entrada.nextDouble();
            return resul;
        }

        public void pularLinha(){
            System.out.println("\n");
        }

    public void NotaFiscal(NotaFiscal notaFiscal) {
        pularLinha();
        pularLinha();
        System.out.println("################################");
        System.out.println("         NOTA FISCAL GERADA     ");
        System.out.println("################################");
        System.out.printf("\nNome: %s", notaFiscal.getCliente().getNome());
        System.out.printf("\nEMAIL: %s",notaFiscal.getCliente().getEmail() );

        for (Item item: notaFiscal.getItens()) {
            System.out.printf("\n\nNOME PRODUTO: %s", item.getNome());
            System.out.printf("\nPREÇO: %.1f", item.getPreco());
        }

        pularLinha();
        System.out.printf("VALOR A PAGAR");
        System.out.printf("\nCOD. NOTA: %d", notaFiscal.getCodNota());
        System.out.printf("\nVALOR FINAL: %s",notaFiscal.getTotal() );
        System.out.printf("\nPARCELAS: %s", notaFiscal.getValorParcelas());
        System.out.println("\n################################");
    }
}
