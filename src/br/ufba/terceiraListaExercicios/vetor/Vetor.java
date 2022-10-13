package br.ufba.terceiraListaExercicios.vetor;

public class Vetor {

    private String[] vetor;
    private static int indice = 0;

    public Vetor(int tamanho) {
        this.vetor = new String[tamanho];
    }

    public void insert(String conteudo) {
        if (this.vetor[indice] == null) {
            this.vetor[indice] = conteudo;
            indice++;

            if (indice >= this.vetor.length) {
                System.out.println("Indice maior que vetor original!");

                System.out.println("Criando vetor aux...");
                String[] vetorAuxiliar = new String[this.vetor.length];
                for (int i = 0; i < this.vetor.length; i++) {
                    vetorAuxiliar[i] = vetor[i];
                }

                System.out.println("Aumentando tamanho do vetor...");
                this.vetor = new String[this.vetor.length + 1];

                System.out.println("Tamanho do vetor aux: " + vetorAuxiliar.length);
                System.out.println("Novo tamanho do vetor orig: " + this.vetor.length);

                System.out.println("Copiando vetor...");
                for (int i = 0; i < vetorAuxiliar.length; i++) {
                    vetor[i] = vetorAuxiliar[i];
                }
            }
        }

    }

    public String get(int index) {
        if (this.vetor[index] != null) {
            return this.vetor[index];
        }
        return null;
    }

    public int size() {
        return (this.vetor.length - 1);
    }

    public void print() {
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.println("[" + i + "] -> " + this.vetor[i]);
        }
    }

    public void printAuxVector() {
        for (int i = 0; i < this.vetor.length; i++) {
            System.out.println("[" + i + "] -> " + this.vetor[i]);
        }
    }
    }

    public static void main(String[] args) {
        Vetor v = new Vetor(2);
        Vetor v2 = new Vetor(2);
        System.out.println(v);
        System.out.println(v2);
    }
}
