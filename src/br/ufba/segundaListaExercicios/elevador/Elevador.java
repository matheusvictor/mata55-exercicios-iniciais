package br.ufba.segundaListaExercicios.elevador;

public class Elevador {

    private int andarAtual;
    private int numeroAndares;
    private int capacidadeElevador;
    private int quantidadePessoasNoElevador;

    public Elevador(int capacidadeElevador, int numeroAndares) { // utilizei o construtor para exercer o papel do método "inicializa" pedido na questão
        this.andarAtual = 0;
        this.numeroAndares = numeroAndares;
        this.quantidadePessoasNoElevador = 0;
        this.capacidadeElevador = capacidadeElevador;
    }

    public void entra() {
        if (this.quantidadePessoasNoElevador >= this.capacidadeElevador) {
            System.out.println("Não é possível entrar no elevador, pois a capacidade máxima foi atingida!");
        } else {
            this.quantidadePessoasNoElevador++;
            System.out.println("Total de pessoas no elevador: " + getQuantidadePessoasNoElevador());
        }
    }

    public void sai() {
        if (this.quantidadePessoasNoElevador > 0) {
            this.quantidadePessoasNoElevador--;
            System.out.println("Total de pessoas no elevador: " + getQuantidadePessoasNoElevador());
        } else {
            System.out.println("Não há pessoas no elevador!");
        }
    }

    public void sobe() {
        if (getAndarAtual() < this.numeroAndares) {
            this.andarAtual = getAndarAtual() + 1;
            System.out.println("Andar atual: " + getAndarAtual());
        } else {
            System.out.println("Não é possível subir, pois o elevador já está no último andar!");
        }
    }

    public void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
            System.out.println("Andar atual: " + getAndarAtual());
        } else {
            System.out.println("Não é possível descer, pois o elevador já está no térreo!");
        }
    }

    public void exibirInformacoesElevador() {
        System.out.println("| Número de andares do prédio: " + getNumeroAndares()
                + " | Andar atual: " + getAndarAtual() + " |");
        System.out.println("| Capacidade do elevador: " + getCapacidadeElevador()
                + " pessoas | Número de pessoas no elevador: " + getQuantidadePessoasNoElevador() + " |");
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getNumeroAndares() {
        return numeroAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public int getQuantidadePessoasNoElevador() {
        return quantidadePessoasNoElevador;
    }

}
