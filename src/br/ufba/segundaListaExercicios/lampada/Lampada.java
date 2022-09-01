package br.ufba.segundaListaExercicios.lampada;

public class Lampada {

    private String estado;
    private int luminosidade;
    private boolean ehQueimada;

    public Lampada() {
        this.luminosidade = 0;
        this.ehQueimada = false;
        this.estado = Constantes.desligada;
    }

    public Lampada(int luminosidade) {
        defineLuminosidade(luminosidade);
    }

    public void acende() {
        this.luminosidade = 100;
        this.estado = Constantes.ligada;
    }

    public void apaga() {
        this.luminosidade = 0;
        this.estado = Constantes.desligada;
    }

    public void defineLuminosidade(int luminosidade) {

        if (luminosidade > 100) {
            this.luminosidade = 0;
            this.ehQueimada = true;
            this.estado = Constantes.desligada; // uma lâmpada queimada, é uma lâmpada apagada também
        } else {
            if (luminosidade > 0 && luminosidade <= 50) {
                this.estado = Constantes.meiaLuz;
            } else if (luminosidade > 50) {
                this.estado = Constantes.ligada;
            } else {
                this.estado = Constantes.desligada;
            }
            this.luminosidade = luminosidade;
        }

    }

    public void mostraEstado() {
        if (estaQueimada()) {
            System.out.println(
                    "A lâmpada está queimada! Portanto, está " + this.estado + " com "
                            + this.luminosidade + "% de luminosidade.");
        }

        System.out.println("Estado da lâmpada: " + this.estado);
        System.out.println("Luminosidade: " + this.luminosidade + "%");

    }

    public int mostraLuminosidade() {
        return this.luminosidade;
    }

    public boolean estaQueimada() {
        return this.ehQueimada;
    }


}
