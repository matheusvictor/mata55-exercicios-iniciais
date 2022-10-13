package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

class Main {
    public static void main(String[] args) {

        DiarioRegistros diarioRegistros = new DiarioRegistros();

        Aluno jose = diarioRegistros.registrarAluno("José", "18-09-2022");
        Aluno maria = diarioRegistros.registrarAluno("Maria", "19-09-2022");

        Turma poo = diarioRegistros.registrarTurma("Programação Orientada a Objetos");
        Turma matematicaDiscreta = diarioRegistros.registrarTurma("Matemática Discreta");

        diarioRegistros.listarTurmas();

        DiaAula diaAulaPOO = diarioRegistros.registrarDiaAula(
                "14-09-2022",
                "18h30-20h20",
                poo,
                "Java");
        DiaAula diaAulaDiscreta = diarioRegistros.registrarDiaAula(
                "15-09-2022",
                "20h2-22h10",
                matematicaDiscreta,
                "Proposições lógicas");

        diarioRegistros.registrarFrequencia(jose, diaAulaPOO, true);
        diarioRegistros.registrarFrequencia(jose, diaAulaPOO, false);
        diarioRegistros.registrarFrequencia(jose, diaAulaDiscreta, true);
        diarioRegistros.exibirPresencasEFaltas(jose, poo);
        diarioRegistros.exibirPresencasEFaltas(jose, matematicaDiscreta);

        diarioRegistros.registrarFrequencia(maria, diaAulaPOO, true);
        diarioRegistros.registrarFrequencia(maria, diaAulaPOO, false);
        diarioRegistros.exibirPresencasEFaltas(maria, poo);
        diarioRegistros.exibirPresencasEFaltas(maria, matematicaDiscreta); // Maria não está na turma de Discreta

        diarioRegistros.exibirAlunosMatriculadosNaTurma(poo);
        diarioRegistros.exibirAlunosMatriculadosNaTurma(matematicaDiscreta);

        diarioRegistros.sair();


    }
}