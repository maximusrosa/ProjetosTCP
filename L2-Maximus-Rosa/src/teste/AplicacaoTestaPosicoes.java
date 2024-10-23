package teste;
import posicoes.PosicaoMapa4x4;
import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoTestaPosicoes {
    private static final int MAP_WIDTH = 4;
    private static final int MAP_HEIGHT = 4;

    private static void imprimeMapa(ArrayList<PosicaoMapa4x4> posicoes) {
        for (int i = 0; i < MAP_HEIGHT; i++) {
            for (int j = 0; j < MAP_WIDTH; j++) {
                boolean found = false;

                for (PosicaoMapa4x4 posicao : posicoes) {
                    if (posicao.getX() == j && posicao.getY() == i) {
                        System.out.print("X ");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PosicaoMapa4x4 posicao1 = new PosicaoMapa4x4();
        PosicaoMapa4x4 posicao2 = new PosicaoMapa4x4();
        PosicaoMapa4x4 posicao3;
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do {
            System.out.println("Digite o valor de x: ");
            x = scanner.nextInt();
            System.out.println("Digite o valor de y: ");
            y = scanner.nextInt();
            System.out.print("\n");

        } while (!posicao1.setX(x) || !posicao1.setY(y));

        posicao1.imprime();

        do {
            System.out.println("Digite o valor de x: ");
            x = scanner.nextInt();
            System.out.println("Digite o valor de y: ");
            y = scanner.nextInt();
            System.out.print("\n");

        } while (!posicao2.setX(x) || !posicao2.setY(y));

        posicao2.imprime();

        scanner.close();

        posicao3 = posicao1.copy();

        System.out.println("p1 e p2: " + (PosicaoMapa4x4.estaoMesmaPosicao(posicao1, posicao2)?
                "Posições Iguais" : "Posições Diferentes" + "\n"));
        System.out.println("p2 e p3: " + (PosicaoMapa4x4.estaoMesmaPosicao(posicao2, posicao3)?
                "Posições Iguais" : "Posições Diferentes" + "\n"));
        System.out.println("p1 e p3: " + (PosicaoMapa4x4.estaoMesmaPosicao(posicao1, posicao3)?
                "Posições Iguais" : "Posições Diferentes" + "\n"));
        System.out.print("\n");

        ArrayList<PosicaoMapa4x4> posicoes = new ArrayList<>();
        posicoes.add(posicao1);
        posicoes.add(posicao2);
        posicoes.add(posicao3);

        imprimeMapa(posicoes);
    }
}