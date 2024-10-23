package universidade;

import java.util.ArrayList;

public class Turma {
    private int numAlunos;
    private int numMonitores;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Monitor> monitores;

    public static final int MIN_ALUNOS = 10;
    public static final int MAX_ALUNOS = 40;

    // Construtor padrão
    public Turma() {
        professor = new Professor();
        alunos = new ArrayList<>();
        monitores = new ArrayList<>();
        System.out.println("Turma criada sem dados.");
    }

    // Construtor com parâmetros
    public Turma(Professor professor, ArrayList<Monitor> monitores, ArrayList<Aluno> alunos) {
        setProfessor(professor);

        if (!setMonitores(monitores)) {
            System.out.println("Número de monitores fora do intervalo permitido.");
            return;
        }

        if (!setAlunos(alunos)) {
            System.out.println("Número de alunos fora do intervalo permitido.");
            return;
        }

        System.out.println("Turma criada com informações.");
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public boolean setMonitores(ArrayList<Monitor> monitores) {
        if (monitores.size() <= 3) {
            this.monitores = monitores;
            numMonitores = monitores.size();
            return true;
        } else {
            return false;
        }
    }

    public boolean setAlunos(ArrayList<Aluno> alunos) {
        if (alunos.size() >= MIN_ALUNOS && alunos.size() <= MAX_ALUNOS) {
            this.alunos = alunos;
            numAlunos = alunos.size();
            return true;
        } else {
            return false;
        }
    }

    public void adicionaAluno(Aluno aluno) {
        if (alunos.size() <= MAX_ALUNOS) {
            alunos.add(aluno);
            numAlunos = alunos.size();
            System.out.println("Aluno adicionado.");
        } else {
            System.out.println("Número máximo de alunos atingido.");
        }
    }

    public void removeAluno() {
        if (!alunos.isEmpty()) {
            Aluno alunoRemovido = alunos.removeLast();
            numAlunos = alunos.size();
            System.out.println("Aluno removido: " + alunoRemovido.getNumeroMatricula());
        } else {
            System.out.println("Nenhum aluno para remover.");
        }
    }

    // Getters
    public int getNumMonitores() {
        return numMonitores;
    }
    
    public int getNumAlunos() {
        return numAlunos;
    }
    
    public void imprimeAlunos() {
        for (Aluno aluno : alunos) {
            aluno.imprime();
        }
    }
}
