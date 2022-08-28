package br.ufba.exerciciosiniciais;

import java.util.Scanner;

// Dados dois números inteiros positivos, determinar o máximo divisor comum entre eles
// utilizando o algoritmo de Euclides.
public class Ex006 {

    public static int encontraMDC(int a, int b) {
        int restoDaDivisao = a % b;

        if (restoDaDivisao == 0) return b;

        a = b;
        b = restoDaDivisao;

        return encontraMDC(a, b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número inteiro (positivo): ");
        int primeiroNumero = sc.nextInt();
        if (primeiroNumero < 0) primeiroNumero *= -1;

        System.out.print("Digite o 2º número inteiro (positivo): ");
        int segundoNumero = sc.nextInt();
        if (segundoNumero < 0) segundoNumero *= -1;

        System.out.printf("MDC(%s, %s) = %s", primeiroNumero, segundoNumero, encontraMDC(primeiroNumero, segundoNumero));

    }
}
