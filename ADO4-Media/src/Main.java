import java.util.*;
public class Main {
    public static void main(String[] args) {
        // entradas
        UI ui = new UI();
        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);

        ui.boasVindas();
        aluno.setNome(ui.pedirTexto("Nome: "));
        aluno.setChamada(ui.pedirInt("Chamada: "));
        aluno.setCurso(ui.pedirTexto("Curso: "));
        aluno.setTurma(ui.pedirTexto("Turma: "));

        int qtd = ui.pedirInt("Quantidade de Diciplinas: ");

        NotaDisciplina[] diciplinas = new NotaDisciplina[qtd];

        for (int i = 0; i < diciplinas.length; i++) {
            NotaDisciplina nota = new NotaDisciplina();

            nota.setDisciplina("Disciplina "+ (i+1));
            nota.setMedia(ui.pedirDouble("\nMédia: "));
            nota.setFaltas(ui.pedirInt("Faltas: "));
            diciplinas[i] = nota;

            System.out.println("------");
        }

        NotasAluno notasAluno = new NotasAluno();
        notasAluno.setAluno(aluno);
        notasAluno.setDisciplinas(diciplinas);

        Boletim boletim = new Boletim();
        Resultado res = boletim.avaliar(notasAluno);

        ui.boletimFinal(res);


    }
}
