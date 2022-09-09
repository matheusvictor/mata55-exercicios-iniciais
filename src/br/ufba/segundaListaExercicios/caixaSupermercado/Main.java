package br.ufba.segundaListaExercicios.caixaSupermercado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Caixa caixa = new Caixa();

        System.out.print("Deseja abrir o caixa? [1]-Sim [0]-Não/Encerrar = ");
        int opcAbrirCaixa = sc.nextInt();

        if (opcAbrirCaixa == 1) {
            System.out.print("Deseja cadastrar um(a) cliente? [1]-Sim [0]-Não = ");
            int opcCadastrarCliente = sc.nextInt();

            do {
                if (opcCadastrarCliente == 1) {
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = sc.next();

                    Cliente novoCliente = new Cliente(nomeCliente);
                    caixa.registrarCliente(novoCliente);

                    System.out.print("Deseja registrar um novo item? [1]-Sim [0]-Não = ");
                    int opcCadastrarNovoItem = sc.nextInt();

                    do {
                        System.out.print("Descrição/nome do item: ");
                        String descricao = sc.next();
                        System.out.print("Preço: R$");
                        double preco = sc.nextDouble();
                        System.out.print("Quantidade: ");
                        int quantidade = sc.nextInt();

                        Item item = new Item(preco, quantidade, descricao);
                        novoCliente.comprarItem(item);

                        System.out.print("Deseja registrar um novo item? [1]-Sim [0]-Não = ");
                        opcCadastrarNovoItem = sc.nextInt();
                    } while (opcCadastrarNovoItem == 1);

                    System.out.println(novoCliente.obterTotalGasto());

                    System.out.print("Deseja cadastrar outro(a) cliente? [1]-Sim [0]-Não = ");
                    opcCadastrarCliente = sc.nextInt();
                }
            } while (opcCadastrarCliente == 1);

            System.out.print("Deseja fechar o caixa? [1]-Sim [0]-Não = ");
            opcAbrirCaixa = sc.nextInt();

        }

        caixa.fecharCaixa();

    }
}
