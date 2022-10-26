package br.ufba.quintaListaExercicios;

public abstract class ObjetoGeometrico {

    private int numeroLados;
    protected float dimensao_x;
    protected float dimensao_y;

    public ObjetoGeometrico(float x, float y) {
        this.dimensao_x = x;
        this.dimensao_y = y;
        this.numeroLados = 0;
    }

    protected void setNumeroLados(int n) {
        this.numeroLados = n;
    }

    public int getNumeroLados() {
        return this.numeroLados;
    }

    public abstract float calcularArea();

    public abstract float calcularPerimetro();

}
