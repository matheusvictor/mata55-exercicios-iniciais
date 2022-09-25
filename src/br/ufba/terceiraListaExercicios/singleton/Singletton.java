package br.ufba.terceiraListaExercicios.singleton;

class Singleton {

    private int id;
    private static Singleton s;

    private Singleton() { // tornando o construtor da Classe privado que nenhuma outra classe externa poder instanciá-lo
        id = 1;
    }

    public static Singleton getInstance() {
        if (s == null) s = new Singleton();
        return s;
    }

    public int getId() {
        return this.id;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());

        System.out.println(Singleton.getInstance());
    }

}