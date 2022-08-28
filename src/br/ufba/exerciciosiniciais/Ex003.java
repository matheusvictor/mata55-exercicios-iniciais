package br.ufba.exerciciosiniciais;

import java.util.Scanner;

// Dado um número inteiro positivo n, verificar se o primeiro e o último são iguais
public class Ex003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();
        } while (numero < 0);

        String numeroComoString = String.valueOf(numero);
        int quantidadeDigitos = (int) (Math.log10(numero) + 1);

        if (numeroComoString.charAt(0) == numeroComoString.charAt(quantidadeDigitos-1)) {
            System.out.println("O primeiro dígito é igual ao último!");
        } else {
            System.out.println("O primeiro dígito é diferente do último!");
        }
    }
}
