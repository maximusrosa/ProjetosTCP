public class PontuacaoJogo {
    private int pontos;
    private int nivel;
    private int vidas;

    public PontuacaoJogo() {
        resetar();
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVidas() {
        return vidas;
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public void perderVida() {
        if (vidas > 0) {
            vidas--;
        }
    }

    public void avancarNivel() {
        nivel++;
    }

    public void resetar() {
        pontos = 0;
        nivel = 1;
        vidas = 3;
    }
}