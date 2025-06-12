package module_three;

import org.aston.module_three.FileOperationException;
import org.aston.module_three.FileReader;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FileReaderTest {

    private FileReader fileReader;
    private static final String TEST_FILE = "test.txt";
    private static final String TEST_CONTENT = "Hello , my name is Max!";

    @BeforeAll
    static void setUp() throws IOException {
        try (FileWriter writer = new FileWriter(TEST_FILE)) {
            writer.write(TEST_CONTENT);
        }
    }

    @AfterAll
    static void tearDown(){
        new File(TEST_FILE).delete();
    }

    @BeforeEach
    void init() {
        fileReader = new FileReader();
    }

    @Test
    @Order(1)
    public void fileExist(){
        String content = fileReader.readFile(TEST_FILE);
        assertEquals(TEST_CONTENT, content);
    }

    @Test
    @Order(2)
    public void fileDoesNotExist(){
        assertThrows(FileOperationException.class, () -> {
            fileReader.readFile("I_am_not_exist.txt");
        });
    }
}
