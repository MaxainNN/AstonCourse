package org.aston.module_one;

import java.lang.reflect.Field;

public class ReflectionExample {

    static class Human {

        private String name;

        public Human(String name){
            this.name = name;
        }

        public Human(){

        }

        public String getName(){
            return name;
        }
    }


    public static void main(String[] args) throws Exception{
        Human human = new Human();

        Class<? extends Human> aClass= human.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(human,"Maxim");
        //System.out.println(classLoader);

        System.out.println("Human name after reflection: " + human.getName());
    }
}
