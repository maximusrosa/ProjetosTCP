import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PontuacaoJogoTest {

    private PontuacaoJogo pontuacaoJogo;

    @BeforeEach
    void setUp() {
        pontuacaoJogo = new PontuacaoJogo();
    }

    @Test
    @DisplayName("Teste de adicionar pontos")
    void testAdicionarPontos() {
        pontuacaoJogo.adicionarPontos(10);
        pontuacaoJogo.adicionarPontos(5);
        assertEquals(15, pontuacaoJogo.getPontos());
    }

    @Test
    @DisplayName("Teste de perder vida (não pode ser negativo)")
    void testPerderVida() {
        pontuacaoJogo.perderVida();
        assertEquals(2, pontuacaoJogo.getVidas());
        pontuacaoJogo.perderVida();
        pontuacaoJogo.perderVida();
        pontuacaoJogo.perderVida();
        assertEquals(0, pontuacaoJogo.getVidas());
    }

    @Test
    @DisplayName("Teste de avançar nível")
    void testAvancarNivel() {
        pontuacaoJogo.avancarNivel();
        assertEquals(2, pontuacaoJogo.getNivel());
    }

    @Test
    @DisplayName("Teste de resetar")
    void testResetar() {
        pontuacaoJogo.adicionarPontos(10);
        pontuacaoJogo.perderVida();
        pontuacaoJogo.avancarNivel();
        pontuacaoJogo.resetar();
        assertEquals(0, pontuacaoJogo.getPontos());
        assertEquals(3, pontuacaoJogo.getVidas());
        assertEquals(1, pontuacaoJogo.getNivel());
    }
}