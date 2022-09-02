package br.ufba.segundaListaExercicios.banco;

public class ContaCorrente {

    private static final int contador = 100;// atributo de instância
    private int numeroConta;
    private double saldo;
    private boolean ehEspecial;
    private PessoaFisica titular;

    public ContaCorrente(PessoaFisica titular) {
        this.saldo = 0;
        this.titular = titular;
        this.ehEspecial = false;
        this.numeroConta = contador + 1;
    }

    public ContaCorrente(PessoaFisica titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
        this.ehEspecial = true;
        this.numeroConta = contador + 1;
    }

    public void sacar(int valor) {
        if (valor <= this.saldo) this.saldo -= valor;
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public boolean ehEspecial() {
        return this.ehEspecial;
    }

    public void imprimirDetalhes() {
        System.out.printf("Número da conta: %s \n", this.numeroConta);
        System.out.printf("Saldo: R$ %s \n", this.saldo);
        System.out.printf("Especial: %s \n", this.ehEspecial);
        System.out.printf("Titular: %s \n", this.titular.obterNome());
    }

}
