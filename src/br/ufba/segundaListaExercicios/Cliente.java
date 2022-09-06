public class Cliente {

    private String nome;
    private int codigoCliente;
    private Item[] itensComprados;
    private static int contadorClientes;

    public Cliente(String nome) {
        this.nome = nome;
        this.itensComprados = new Item[0];
        this.codigoCliente = contadorClientes++;
    }

    public Cliente(String nome, Item[] itensComprados) {
        this.nome = nome;
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

    public double calcularTotalGasto() {
        double total  = 0;
        for (Item itensComprado : this.itensComprados) {
            total += itensComprado.getPreco();
        }
        return total;
    }

    public void exibirItensComprados() {
        for (int i = 0; i < itensComprados.length; i++) {
            this.itensComprados[i].exibirDetalhesDoItem();
        }
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }


}
