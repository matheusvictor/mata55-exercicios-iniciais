package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DiarioRegistros registrosGerais = new DiarioRegistros();

        Aluno lista[] = new Aluno[0];

        Aluno maria = new Aluno("Maria", 1, "");

        Turma mata55 = new Turma("POO");

        DiaAula diaAula = new DiaAula("", "", mata55, "");

        System.out.println(maria.getNome());
        System.out.println(mata55.getNomeDisciplina() + " " + mata55.getCodigoTurma());
        System.out.println(diaAula.getDataAula() + " " + diaAula.getHoraAula());

        RegistroFrequencia registro = new RegistroFrequencia(maria, diaAula, true);

        registrosGerais.filtrarAlunosPresentes(diaAula, mata55, registro);
    }
}