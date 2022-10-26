package br.ufba.quintaListaExercicios;

public class Circulo extends ObjetoGeometrico {

    private static final float PI = 3.14f;
    private float raio;

    public Circulo(float x, float y, float r) {
        super(x, y);
        this.raio = r;
    }

    public float getRaio() {
        return this.raio;
    }

    @Override
    public float calcularArea() {
        return (PI * (this.raio * this.raio));
    }

    @Override
    public float calcularPerimetro() {
        return ((2 * PI) * this.raio);
    }

    public float calcularDiametro() {
        return (2 * this.raio);
    }

}
