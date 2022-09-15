package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

public class DiaAula {

    private String dataAula;
    private String horario;

    private Turma turma;

    private String conteudo;

    public DiaAula(String dataAula, String horario, Turma turma, String conteudo) {
        this.turma = turma;
        this.horario = horario;
        this.conteudo = conteudo;
        this.dataAula = dataAula;
    }

    public Turma getTurma() {
        return this.turma;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getDataAula() {
        return this.dataAula;
    }

    public String getHoraAula() {
        return this.horario;
    }


}