package br.ufba.segundaListaExercicios.banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PessoaFisica titular = new PessoaFisica("Matheus Victor", "123", "02-06-1998");

        System.out.print("Deseja abrir uma conta especial? (1- Sim 2- Não) = ");
        int opc = sc.nextInt();

        if (opc == 1) {
            System.out.println("Esse tipo de conta necessita de um depósito inicial!");
            System.out.print("Informe o valor que deseja depositar para abrir a conta: R$ ");
            double valor = sc.nextDouble();
            ContaCorrente conta = new ContaCorrente(titular, valor);

            conta.imprimirDetalhes();
            conta.depositar(100);
            conta.sacar(50);
            conta.imprimirDetalhes();
        } else {
            ContaCorrente conta = new ContaCorrente(titular);
            conta.imprimirDetalhes();
            conta.depositar(100);
            conta.sacar(50);
            conta.imprimirDetalhes();
        }

    }
}
