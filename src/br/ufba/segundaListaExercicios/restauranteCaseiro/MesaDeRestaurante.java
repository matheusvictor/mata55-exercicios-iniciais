package br.ufba.segundaListaExercicios.restauranteCaseiro;

public class MesaDeRestaurante {

    private static int contadorMesas = 0;
    private Item[] itens;
    private int numeroMesa;
    private int quantidadePedidosRealizados;

    public MesaDeRestaurante() {
        contadorMesas++;
        this.itens = new Item[0];
        this.numeroMesa = contadorMesas;
        this.quantidadePedidosRealizados = 0;
    }

    public MesaDeRestaurante(Item[] itens) {
        contadorMesas++;
        this.itens = itens;
        this.numeroMesa = contadorMesas;
        this.quantidadePedidosRealizados = 0;
    }

    public void adicionarAoPedido(Item item) {
        Item[] pedidosDaMesa = this.itens.clone(); // clono a lista de pedidos anteriores
        this.itens = new Item[this.itens.length + 1]; // sobrescrevo o vetor para ter o tamanho equivalente a qtd. de
        // pedidos + 1 do novo pedido

        for (int i = 0; i < this.itens.length; i++) {
            if (i == (this.itens.length - 1)) {
                this.itens[i] = item; // adiciono o o novo item à última posição do vetor
            } else this.itens[i] = pedidosDaMesa[i]; // preencho o novo vetor com os pedidos anteriores
        }
        this.quantidadePedidosRealizados++;
    }

    public void zerarPedidos() {
        this.itens = new Item[0];
        this.quantidadePedidosRealizados = 0;
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.obterPreco();
        }
        return total;
    }

    public int obterNumeroMesa() {
        return this.numeroMesa;
    }

    public int obterNumeroPedidosRealizados() {
        return this.quantidadePedidosRealizados;
    }

    public int obterNumeroTotalDeItens() {
        int total = 0;
        for (Item item : itens) {
            total += item.obterQuantidade();
        }
        return total;
    }

    public double obterValorTotalDosPedidos() {
        double total = 0;
        for (Item item : itens) {
            total = item.obterQuantidade() * item.obterPreco();
        }
        return total;
    }
}
