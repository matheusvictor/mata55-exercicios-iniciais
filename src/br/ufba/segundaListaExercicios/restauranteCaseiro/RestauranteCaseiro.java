package br.ufba.segundaListaExercicios.restauranteCaseiro;

public class RestauranteCaseiro {

    private static int quantidadeMesas = 0;
    private String nomeRestaurante;
    private MesaDeRestaurante[] mesas;

    public RestauranteCaseiro(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
        this.mesas = new MesaDeRestaurante[0];
    }

    public RestauranteCaseiro(String nomeRestaurante, int qtdMesas) {
        this.nomeRestaurante = nomeRestaurante;
        this.mesas = new MesaDeRestaurante[qtdMesas];
    }

    public void adicionarMesa() {
        MesaDeRestaurante[] mesas = this.mesas.clone();
        this.mesas = new MesaDeRestaurante[this.mesas.length + 1];

        for (int i = 0; i < this.mesas.length; i++) {
            if (i == (this.mesas.length - 1)) {
                this.mesas[i] = new MesaDeRestaurante();
            } else this.mesas[i] = mesas[i];
        }
        quantidadeMesas++;
    }

    public void excluirMesa(int numeroMesa) {

        for (int i = 0; i < this.mesas.length; i++) {
            if (this.mesas[i].obterNumeroMesa() == numeroMesa) {
                // TODO
            }
        }
        quantidadeMesas--;
    }

    public void fazerPedido(Item pedido) {
        // TODO
    }

    public int obterQuantidadeMesas() {
        return quantidadeMesas;
    }

}
