package poem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class PoemTest {

    Poem getDefaultPoem() {
        try {
            return new Poem(getClass().getClassLoader().getResourceAsStream("defaultPoem.txt"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Nested
    class revealForDayTests {
        @Test
        void revealForDay1() {
            Poem poem = getDefaultPoem();
            Assertions.assertEquals("This is the house that Jack built.\n",
                    poem.revealForTheDay(1));
        }

        @Test
        void revealForDay2() {
            Poem poem = getDefaultPoem();
            Assertions.assertEquals("This is the malth that lay in\n" +
                    "\tthe house that Jack built.\n", poem.revealForTheDay(2));
        }

        @Nested
        class InvalidInputTest {
            @Test
            void dayIsZero() {
                Poem poem = getDefaultPoem();
                Assertions.assertEquals("No poem for day 0.",
                        poem.revealForTheDay(0));
            }

            @Test
            void dayIsNegative() {
                Poem poem = getDefaultPoem();
                Assertions.assertEquals("No poem for day -2.",
                        poem.revealForTheDay(-2));
            }

            @Test
            void dayIsGreaterThanPoemLength() {
                Poem poem = getDefaultPoem();
                Assertions.assertEquals("No poem for day 16.",
                        poem.revealForTheDay(16));
            }
        }
    }
}
