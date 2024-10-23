package posicoes;

public class PosicaoMapa4x4 {
    private int x;
    private int y;

    // Atributo de classe
    private static int numPosicoesOcupadas = 0;

    // Reseta a posição para (0, 0)
    public void reset() {
        this.x = 0;
        this.y = 0;
    }

    // Construtores
    public PosicaoMapa4x4() {
        reset();
        numPosicoesOcupadas++;
    }

    public PosicaoMapa4x4(int x, int y) {
        if ((0 <= x && x < 4) && (0 <= y && y < 4)) {
            this.x = x;
            this.y = y;
            numPosicoesOcupadas++;
        } else {
            System.out.println("Posição inválida!");
        }
    }

    // Métodos set e get para X e Y
    public boolean setX(int x) {
        if (0 <= x && x < 4) {
            this.x = x;
            return true;
        } else {
            System.out.println("Posição inválida!");
            reset();
            return false;
        }
    }

    public boolean setY(int y) {
        if (0 <= y && y < 4) {
            this.y = y;
            return true;
        } else {
            System.out.println("Posição inválida!");
            reset();
            return false;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Retorna o número de posições ocupadas
    public static int getNumPosicoesOcupadas() {
        return numPosicoesOcupadas;
    }

    // Copia a posição atual para um novo objeto
    public PosicaoMapa4x4 copy() {
        return new PosicaoMapa4x4(this.x, this.y);
    }

    // Imprime as coordenadas X e Y
    public void imprime() {
        System.out.println("Posição: (" + this.x + ", " + this.y + ")\n");
    }

    // Calcula a distância (de Manhattan) entre duas posições
    public int distancia(PosicaoMapa4x4 p) {
        return Math.abs(this.x - p.getX()) + Math.abs(this.y - p.getY());
    }

    // Verifica se duas posições são as mesmas
    public static boolean estaoMesmaPosicao(PosicaoMapa4x4 p1, PosicaoMapa4x4 p2) {
        return p1.getX() == p2.getX() && p1.getY() == p2.getY();
    }
}