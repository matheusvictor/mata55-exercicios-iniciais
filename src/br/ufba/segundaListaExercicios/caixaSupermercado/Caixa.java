package br.ufba.segundaListaExercicios.caixaSupermercado;

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

    public void cancelarPedido(Cliente cliente) {
        //TODO
    }

    public int totalClientesAtendidos() {
        return this.clientes.length;
    }

    public double calcularTotalFaturado() {
        for (Cliente cliente : this.clientes) {
            this.totalFaturado += cliente.obterTotalGasto();
        }
        return this.totalFaturado;
    }

    public void fecharCaixa() {
        System.out.println("---------------------- CAIXA ENCERRADO ----------------------");
        System.out.println("Total faturado: R$" + calcularTotalFaturado());
        System.out.println("Número de clientes atendidos: " + totalClientesAtendidos());
        System.out.println("--------------------------------------------------------------");
    }

    public void abrirCaixa() {
        this.totalFaturado = 0;
        this.clientes = new Cliente[0];
    }


}
