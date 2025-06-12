package module_three;

import org.aston.module_three.FileReader;
import org.aston.module_three.FileWriter;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FileWriterTest {

    private FileWriter fileWriter;
    private FileReader fileReader;

    @Test
    @Order(1)
    public void fileExist(){
        fileWriter = new FileWriter();
        fileReader = new FileReader();

        fileWriter.writeInFile("test.txt", "I will be on new line!");
        String data = fileReader.readFile("test.txt");

        System.out.println(data);
    }

    @Test
    @Order(2)
    public void fileDoesNotExist(){
        fileWriter = new FileWriter();
        fileReader = new FileReader();

        fileWriter.writeInFile("I_am_not_exist.txt", "123");
        String data = fileReader.readFile("I_am_not_exist.txt");

        System.out.println(data);
    }
}
