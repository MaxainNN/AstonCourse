package module_four;

import org.aston.module_four.PrintNumbersInThreads;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrintNumberInThreadsTest {

    @Test
    public void testConsoleOutput() throws InterruptedException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        PrintNumbersInThreads.main(new String[]{});
        Thread.sleep(1000);
        System.setOut(System.out);

        String output = out.toString();
        String[] lines = output.split(System.lineSeparator());

        for (int i = 0; i < lines.length; i++) {
            if (i % 2 == 0){
                assertTrue(lines[i].contains("1"),"Expected '1' at position " + i);
            } else {
                assertTrue(lines[i].contains("2"),"Expected '2' at position " + i);
            }
        }
    }
}
