package org.aston.module_two;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeExample {

    private final int intValue = 10;
    private final String stringValue = "Hello";

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        HashCodeExample that = (HashCodeExample) obj;
        return intValue == that.intValue && Objects.equals(stringValue, that.stringValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intValue, stringValue);
    }

    public static void main(String[] args) {
        HashCodeExample hashCodeExampleOne = new HashCodeExample();
        HashCodeExample hashCodeExampleTwo = new HashCodeExample();

        HashMap<String ,String> hashMap = new HashMap<>();

        System.out.println(hashCodeExampleOne.hashCode());
        System.out.println(hashCodeExampleTwo.hashCode());
        System.out.println(System.identityHashCode(hashCodeExampleOne));
        System.out.println(System.identityHashCode(hashCodeExampleTwo));
    }
}
