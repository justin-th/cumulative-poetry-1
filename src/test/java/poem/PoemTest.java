package poem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class PoemTest {
    private Poem poem;

    @Before
    public void setUp() {
        try {
            poem = new Poem(Thread.currentThread().getContextClassLoader().getResourceAsStream("poem"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void validCase() {
        Assert.assertEquals("This is the malth that lay in\n" +
                "\tthe house that Jack built.", poem.revealForTheDay(2));
    }
}
