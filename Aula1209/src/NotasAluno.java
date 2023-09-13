public class NotasAluno {
    private Aluno aluno;
    private NotaDisciplina [] disciplinas = new NotaDisciplina[3];
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public NotaDisciplina[] getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(NotaDisciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
