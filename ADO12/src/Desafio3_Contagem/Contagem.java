package Desafio3_Contagem;

public class Contagem {
    public void contar(int inicio, int fim){
        if(inicio >fim)
            System.out.println("Fim");
        else
        {
            System.out.println(""+ inicio);
            contar(inicio+1,fim);
        }
    }

    public void contarPares(int inicio, int fim){

        if(inicio > fim)
            System.out.println("Fim");
        else
        {
            System.out.println(""+ inicio);
            contarPares(inicio+2,fim);
        }
    }
}
