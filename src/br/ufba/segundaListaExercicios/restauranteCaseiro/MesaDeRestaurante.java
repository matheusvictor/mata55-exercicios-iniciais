package br.ufba.segundaListaExercicios.restauranteCaseiro;

import java.util.ArrayList;
import java.util.List;

public class MesaDeRestaurante {

    private List<Item> itens;
    private int numeroMesa = 0;
    private int quantidadePedidosRealizados;

    public MesaDeRestaurante() {
        this.numeroMesa++;
        this.itens = new ArrayList<>();
        this.quantidadePedidosRealizados = 0;
    }

    public void adicionarAoPedido(Item item) {
        this.itens.add(item);
        this.quantidadePedidosRealizados++;
    }

    public void zerarPedidos() {
        this.itens = new ArrayList<>(); // melhorar isso
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
}
