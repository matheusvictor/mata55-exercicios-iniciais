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
        int indice = 0;

        MesaDeRestaurante[] mesasExistentes = this.mesas.clone();
        this.mesas = new MesaDeRestaurante[this.mesas.length - 1];

        while (indice < this.mesas.length) {

            if (mesasExistentes[indice].obterNumeroMesa() != numeroMesa) {
                this.mesas[indice] = mesasExistentes[indice];
                System.out.println("Indice: " + indice);
                System.out.println("Mesa adicionada: " + this.mesas[indice].obterNumeroMesa());
                System.out.println("Mesa esperada: " + mesasExistentes[indice].obterNumeroMesa());
            } else {
                quantidadeMesas--;
                System.out.println("ACHEI A MESA " + numeroMesa + "! Agora temos " + quantidadeMesas);
                break;
            }
            indice++;
        }

    }

    public void obterDetalhesMesas() {
        for (int i = 0; i < this.mesas.length; i++) {
            System.out.println("Número da mesa: " + this.mesas[i].obterNumeroMesa());
            System.out.println("Total gasto: R$ " + this.mesas[i].calcularTotal());
        }
    }

    public void fazerPedido(Item pedido) {
        // TODO
    }

    public int obterQuantidadeMesas() {
        return quantidadeMesas;
    }

}
