package br.ufba.quintaListaExercicios;

public abstract class Triangulo extends ObjetoGeometrico {

    protected Triangulo(float x, float y) {
        super(x, y);
        super.setNumeroLados(3);
    }

    @Override
    public float calcularArea() {
        return (dimensao_x * dimensao_y) / 2;
    }

}
