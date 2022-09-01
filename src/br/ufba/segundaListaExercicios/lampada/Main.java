package br.ufba.segundaListaExercicios.lampada;

public class Main {

    public static void main(String[] args) {

        Lampada minhaLampada = new Lampada();

        minhaLampada.mostraEstado();
        System.out.println(minhaLampada.mostraLuminosidade());

        minhaLampada.acende();
        minhaLampada.mostraEstado();

        minhaLampada.defineLuminosidade(50);
        System.out.println(minhaLampada.mostraLuminosidade());
        minhaLampada.mostraEstado();

    }

}