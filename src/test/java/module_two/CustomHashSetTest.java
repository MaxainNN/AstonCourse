package module_two;

import org.aston.module_two.homework.CustomHashSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomHashSetTest {

    private CustomHashSet<String> setWithStrings;
    private CustomHashSet<Integer> setWithIntegers;

    @Test
    @DisplayName("Test with strings")
    public void stringValuesInHashSet(){
        setWithStrings = new CustomHashSet<>();
        boolean addFirstHelloElement = setWithStrings.add("Hello");
        boolean addFirstWorldElement = setWithStrings.add("World");
        boolean addSecondHelloElement = setWithStrings.add("Hello");

        boolean removeHelloElement = setWithStrings.remove("Hello");
        boolean removeJavaHelloElement = setWithStrings.remove("Aston");

        assertEquals(addFirstHelloElement, true);
        assertEquals(addFirstWorldElement, true);
        assertEquals(addSecondHelloElement, false);
        assertEquals(removeHelloElement, true);
        assertEquals(removeJavaHelloElement, false);

        System.out.println("Add first Hello element : " + addFirstHelloElement);
        System.out.println("Add first World element : " + addFirstWorldElement);
        System.out.println("Add second Hello element : " + addSecondHelloElement);
        System.out.println("Remove Hello element : " + removeHelloElement);
        System.out.println("Remove Java element : " + removeJavaHelloElement);
    }

    @Test
    @DisplayName("Test with integers")
    public void integerValuesInHashSet(){
        setWithIntegers = new CustomHashSet<>();

        boolean addFirstOneElement = setWithIntegers.add(1);
        boolean addSecondOneElement = setWithIntegers.add(1);
        boolean removeTwoElement = setWithIntegers.remove(2);

        assertEquals(addFirstOneElement, true);
        assertEquals(addSecondOneElement, false);
        assertEquals(removeTwoElement, false);

        System.out.println("Add first one element : " + addFirstOneElement);
        System.out.println("Add second one element : " + addSecondOneElement);
        System.out.println("Remove two element : " + removeTwoElement);
    }
}
