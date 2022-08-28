package br.ufba.exerciciosiniciais;

import java.util.Scanner;

// Dado um número inteiro positivo n, verificar se n contém dois dígitos consecutivos iguais.
public class Ex002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero < 0) numero *= -1; // se o número for negativo, transformá-lo em positivo

        String numeroComoString = String.valueOf(numero);

        for (int contador = 1; contador < numeroComoString.length(); contador++) {
            int digito = numeroComoString.charAt(contador);
            if (digito == numeroComoString.charAt(contador - 1)) {
                System.out.print("tem sim, sinhó");
                break;
            }
        }
    }
}
