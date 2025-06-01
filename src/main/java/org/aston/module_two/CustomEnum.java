package org.aston.module_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum CustomEnum {

    NEW ("New value"),
    DRAFT("Draft value");

    private String description;

    CustomEnum(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> unmodList = Collections.unmodifiableList(integerList);

        System.out.println(integerList.add(10));
//        System.out.println(unmodList.add(10));
    }
}
