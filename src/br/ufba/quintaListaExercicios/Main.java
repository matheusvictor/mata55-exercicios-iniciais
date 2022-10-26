package br.ufba.quintaListaExercicios;

public class Main {

    public static void main(String[] args) {

//        Retangulo r = new Retangulo(2, 2);
//        System.out.println(r.calcularArea());
//        System.out.println(r.calcularPerimetro());

//        Triangulo trianguloIsoceles = new TrianguloIsoceles(8, 15);
//        System.out.println(trianguloIsoceles.calcularArea());
//        System.out.println(trianguloIsoceles.calcularPerimetro());

        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo(15, 8);
        System.out.println(trianguloRetangulo.calcularPerimetro());
        System.out.println(trianguloRetangulo.getHipotenusa());

//        Circulo c = new Circulo(2, 2, 4);
//        System.out.println(c.getNumeroLados());
//        System.out.println(c.calcularArea());
//        System.out.println(c.calcularPerimetro());
    }

}
