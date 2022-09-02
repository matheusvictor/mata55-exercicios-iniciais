package br.ufba.segundaListaExercicios.restauranteCaseiro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Item moqueca = new Item(75.0, 2, "Moqueca");
        Item farofa = new Item(5.0, 1, "farofa");

        List<Item> produtos = new ArrayList<>() {
            {
                add(moqueca);
                add(farofa);
            }
        };

        MesaDeRestaurante mesa01 = new MesaDeRestaurante();
        System.out.println(mesa01.obterNumeroMesa());
        mesa01.adicionarAoPedido(moqueca);
        mesa01.adicionarAoPedido(farofa);
        System.out.println(mesa01.obterNumeroPedidosRealizados());
        mesa01.zerarPedidos();
        System.out.println(mesa01.obterNumeroPedidosRealizados());
        System.out.println(mesa01.obterNumeroTotalDeItens());

    }
}
