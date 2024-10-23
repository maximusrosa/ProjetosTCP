package universidade;

public class Monitor {
    private int semestreAtual;
    private boolean temExperiencia;

    // Construtor padrão
    public Monitor() {
        System.out.println("Monitor criado sem informações.");
    }

    // Construtor com parâmetros
    public Monitor(int semestreAtual, boolean temExperiencia) {
        this.semestreAtual = semestreAtual;
        this.temExperiencia = temExperiencia;
        System.out.println("Monitor criado para o semestre: " + semestreAtual);
    }
}