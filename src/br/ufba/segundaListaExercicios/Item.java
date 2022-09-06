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
        System.out.printf("Descrição: %s", this.descricao);
        System.out.printf("Preço unitário: R$%s", this.preco);
        System.out.printf("Quantidade: %s", this.quantidade);
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
