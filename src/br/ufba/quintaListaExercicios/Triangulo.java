package br.ufba.quintaListaExercicios;

public abstract class Triangulo extends ObjetoGeometrico {

    protected Triangulo(float x, float y) {
        super(x, y);
        super.setNumeroLados(3);
    }

}
