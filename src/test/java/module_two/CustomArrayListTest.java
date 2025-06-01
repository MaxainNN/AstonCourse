package module_two;

import org.aston.module_two.homework.CustomArrayList;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomArrayListTest {

    private CustomArrayList<String> arrayListWithStrings;
    private CustomArrayList<Integer> arrayListWithIntegers;

    @Test
    @Order(1)
    @DisplayName("Test with strings")
    public void stringValueInArrayList(){
        arrayListWithStrings = new CustomArrayList<>();

        arrayListWithStrings.add("First");
        arrayListWithStrings.add("Second");
        arrayListWithStrings.add(1, "Middle");

        List<String> anotherList = Arrays.asList("A", "B", "C");
        arrayListWithStrings.addAll(anotherList);

        assertEquals(arrayListWithStrings.get(2),"Second");
        System.out.println("Element at index 2: " + arrayListWithStrings.get(2));

        arrayListWithStrings.remove(0);
        arrayListWithStrings.remove("B");

        assertEquals(arrayListWithStrings.size(), 4);
        System.out.println("Size: " + arrayListWithStrings.size());
    }

    @Test
    @Order(2)
    @DisplayName("Test with integers")
    public void integerValueInArrayList(){
        arrayListWithIntegers = new CustomArrayList<>();

        arrayListWithIntegers.add(1);
        arrayListWithIntegers.add(3);
        arrayListWithIntegers.add(7);
        arrayListWithIntegers.add(2);

        List<Integer> listWithIntegers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
        arrayListWithIntegers.addAll(listWithIntegers);

        assertEquals(arrayListWithIntegers.get(1), 3);
        assertEquals(arrayListWithIntegers.get(2), 7);
        assertEquals(arrayListWithIntegers.get(3), 2);
        assertEquals(arrayListWithIntegers.get(4), 1);
        assertEquals(arrayListWithIntegers.get(5), 2);

        System.out.println("Element at index 1: " + arrayListWithIntegers.get(1));
        System.out.println("Element at index 2: " + arrayListWithIntegers.get(2));
        System.out.println("Element at index 3: " + arrayListWithIntegers.get(3));
        System.out.println("Element at index 4: " + arrayListWithIntegers.get(4));
        System.out.println("Element at index 5: " + arrayListWithIntegers.get(5));

        arrayListWithIntegers.remove(1);
        arrayListWithIntegers.remove(14);

        assertEquals(arrayListWithIntegers.size(), 19);
        System.out.println("Size: " + arrayListWithIntegers.size());
    }
}
