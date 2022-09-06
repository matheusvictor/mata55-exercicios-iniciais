public class Caixa {


    private Cliente[] clientes;
    private double totalFaturado;

    public Caixa() {
        this.totalFaturado = 0;
        this.clientes = new Cliente[0];
    }

    public void registrarCliente(Cliente cliente) {
        Cliente[] clientesRegistrados = this.clientes.clone();

        this.clientes = new Cliente[clientesRegistrados.length + 1];

        for (int i = 0; i < this.clientes.length; i++) {
            if (i == (this.clientes.length - 1)) {
                this.clientes[i] = cliente;
            } else this.clientes[i] = clientesRegistrados[i];
        }
    }

    public void adicionarItemAoPedido(Cliente cliente, Item item) {
        cliente.comprarItem(item);
    }

    public int totalClientesAtendidos() {
        return this.clientes.length;
    }

    public double calcularTotal() {
        double total = 0;
        if (clientes.length > 0) {
            for (Cliente cliente : clientes) {
                total += cliente.calcularTotalGasto();
            }
        }
        return total;
    }

    public void fecharCaixa() {
        this.totalFaturado = calcularTotal();
        System.out.printf("Total faturado: R$" + this.totalFaturado);
        System.out.printf("Número de clientes atendidos: " + this.clientes.length);
    }

    public void abrirCaixa() {
        this.totalFaturado = 0;
        this.clientes = new Cliente[0];
    }


}
