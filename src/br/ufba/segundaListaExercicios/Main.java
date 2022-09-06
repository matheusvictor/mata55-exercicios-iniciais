public class Main {

    public static void main(String[] args) {

        Caixa caixa = new Caixa();
        System.out.println(caixa.totalClientesAtendidos());

        Cliente cliente_01 = new Cliente("João");
        Cliente cliente_02 = new Cliente("maria");

        caixa.registrarCliente(cliente_01);
        caixa.registrarCliente(cliente_02);
        System.out.println(caixa.totalClientesAtendidos());

        Item item_01 = new Item(2.0, 1, "Farinha");
        Item item_02 = new Item(2.0, 1, "Farinha");

        cliente_01.comprarItem(item_01);

        caixa.adicionarItemAoPedido(cliente_01, item_01);
        caixa.adicionarItemAoPedido(cliente_01, item_02);
        System.out.println(caixa.calcularTotal());

    }
}
