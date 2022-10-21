package br.ufba.quintaListaExercicios;

public class Main {

    public static void main(String[] args) {
        // Retangulo r = new Retangulo(2, 2);
        // System.out.println(r.calcularArea());
        // System.out.println(r.calcularPerimetro());

        Triangulo t = new Triangulo(2, 2);
        System.out.println(t.calcularArea());
        System.out.println(t.calcularPerimetro());

        Circulo c = new Circulo(2, 2, 4);
        System.out.println(c.calcularArea());
        System.out.println(c.calcularPerimetro());
    }

}
