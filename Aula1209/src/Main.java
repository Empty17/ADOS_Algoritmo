import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        NotaDisciplina nDisciplina = new NotaDisciplina();
        NotasAluno nAluno = new NotasAluno();
        Aluno aluno = new Aluno();

        System.out.printf("Digite seu nome:");
        aluno.setNome(entrada.nextLine());

        System.out.printf("Quantas diciplinas você tem? ");
        nDisciplina.setQntDiciplinas(entrada.nextInt());

        for (int i = 0; i < nDisciplina.getQntDiciplinas(); i++) {
            System.out.printf("\nQual o nome do curso? ");
            nDisciplina.setDisciplina(entrada.next());

            System.out.printf("Sua media: ");
            nDisciplina.setMedia(entrada.nextDouble());

            System.out.printf("Quantidade de faltas: ");
            nDisciplina.setFaltas(entrada.nextInt());
        }


    }
}
