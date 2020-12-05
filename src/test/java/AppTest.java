import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUpStream() {
        System.setOut(new PrintStream( outputStream));
    }

    @Test
    public void testMainApp() {
        App.main(null);
        String expected = "Hello, World" +
                System.getProperty("line.separator");

        org.junit.Assert.assertTrue(expected.equals( outputStream.toString()));

    }


}
