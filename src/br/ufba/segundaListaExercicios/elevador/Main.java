package br.ufba.segundaListaExercicios.elevador;

// import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a capacidade máxima de pessoas que cabem no elevador: ");
        int capacidadeElevador = sc.nextInt();
        System.out.print("Digite o número de andares do prédio: ");
        int numeroAndares = sc.nextInt();

        Elevador elevador = new Elevador(capacidadeElevador, numeroAndares);

        */

        Elevador elevador = new Elevador(2, 3);

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.sai();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();

    }

}
