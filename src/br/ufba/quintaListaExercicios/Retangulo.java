package br.ufba.quintaListaExercicios;

public class Retangulo extends ObjetoGeometrico {

    public Retangulo(float x, float y) {
        super(x, y);
        super.setNumeroLados(4);
    }

    @Override
    public float calcularArea() {
        return (dimensao_x * dimensao_y);
    }

    @Override
    public float calcularPerimetro() {
        float metadeDosLados = (getNumeroLados() / 2.0f);
        return (dimensao_x * metadeDosLados) + (dimensao_y * metadeDosLados);
    }

}
