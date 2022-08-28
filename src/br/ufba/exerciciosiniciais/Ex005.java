package br.ufba.exerciciosiniciais;

import java.util.Scanner;

/*
Dizemos que um número natural é triangular se é produto de três números
naturais consecutivos. Exemplo: 120 é triangular, pois 4 ∗ 5 ∗ 6 = 120.
Dado n natural, verificar se n é triangular.
*/
public class Ex005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número natural (positivo): ");
        int numero = sc.nextInt();

        if (numero < 0) numero *= -1; // se o número for negativo, transformá-lo em positivo

        int produto;
        int contador = 1;

        while (contador < numero) {
            int sucessor = contador + 1;
            int sucessorDoSucessor = sucessor + 1;
            produto = contador * sucessor * sucessorDoSucessor;

            if (produto == numero) {
                System.out.println(produto + " é um número triangular, pois é produto de " +
                        contador + " * " + sucessor + " * " + sucessorDoSucessor);
                break;
            }

            contador++;
        }

    }
}

/*
if (produto == numero) {
                System.out.println(produto + " é um número triangular, " +
                        "pois é produto de " +
                        contador + "*" + sucessor + "*" + sucessorDoSucessor);
            }
 */