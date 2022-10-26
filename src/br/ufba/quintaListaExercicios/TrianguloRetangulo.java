package br.ufba.quintaListaExercicios;

public class TrianguloRetangulo extends Triangulo {

    public TrianguloRetangulo(float x, float y) {
        super(x, y);
    }

    @Override
    public float calcularPerimetro() {
        return dimensao_x + dimensao_y + (float)getHipotenusa();
    }

    public double getHipotenusa() {
        return Math.hypot(dimensao_x, dimensao_y);
    }

}
