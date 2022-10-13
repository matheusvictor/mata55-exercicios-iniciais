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
        for (Turma turmasRegistrada : turmasRegistradas) {
            turmasRegistrada.getNomeDisciplina().equals(nomeTurma);
            return turmasRegistrada;
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

    public void registrarFrequencia(Aluno aluno, DiaAula diaAula, boolean presenca) {
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
    }

    public void filtrarAlunosPresentes(DiaAula diaAula) {
        System.out.println("========== ALUNOS PRESENTES NA AULA DE " + diaAula.getTurma().getNomeDisciplina() + " ==========");
        for (RegistroFrequencia frequenciasRegistrada : frequenciasRegistradas) {
            if (diaAula.equals(frequenciasRegistrada.getDiaAula())) {
                if (frequenciasRegistrada.isPresenca())
                    System.out.println(frequenciasRegistrada.getAluno().getNome());
            }
        }
    }

    public void exibirPresencasEFaltas(Aluno aluno, Turma turma) {

        int faltas = 0;
        int presencas = 0;

        for (RegistroFrequencia frequenciasRegistrada : this.frequenciasRegistradas) {
            if (frequenciasRegistrada.getAluno().getMatricula() == aluno.getMatricula()
                    && frequenciasRegistrada.getAluno().getNome().equals(aluno.getNome())
                    && frequenciasRegistrada.getDiaAula().getTurma().getNomeDisciplina().equals(turma.getNomeDisciplina())) {
                if (frequenciasRegistrada.isPresenca()) {
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

        Aluno[] alunos = new Aluno[this.frequenciasRegistradas.length];

        System.out.println("========== ALUNOS MATRICULADOS EM " + turma.getNomeDisciplina() + " ==========");
        for (int i = 0; i < this.frequenciasRegistradas.length; i++) {
            if (this.frequenciasRegistradas[i].getDiaAula().getTurma().getNomeDisciplina().equals(turma.getNomeDisciplina())) {
                if (i == 0) {
                    alunos[i] = this.frequenciasRegistradas[i].getAluno();
                } else if (this.frequenciasRegistradas[i].getAluno() == alunos[i - 1]) {
                    continue;
                } else {
                    alunos[i] = this.frequenciasRegistradas[i].getAluno();
                }
            }
        }

        for (Aluno aluno : alunos) {
            if (aluno != null)
                System.out.println(aluno.getNome());
        }
    }

    public void listarTurmas() {
        System.out.println("========================== TURMAS CADASTRADAS ==========================");
        for (Turma turmasRegistrada : this.turmasRegistradas) {
            System.out.println("* " + turmasRegistrada.getNomeDisciplina());
        }
        System.out.println("======================== FIM DA LISTA DE TURMAS ========================");
    }

    public void listarTotalFaltasEPresencaDoAlunoPorTurma() {
        // TODO
    }

    public void listarNotasAlunoPorTurma(Aluno aluno, Turma turma) {
        System.out.println("========== NOTAS DE " + aluno.getNome() + " EM " + turma.getNomeDisciplina() + " ==========");
        for (RegistroNotas notasRegistrada : this.notasRegistradas) {
            if (notasRegistrada.getAluno().equals(aluno) && notasRegistrada.getTurma().equals(turma)) {
                System.out.println("Nota: " + notasRegistrada.getNota());
            }
        }
    }

    public void sair() {
        System.out.println("Programa encerrado!");
        System.exit(0);
    }

}