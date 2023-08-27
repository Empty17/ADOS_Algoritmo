package Modelo3;

public class Boletim {

    public double calcularMedia(double nota1, double nota2, double nota3){
      double media = nota1 + nota2 + nota3;
      media /= 3;
      return media;
    }

    public String verificarSituacao(double media){
        if (media >=6)
            return "Aprovado";
        else
            return "Desaprovado";
    }
}
