package br.ufba.terceiraListaExercicios.singleton;

public class Singleton {

    private static Singleton s;

    private Singleton() { } // tornando o construtor da Classe privado que nenhuma outra classe externa poder instanciá-lo

    public static Singleton getInstance() {
        if (s == null) s = new Singleton();
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());

        System.out.println(Singleton.getInstance());
    }

}