package universidade;

public class Aluno {
    private int numeroMatricula;
    private float indiceDesempenho;

    // Construtor padrão
    public Aluno() {
        System.out.println("Aluno criado sem matrícula.");
    }

    // Construtor com parâmetros
    public Aluno(int numeroMatricula, float indiceDesempenho) {
        this.numeroMatricula = numeroMatricula;

        if (!setIndiceDesempenho(indiceDesempenho)) {
            System.out.println("Índice de desempenho fora do intervalo permitido.");
            return;
        }
        System.out.println("Aluno criado com matrícula: " + numeroMatricula);
    }

    // Setter e Getter
    public boolean setIndiceDesempenho(float indiceDesempenho) {
        if (indiceDesempenho < 0.0f || indiceDesempenho > 10.0f) {
            return false;
        } else {
            this.indiceDesempenho = indiceDesempenho;
            return true;
        }
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void aumentaIndiceDesempenho(float aumento) {
        if (this.indiceDesempenho + aumento > 10.0f) {
            System.out.println("Índice de desempenho não pode ser maior que 10.");
        } else {
            this.indiceDesempenho += aumento;
            System.out.println("Índice de desempenho aumentado.");
        }
    }

    public void diminuiIndiceDesempenho(float decrescimo) {
        if (this.indiceDesempenho - decrescimo < 0.0f) {
            System.out.println("Índice de desempenho não pode ser menor que 0.");
        } else {
            this.indiceDesempenho -= decrescimo;
            System.out.println("Índice de desempenho diminuído.");
        }
    }

    public void imprime() {
        System.out.println("Matrícula: " + numeroMatricula + " - Índice de desempenho: " + indiceDesempenho);
    }
}

