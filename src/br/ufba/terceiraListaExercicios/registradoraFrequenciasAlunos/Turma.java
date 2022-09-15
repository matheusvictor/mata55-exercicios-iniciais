package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

public class Turma {

    private static int contadorDisciplinas;

    private static int codigo;
    private String nomeDisciplina;

    public Turma(String nomeDisciplina) {
        contadorDisciplinas++;
        this.codigo = contadorDisciplinas;
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCodigoTurma() {
        return this.codigo;
    }

    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }

}
