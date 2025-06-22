package module_four;

import org.aston.module_four.Deadlock;
import org.junit.jupiter.api.Test;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeadlockTest {

    @Test
    public void testDeadlockOccurs() throws InterruptedException {
        Thread testThread = new Thread(() -> Deadlock.main(new String[]{}));
        testThread.start();

        Thread.sleep(1000);
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        long[] deadlockedThreads = threadBean.findDeadlockedThreads();

        assertTrue(deadlockedThreads != null && deadlockedThreads.length > 0,
                "Deadlock should be detected");
    }
}
