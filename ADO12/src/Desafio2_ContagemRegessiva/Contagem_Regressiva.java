package Desafio2_ContagemRegessiva;

public class Contagem_Regressiva {
    public void contar(int inicio){
        if(inicio == 0)
            System.out.println("Fim");
        else
        {
            System.out.println(""+ inicio);
            contar(inicio-1);
        }
    }
}
