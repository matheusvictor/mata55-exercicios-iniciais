package br.ufba.quartaListaExercicios.carrinhoDeCompras;

import java.util.Random;

public class Produto {

    private int codigo;
    private double preco;
    private double desconto;
    private String nomeProduto;

    private static final Random geradorID = new Random();

    public Produto(double preco, double desconto, String nomeProduto) {
        this.codigo = geradorID.nextInt(1000, 9999);
        this.preco = preco;
        this.desconto = (desconto / 100);
        this.nomeProduto = nomeProduto;
    }

    public Produto(double preco, String nomeProduto) {
        this.codigo = geradorID.nextInt(1000, 9999);
        this.preco = preco;
        this.desconto = 0.0;
        this.nomeProduto = nomeProduto;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getPreco() {
        return this.preco;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", preco=" + preco +
                ", desconto=" + desconto +
                ", nomeProduto='" + nomeProduto + '\'' +
                '}';
    }
}
