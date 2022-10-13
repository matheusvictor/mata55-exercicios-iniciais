package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

public class Aluno {

    private int codigoMatricula = 1000;
    private String nome;
    private int matricula;
    private String dataNascimento;

    public Aluno(String nome, String dataNascimento) {
        codigoMatricula++;
        this.nome = nome;
        this.matricula = codigoMatricula;
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
