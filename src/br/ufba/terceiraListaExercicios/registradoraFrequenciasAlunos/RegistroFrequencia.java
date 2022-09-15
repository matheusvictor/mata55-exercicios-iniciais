package br.ufba.terceiraListaExercicios.registradoraFrequenciasAlunos;

public class RegistroFrequencia {

    private Aluno aluno;
    private String dataAula;
    private String horaAula;
    private DiaAula diaAula;
    private boolean presenca;


    public RegistroFrequencia(Aluno aluno, DiaAula diaAula, boolean presenca) {
        this.aluno = aluno;
        this.diaAula = diaAula;
        this.dataAula = diaAula.getDataAula();
        this.horaAula = diaAula.getHoraAula();
        this.presenca = presenca;
    }

    public RegistroFrequencia(Aluno aluno, String dataAula, String horaAula, boolean presenca) {
        this.aluno = aluno;
        this.dataAula = dataAula;
        this.horaAula = horaAula;
        this.presenca = presenca;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public DiaAula getDiaAula() {
        return diaAula;
    }

    public String getDataAula() {
        return dataAula;
    }

    public String getHoraAula() {
        return horaAula;
    }
}