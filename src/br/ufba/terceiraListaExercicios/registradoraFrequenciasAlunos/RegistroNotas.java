package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

public class RegistroNotas {

    private double nota;
    private Aluno aluno;
    private Turma turma;

    public RegistroNotas(double nota, Aluno aluno, Turma turma) {
        this.nota = nota;
        this.aluno = aluno;
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }
}