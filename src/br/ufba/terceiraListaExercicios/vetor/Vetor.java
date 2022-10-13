package br.ufba.terceiraListaExercicios.vetor;

public class Vetor {

    private int tamanho;
    private Vetor[] vetor;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new Vetor[tamanho];
    }

    public void insert(String conteudo) {

    }

    public static void main(String[] args) {
        Vetor v = new Vetor(2);
        Vetor v2 = new Vetor(2);
        System.out.println(v);
        System.out.println(v2);
    }

}
