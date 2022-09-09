package br.ufba.segundaListaExercicios.caixaSupermercado;

public class Item {

    private double preco;
    private int quantidade;
    private String descricao;

    public Item(double preco, int quantidade, String descricao) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public void exibirDetalhesDoItem() {
        System.out.printf("Descrição: %s \n", this.descricao);
        System.out.printf("Preço unitário: R$%s \n", this.preco);
        System.out.printf("Quantidade: %s \n", this.quantidade);
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
