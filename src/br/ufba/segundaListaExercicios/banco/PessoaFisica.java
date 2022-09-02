package br.ufba.segundaListaExercicios.banco;

public class PessoaFisica {

    private String nome;
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String obterNome() {
        return this.nome;
    }

    public String obterCpf() {
        return this.cpf;
    }

    public String obterDataNascimento() {
        return this.dataNascimento;
    }
    
}
