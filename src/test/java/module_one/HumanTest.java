package module_one;

import org.aston.module_one.Human;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HumanTest {

    @Test
    @Order(1)
    @DisplayName("Create human with default constructor")
    void testDefaultConstructor() {
        Human human = new Human();
        assertNull(human.getName());
        assertNull(human.getAge());
        assertNull(human.getOccupation());
        System.out.println("Human after creation with empty constructor : ");
        System.out.println("Name : " + human.getName());
        System.out.println("Age : " + human.getAge());
        System.out.println("Occupation : " + human.getOccupation());
    }

    @Test
    @Order(2)
    @DisplayName("Create human with parametrized constructor")
    void testParameterizedConstructor() {
        Human human = new Human("Alice", 30, "Engineer");
        assertEquals("Alice", human.getName());
        assertEquals(30, human.getAge());
        assertEquals("Engineer", human.getOccupation());
        System.out.println("Human after creation with constructor with params: ");
        System.out.println("Name : " + human.getName());
        System.out.println("Age : " + human.getAge());
        System.out.println("Occupation : " + human.getOccupation());
    }

    @Test
    @Order(3)
    @DisplayName("Create human with default constructor and set fields value")
    void testSettersAndGetters() {
        Human human = new Human();
        human.setName("Bob");
        human.setAge(25);
        human.setOccupation("Doctor");
        assertEquals("Bob", human.getName());
        assertEquals(25, human.getAge());
        assertEquals("Doctor", human.getOccupation());
        System.out.println("Human after creation with empty constructor and set params through setters: ");
        System.out.println("Name : " + human.getName());
        System.out.println("Age : " + human.getAge());
        System.out.println("Occupation : " + human.getOccupation());
    }
}
