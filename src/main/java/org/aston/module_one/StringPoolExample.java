package org.aston.module_one;

public class StringPoolExample {

    public static void main(String[] args) {
        String s1 = "String1";
        String s2 = "String1";
        String s3 = new String("String1");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1 == i2); // false

        String stringForTest = "str";

        StringBuilder sb = new StringBuilder(stringForTest);

        for (int i = 0; i < 10000; i++) {
            sb.append("str");
        }
        stringForTest = sb.toString();

        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringForTest += "str";
        }
        long time1 = System.currentTimeMillis();
        System.out.println(time1 - time);
    }
}
