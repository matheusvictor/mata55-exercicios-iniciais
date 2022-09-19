package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

public class DiarioRegistros {

    private Aluno[] alunosRegistrados;
    private Turma[] turmasRegistradas;
    private DiaAula[] diasAulaRegistrados;
    private RegistroNotas[] notasRegistradas;
    private RegistroFrequencia[] frequenciasRegistradas;

    public Aluno registrarAluno(String nome, String dataNascimento) {

        Aluno novoAluno = new Aluno(nome, dataNascimento);

        if (this.alunosRegistrados == null) {
            this.alunosRegistrados = new Aluno[1];
            this.alunosRegistrados[0] = novoAluno;
        } else {

            Aluno[] copiaListaAlunos = new Aluno[this.alunosRegistrados.length];
            for (int i = 0; i < this.alunosRegistrados.length; i++) {
                copiaListaAlunos[i] = this.alunosRegistrados[i];
            }

            this.alunosRegistrados = new Aluno[this.alunosRegistrados.length + 1];
            for (int i = 0; i < this.alunosRegistrados.length; i++) {

                if (i == (this.alunosRegistrados.length - 1)) {
                    this.alunosRegistrados[i] = novoAluno;
                } else {
                    this.alunosRegistrados[i] = copiaListaAlunos[i];
                }
            }
        }
        return novoAluno;
    }

    public Turma registrarTurma(String nomeTurma) {
        Turma novaTurma = new Turma(nomeTurma);

        if (this.turmasRegistradas == null) {
            this.turmasRegistradas = new Turma[1];
            this.turmasRegistradas[0] = novaTurma;
        } else {
            Turma[] copiaListaTurmas = new Turma[this.turmasRegistradas.length];
            for (int i = 0; i < this.turmasRegistradas.length; i++) {
                copiaListaTurmas[i] = this.turmasRegistradas[i];
            }

            this.turmasRegistradas = new Turma[this.turmasRegistradas.length + 1];
            for (int i = 0; i < this.turmasRegistradas.length; i++) {
                if (i == (this.turmasRegistradas.length - 1)) {
                    this.turmasRegistradas[i] = novaTurma;
                } else {
                    this.turmasRegistradas[i] = copiaListaTurmas[i];
                }
            }
        }
        return novaTurma;
    }

    public Turma obterTurma(String nomeTurma) {
        for (int i = 0; i < turmasRegistradas.length; i++) {
            turmasRegistradas[i].getNomeDisciplina().equals(nomeTurma);
            return turmasRegistradas[i];
        }
        return null;
    }

    public DiaAula registrarDiaAula(String dataAula, String horario, Turma turma, String conteudo) {
        DiaAula diaAula = new DiaAula(dataAula, horario, turma, conteudo);

        if (this.diasAulaRegistrados == null) {
            this.diasAulaRegistrados = new DiaAula[1];
            this.diasAulaRegistrados[0] = diaAula;
        } else {

            DiaAula[] copiaListaDiaAulas = new DiaAula[this.diasAulaRegistrados.length];
            for (int i = 0; i < this.diasAulaRegistrados.length; i++) {
                copiaListaDiaAulas[i] = this.diasAulaRegistrados[i];
            }

            this.diasAulaRegistrados = new DiaAula[this.diasAulaRegistrados.length + 1];
            for (int i = 0; i < this.diasAulaRegistrados.length; i++) {
                if (i == (this.diasAulaRegistrados.length - 1)) {
                    this.diasAulaRegistrados[i] = diaAula;
                } else {
                    this.diasAulaRegistrados[i] = copiaListaDiaAulas[i];
                }
            }
        }
        return diaAula;
    }

    public RegistroNotas registrarNota(double nota, Aluno aluno, Turma turma) {
        RegistroNotas registroNota = new RegistroNotas(nota, aluno, turma);

        if (this.notasRegistradas == null) {
            this.notasRegistradas = new RegistroNotas[1];
            this.notasRegistradas[0] = registroNota;
        } else {
            RegistroNotas[] copiaListaRegistroNotas = new RegistroNotas[this.notasRegistradas.length];
            for (int i = 0; i < this.notasRegistradas.length; i++) {
                copiaListaRegistroNotas[i] = this.notasRegistradas[i];
            }

            this.notasRegistradas = new RegistroNotas[this.notasRegistradas.length + 1];
            for (int i = 0; i < this.notasRegistradas.length; i++) {
                if (i == (this.notasRegistradas.length - 1)) {
                    this.notasRegistradas[i] = registroNota;
                } else {
                    this.notasRegistradas[i] = copiaListaRegistroNotas[i];
                }
            }
        }
        return registroNota;
    }

    public RegistroFrequencia registrarFrequencia(Aluno aluno, DiaAula diaAula, boolean presenca) {
        RegistroFrequencia registroFrequencia = new RegistroFrequencia(aluno, diaAula, presenca);

        if (this.frequenciasRegistradas == null) {
            this.frequenciasRegistradas = new RegistroFrequencia[1];
            this.frequenciasRegistradas[0] = registroFrequencia;
        } else {

            RegistroFrequencia[] copiaListaFrequencias = new RegistroFrequencia[this.frequenciasRegistradas.length];
            for (int i = 0; i < this.frequenciasRegistradas.length; i++) {
                copiaListaFrequencias[i] = this.frequenciasRegistradas[i];
            }

            this.frequenciasRegistradas = new RegistroFrequencia[this.frequenciasRegistradas.length + 1];
            for (int i = 0; i < this.frequenciasRegistradas.length; i++) {

                if (i == (this.frequenciasRegistradas.length - 1)) {
                    this.frequenciasRegistradas[i] = registroFrequencia;
                } else {
                    this.frequenciasRegistradas[i] = copiaListaFrequencias[i];
                }
            }
        }
        return registroFrequencia;
    }

    public void filtrarAlunosPresentes(DiaAula diaAula) {
        System.out.println("========== ALUNOS PRESENTES NA AULA DE " + diaAula.getTurma().getNomeDisciplina() + " ==========");
        for (int i = 0; i < frequenciasRegistradas.length; i++) {
            if (diaAula.equals(this.frequenciasRegistradas[i].getDiaAula())) {
                if (this.frequenciasRegistradas[i].isPresenca())
                    System.out.println(this.frequenciasRegistradas[i].getAluno().getNome());
            }
        }
    }

    public void exibirPresencasEFaltas(Aluno aluno, Turma turma) {

        int faltas = 0;
        int presencas = 0;

        for (int i = 0; i < this.frequenciasRegistradas.length; i++) {
            if (this.frequenciasRegistradas[i].getAluno().getMatricula() == aluno.getMatricula()
                    && this.frequenciasRegistradas[i].getAluno().getNome().equals(aluno.getNome())
                    && this.frequenciasRegistradas[i].getDiaAula().getTurma().getNomeDisciplina().equals(turma.getNomeDisciplina())) {
                if (this.frequenciasRegistradas[i].isPresenca()) {
                    presencas++;
                } else {
                    faltas++;
                }
            }
        }

        if (faltas == 0 && presencas == 0) {
            System.out.println(aluno.getNome() + " não está na matéria "
                    + turma.getNomeDisciplina());
            System.out.println("===================================================================");
        } else {
            System.out.println("Registro de presenças de " + aluno.getNome() + " na matéria " + turma.getNomeDisciplina());
            System.out.println("* Faltas: " + faltas);
            System.out.println("* Presenças: " + presencas);
            System.out.println("===================================================================");
        }
    }

    public void exibirAlunosMatriculadosNaTurma(Turma turma) {
        for (int i = 0; i < this.frequenciasRegistradas.length; i++) {
            if (this.frequenciasRegistradas[i].getDiaAula().getTurma().getCodigoTurma() == turma.getCodigoTurma()) {
                System.out.println(this.frequenciasRegistradas[i].getAluno().getNome());
            }
        }
    }

    public void listarTurmas() {
        System.out.println("========================== TURMAS CADASTRADAS ==========================");
        for (int i = 0; i < this.turmasRegistradas.length; i++) {
            System.out.println("* " + this.turmasRegistradas[i].getNomeDisciplina());
        }
        System.out.println("======================== FIM DA LISTA DE TURMAS ========================");
    }

    public void listarTotalFaltasEPresencaDoAlunoPorTurma() {
        // TODO
    }

    public void listarNotasAlunoPorTurma(Aluno aluno, Turma turma) {
        System.out.println("========== NOTAS DE " + aluno.getNome() + " EM " + turma.getNomeDisciplina() + " ==========");
        for (int i = 0; i < this.notasRegistradas.length; i++) {
            if (notasRegistradas[i].getAluno().equals(aluno) && notasRegistradas[i].getTurma().equals(turma)) {
                System.out.println("Nota: " + notasRegistradas[i].getNota());
            }
        }
    }

    public void sair() {
        System.out.println("Programa encerrado!");
        System.exit(0);
    }

}