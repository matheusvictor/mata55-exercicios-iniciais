package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

public class DiarioRegistros {

    private Aluno[] alunosRegistrados;

    private RegistroNotas[] listaNotas;
    private RegistroFrequencia[] listaPresencas;

    public DiarioRegistros() {
        this.listaNotas = new RegistroNotas[0];
        this.listaPresencas = new RegistroFrequencia[0];
    }

    public void registrarAluno(String nome, int matricula, String dataNascimento) {
        Aluno novoAluno = new Aluno(nome, matricula, dataNascimento);
    }

    public void registrarTurma(String nomeTurma) {
        Turma novaTurma = new Turma(nomeTurma);
    }

    public void registrarDiaAula(String dataAula, String horario, Turma turma, String conteudo) {
        DiaAula diaAula = new DiaAula(dataAula, horario, turma, conteudo);
    }

    public void registrarNota(double nota, Aluno aluno, Turma turma) {
        RegistroNotas registroNotas = new RegistroNotas(nota, aluno, turma);
    }

    public void registrarFrequencia(Aluno aluno, DiaAula diaAula, boolean presenca) {
        RegistroFrequencia registroFrequencia = new RegistroFrequencia(aluno, diaAula, presenca);
    }

    public Aluno[] filtrarAlunosPresentes(DiaAula diaAula, Turma turma, RegistroFrequencia r) {

        Aluno[] alunosPresentes;

        if (r.getDiaAula() == diaAula && r.getDiaAula().getTurma() == turma) {
            System.out.println(r.isPresenca());
        }

            return new Aluno[0]; // TODO
    }

    public Aluno[] exibirPresencasEFaltas(RegistroFrequencia r, Aluno aluno, Turma turma) {

        boolean faltas[];
        boolean presencas[];


        return new Aluno[0]; // TODO
    }

    public void exibirNotaAlunoPorTurma(Aluno aluno, Turma turma) {
        // TODO
    }

    public Aluno[] exibirAlunosMatriculadosNaTurma(Turma turma) {
        return new Aluno[0]; // TODO
    }

    public Turma[] listarTurmas() {
        return new Turma[0]; // TODO
    }

    public void listarTotalFaltasEPresencaDoAlunoPorTurma() {
        // TODO
    }

    public void listarNotasAlunoPorTurma() {
        // TODO
    }

    public void sair() {
        // TODO
    }

}