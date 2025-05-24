package module_one;

import org.aston.module_one.Human;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class ReflectionTest {

    @Test
    @DisplayName("Set name to human object through reflection")
    public void getReflectedParameter() throws Exception {
        Human human = new Human();
        Class<? extends Human> humanClass = human.getClass();

        Field nameField = humanClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(human, "Maxim");

        assertEquals("Maxim", human.getName());
        System.out.println("Name : " + human.getName());
    }
}
