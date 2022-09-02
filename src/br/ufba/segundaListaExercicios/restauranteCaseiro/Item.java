package br.ufba.segundaListaExercicios.restauranteCaseiro;

public class Item {

    private double preco;
    private int quantidade;
    private String descricao;

    public Item(double preco, int qtd, String desc) {
        this.preco = preco;
        this.quantidade = qtd;
        this.descricao = desc;
    }

    public double obterPreco() {
        return this.preco;
    }

    public int obterQuantidade() {
        return this.quantidade;
    }

    public String obterDescricao() {
        return this.descricao;
    }
}
