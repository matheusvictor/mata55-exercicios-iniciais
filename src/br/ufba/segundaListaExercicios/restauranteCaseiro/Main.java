package br.ufba.segundaListaExercicios.restauranteCaseiro;

public class Main {

    public static void main(String[] args) {

        RestauranteCaseiro resurante = new RestauranteCaseiro("A vergonha da profissíon");

        System.out.println(resurante.obterQuantidadeMesas());

        resurante.adicionarMesa();
        System.out.println(resurante.obterQuantidadeMesas());

        resurante.adicionarMesa();
        System.out.println(resurante.obterQuantidadeMesas());

        resurante.adicionarMesa();
        System.out.println(resurante.obterQuantidadeMesas());

        resurante.excluirMesa(2);
        System.out.println(resurante.obterQuantidadeMesas());

        resurante.obterDetalhesMesas();

        Item moqueca = new Item(75.0, 2, "Moqueca");
        Item farofa = new Item(5.0, 1, "farofa");

    }
}
