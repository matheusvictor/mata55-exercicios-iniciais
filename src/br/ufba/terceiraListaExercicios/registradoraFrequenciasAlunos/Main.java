package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        DiarioRegistros diarioRegistros = new DiarioRegistros();

        Aluno jose = diarioRegistros.registrarAluno("José", "18-09-2022");
        Aluno maria = diarioRegistros.registrarAluno("Maria", "19-09-2022");

        Turma mata55 = diarioRegistros.registrarTurma("Programação Orientada a Objetos (MATA55)");

        DiaAula diaAula = diarioRegistros.registrarDiaAula("14-09-2022", "18h30-20h20", mata55, "Java");
        DiaAula diaAula_002 = diarioRegistros.registrarDiaAula("15-09-2022", "16h40-18h30", mata55, "Outra matéria");

        diarioRegistros.registrarFrequencia(jose, diaAula, false );
        diarioRegistros.registrarFrequencia(jose, diaAula, true);
        diarioRegistros.registrarFrequencia(jose, diaAula, true);

        diarioRegistros.exibirPresencasEFaltas(jose, mata55);
        diarioRegistros.exibirPresencasEFaltas(maria, mata55);




    }
}