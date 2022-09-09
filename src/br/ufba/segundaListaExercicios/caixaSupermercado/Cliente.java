package br.ufba.segundaListaExercicios.caixaSupermercado;

public class Cliente {

    private String nome;
    private int codigoCliente;
    private double totalGasto;
    private Item[] itensComprados;
    private static int contadorClientes;

    public Cliente(String nome) {
        this.nome = nome;
        this.totalGasto = 0;
        this.itensComprados = new Item[0];
        this.codigoCliente = contadorClientes++;
    }

    public Cliente(String nome, Item[] itensComprados) {
        this.nome = nome;
        this.totalGasto = 0;
        this.itensComprados = itensComprados;
        this.codigoCliente = contadorClientes++;
    }

    public void comprarItem(Item item) {
        Item[] itensJaComprados = this.itensComprados.clone();
        this.itensComprados = new Item[this.itensComprados.length + 1];

        for (int i = 0; i < this.itensComprados.length; i++) {
            if (i == (this.itensComprados.length - 1)) {
                this.itensComprados[i] = item;
            } else this.itensComprados[i] = itensJaComprados[i];
        }
    }

    public void comprarItens(Item[] listaItens) {
        //TODO
    }

    private double calcularTotalGasto() {
        for (int i =0; i < this.itensComprados.length; i++) {
            this.totalGasto += (this.itensComprados[i].getPreco() * this.itensComprados[i].getQuantidade());
        }
        return this.totalGasto;
    }

    public void exibirItensComprados() {
        System.out.println("---------------------- NOTA FISCAL ----------------------");
        System.out.printf("Cliente: %s \n", this.nome);
        System.out.println("*********************************************************");
        for (int i = 0; i < itensComprados.length; i++) {
            this.itensComprados[i].exibirDetalhesDoItem();
            System.out.println("*********************************************************");
        }
        System.out.println("-------------------------- FIM --------------------------");
    }

    public double obterTotalGasto() {
        return calcularTotalGasto();
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }


}
