package module_four;

import org.aston.module_four.Livelock;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LivelockTest {

    @Test
    public void testLivelockOccurs() throws InterruptedException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Thread testThread = new Thread(() -> Livelock.main(new String[]{}));
        testThread.start();
        Thread.sleep(2000);
        testThread.interrupt();
        System.setOut(System.out);

        String output = outContent.toString();
        assertTrue(output.contains("Yielding"),
                "Output should contain 'Yielding' (sign of livelock)");
    }
}
