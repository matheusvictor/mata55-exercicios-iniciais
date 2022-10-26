package br.ufba.quintaListaExercicios;

public class TrianguloIsoceles extends Triangulo {

    public TrianguloIsoceles(float x, float y) {
        super(x, y);
    }

    @Override
    public float calcularPerimetro() {
        return (2 * dimensao_y) + dimensao_x;
    }

}

