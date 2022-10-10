package br.ufba.quartaListaExercicios.carrinhoDeCompras;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto p) {
        this.produtos.add(p);
    }

    public void adicionarProduto(Produto p, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            this.produtos.add(p);
        }
    }

    public void removerProduto(Produto p) {
        this.produtos.remove(p);
    }

    public void removerProdutoPorNome(Produto p, String nome) {
        if (p.getNomeProduto().equals(nome)) {
            this.produtos.remove(p);
        }
    }

    public void removerQuantidadeDeProdutoPorNome(Produto p, int quantidade, String nome) {
        if (p.getNomeProduto().equals(nome)) {
            this.produtos.remove(p);
        }
    }

    public void esvaziarCarrinho() {
        this.produtos.removeAll(this.produtos);
    }

    public int obterTotalProdutosNoCarrinho() {
        return this.produtos.size();
    }

    public double calcularTotalAPagar() {
        double total = 0;
        for (Produto p : this.produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public void imprimirProdutosDoCarrinho() {
        for (Produto p : this.produtos) {
            System.out.println(p);
        }
    }

}
