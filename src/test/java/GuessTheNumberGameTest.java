import br.com.borges.GuessTheNumberGame;
import br.com.borges.HumanPlayer;
import br.com.borges.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

public class GuessTheNumberGameTest {
    @Mock
    Random targetNumber;

    @Mock
    Player humanPlayer;

    @BeforeEach
    void setup(){
        humanPlayer = new HumanPlayer("Thay");
        humanPlayer.addGuess(90);
    }

    @Test
    @DisplayName("Deve retornar 'É um número menor.' pois o palpite do jogador é mais alto que o alvo")
    void shouldReturnTooHigh() {

        GuessTheNumberGame.setTargetNumber(70);
        Boolean result = GuessTheNumberGame.checkGuess(humanPlayer);

        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Deve retornar 'É um número maior.' pois o palpite do jogador é mais baixo que o alvo")
    void shouldReturnTooLow() {
        humanPlayer.addGuess(30);
        GuessTheNumberGame.setTargetNumber(50);
        Boolean result = GuessTheNumberGame.checkGuess(humanPlayer);

        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Deve retornar 'Parabéns, Thay! Você ganhou!' pois o palpite do jogador é igual ao alvo")
    void shouldReturnEqual() {
        humanPlayer.addGuess(50);
        GuessTheNumberGame.setTargetNumber(50);
        Boolean result = GuessTheNumberGame.checkGuess(humanPlayer);

        Assertions.assertTrue(result);
    }
}
