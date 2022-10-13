package br.ufba.terceiraListaExercicios.vetor;

public class Main {

    public static void main(String[] args) {
        Vetor v = new Vetor(2);
        System.out.println(v);
        v.insert("teste");
        v.insert("teste");
        v.insert("teste");
        v.insert("teste");
        v.insert("teste");

        v.print();

        System.out.println("Tamanho do vetor: " + v.size());

        System.out.println(v.get(5));

    }
}
