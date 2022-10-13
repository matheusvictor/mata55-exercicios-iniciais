package br.ufba.quartaListaExercicios.carrinhoDeCompras;

public class Main {
    public static void main(String[] args) {

        Carrinho c = new Carrinho();

        Produto p = new Produto(2.0, "Arroz");
        Produto p2 = new Produto(2.0, "Feijão");

        c.adicionarProduto(p, 2);
        c.adicionarProduto(p, 2);
        c.imprimirProdutosDoCarrinho();
        System.out.println("Removendo arroz..");
        c.removerProdutoPorNome(p, "Arroz");
        c.imprimirProdutosDoCarrinho();

    }
}
