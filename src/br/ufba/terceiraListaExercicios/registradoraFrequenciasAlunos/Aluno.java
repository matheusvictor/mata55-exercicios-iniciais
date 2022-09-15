package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

public class Aluno {

    private String nome;
    private int matricula;
    private String dataNascimento;

    public Aluno(String nome, int matricula, String dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }
}
