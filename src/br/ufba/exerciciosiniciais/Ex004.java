package br.ufba.exerciciosiniciais;

import java.util.Scanner;

/*
Dado um número inteiro positivo n e dois números naturais não nulos i e j,
imprimir em ordem crescente os n primeiros naturais que são múltiplos de i ou de j
ou de ambos. Exemplo: Para n = 6, i = 2 e j = 3 a saída deverá ser 0, 2, 3, 4, 6, 8.
*/
public class Ex004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        if (numero < 0) numero *= -1; // se o número for negativo, transformá-lo em positivo

        System.out.print("Digite i: ");
        int i = sc.nextInt();

        System.out.print("Digite j: ");
        int j = sc.nextInt();

        int[] multiplos = new int[numero];

        int quantidadeMultiplos = 0;
        int contador = 0;

        while (quantidadeMultiplos < numero) {
            if (contador % 2 == 0 || contador % 3 == 0) {
                multiplos[quantidadeMultiplos] = contador;
                quantidadeMultiplos++;
            }
            contador++;
        }

        for (int multiplo : multiplos) {
            System.out.print(multiplo + " ");
        }

    }
}
