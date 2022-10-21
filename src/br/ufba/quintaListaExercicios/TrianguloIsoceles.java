package br.ufba.quintaListaExercicios;

public class TrianguloIsoceles extends Triangulo {

    public TrianguloIsoceles(float x, float y) {
        super(x, y);
    }

    @Override
    public float calcularArea() {
        return (dimensao_x * dimensao_y) / 2;
    }

    // @Override
    // public float calcularPerimetro() {
    //   return (dimensao_x / 2);
    // }

}

