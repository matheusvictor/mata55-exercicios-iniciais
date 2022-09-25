package br.ufba.terceiraListaExercicios.serieLimitada;

import java.util.Random;

public class SerieLimitada {

    private int id;
    private static int numeroInstanciasCriadas = 0;
    private final static int maximoDeInstancias = 7;
    private static final Random geradorID = new Random();

    private SerieLimitada() {
        this.id = geradorID.nextInt(1000, 9999);
        numeroInstanciasCriadas++;
    }

    public static SerieLimitada criarInstancia() {
        if (numeroInstanciasCriadas < maximoDeInstancias) {
            SerieLimitada novaInstancia = new SerieLimitada();
            return novaInstancia;
        }
        return null;
    }

    public SerieLimitada obterInstancia() {
        return this;
    }

    public static void imprimirInformacoes(SerieLimitada instancia) {
        System.out.println("ID: " + instancia.id);
        System.out.println("Total de instâncias criadas: " + numeroInstanciasCriadas);
        System.out.println("Total de instâncias permitidas: " + maximoDeInstancias);
        System.out.println("Número de instâncias restantes: " + (maximoDeInstancias - numeroInstanciasCriadas));
    }

    public static void main(String[] args) {

        int contador = 0;
        while (contador <= maximoDeInstancias) {
            SerieLimitada instancia = criarInstancia();

            if (instancia != null)
                imprimirInformacoes(instancia);
            else
                System.out.println("Número máximo de instâncias foi atingido!");
            contador++;
        }

    }

}
