public class Boletim {
    public Resultado avaliar(NotasAluno notasAluno){
        for (NotaDisciplina item : notasAluno.getDisciplinas()) {
          // verificar situacao
        }
        }

    private String verificarSituacao(double media, int faltas){
        String situacao = "";
        if (faltas >= 4 ){
            situacao = "DP por Falta";
        }
        else if (media < 6){
            situacao = "DP por Nota";
        }
        else if (media >= 6){
            situacao = "Parabéns, você foi Aprovado";
        }
        return situacao;
    }

}
