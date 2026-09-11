import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PritheeTest {

    @Test
    public void testCorrectAnswer() {
        Prithee game = new Prithee();

        boolean result = game.checkAnswer("summer", "summer");

        assertTrue(result);
    }

    @Test
    public void testIncorrectAnswer() {
        Prithee game = new Prithee();

        boolean result = game.checkAnswer("winter", "summer");

        assertFalse(result);
    }

    @Test
    public void testCapitalizationDoesNotMatter() {
        Prithee game = new Prithee();

        boolean result = game.checkAnswer("SUMMER", "summer");

        assertTrue(result);
    }

    @Test
    public void testPunctuationDoesNotMatter() {
        Prithee game = new Prithee();

        boolean result = game.checkAnswer("day", "day?");

        assertTrue(result);
    }

    @Test
    public void testCleanWord() {
        Prithee game = new Prithee();

        assertEquals("temperate", game.cleanWord("temperate:"));
    }
}