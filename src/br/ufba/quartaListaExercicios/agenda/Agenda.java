package br.ufba.quartaListaExercicios.agenda;

import java.util.Objects;
import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato c) {
        this.contatos.add(c);
    }

    public void removerContatoPorNome(String nome) {
        for (Contato contato : this.contatos) {
            if (contato.getNome().equals(nome)) {
                System.out.println("Removendo " + nome + "...");
                this.contatos.remove(contato);
            }
        }
    }

    public void removerContatoPorTelefone(String telefone) {
        System.out.println("Removendo...");
        this.contatos.removeIf(contato -> contato.getTelefone().equals(telefone));
    }

    public void alterarNomeContatoPorTelefone(String telefone, String novoNome) {
        Contato contato = obterContatoPorTelefone(telefone);
        if (contato != null) contato.setNome(novoNome);
    }

    public Contato obterContatoPorTelefone(String telefone) {
        for (Contato c : this.contatos) {
            if (c.getTelefone().equals(telefone)) {
                return c;
            }
        }
        return null;
    }

    public Contato obterContatoPorNome(String nome) {
        for (Contato c : this.contatos) {
            if (c.getTelefone().equals(nome)) {
                return c;
            }
        }
        return null;
    }

    private boolean verificarSeContatoNaoExiste(Contato c) {
        for (Contato contato : this.contatos) {
            return contato.getNome().equals(c.getNome()) && Objects.equals(contato.getTelefone(), c.getTelefone());
        }
        return false;
    }

    public void listarContatos() {
        for (Contato c : this.contatos) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Telefone: " + c.getTelefone());
        }
    }

}
