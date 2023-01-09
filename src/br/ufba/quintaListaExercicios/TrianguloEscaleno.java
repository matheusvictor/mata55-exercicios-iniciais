package br.ufba.quintaListaExercicios;

public class TrianguloEscaleno extends Triangulo {

    private float dimensao_z;

    protected TrianguloEscaleno(float x, float y, float z) {
        /*
        No caso deste tipo de triangulo, será considerado que
        os valores de x, y e z serão equivalentes aos seus lados
        e que o valor de x será a referência da base deste triângulo
         */
        super(x, y);
        this.dimensao_z = z;
    }

    public float calcularAreaPorFormulaDeHeron() {
        return 0;
    }

    private float calcularSemiperimetro() {
        return 0;
    }

    @Override
    public float calcularPerimetro() {
        return 0;
    }
}
