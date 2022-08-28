package br.ufba.exerciciosiniciais;

import java.util.Scanner;

// Dado um número inteiro positivo n, verificar se n é ímpar ou par
public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par!");
        } else {
            System.out.println(numero + " é impar!");
        }
    }
}
