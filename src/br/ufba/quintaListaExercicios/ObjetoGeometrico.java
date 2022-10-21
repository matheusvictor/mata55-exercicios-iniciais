package br.ufba.quintaListaExercicios;

public class ObjetoGeometrico {

    private int numeroLados;
    protected float dimensao_x;
    protected float dimensao_y;

    public ObjetoGeometrico(float x, float y) {
        this.dimensao_x = x;
        this.dimensao_y = y;
        this.numeroLados = 2;
    }

    protected void setNumeroLados(int n) {
        this.numeroLados = n;
    }

    public float getNumeroLados() {
        return this.numeroLados;
    }

    public ObjetoGeometrico(int n) {
        this.numeroLados = n;
    }

    public float calcularArea() {
        return (this.dimensao_x * this.dimensao_y);
    }

    public float calcularPerimetro() {
        return (this.dimensao_x * this.numeroLados) + (this.dimensao_y * this.numeroLados);
    }

}
