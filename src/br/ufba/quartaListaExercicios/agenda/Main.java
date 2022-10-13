package br.ufba.quartaListaExercicios.agenda;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Contato maria = new Contato("Maria", "12345");

        agenda.adicionarContato(maria);
        agenda.listarContatos();
        agenda.alterarNomeContatoPorTelefone("12345", "João");
        agenda.listarContatos();
        agenda.removerContatoPorTelefone("12345");
        agenda.listarContatos();

    }
}