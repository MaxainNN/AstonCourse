package org.aston.module_two.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Max", Arrays.asList(
                        new Book("Programming for newbies", 2014, 381),
                        new Book("English for decent people", 2010, 280),
                        new Book("Python Clean Code", 2022, 1062),
                        new Book("AI project on Python", 2025, 642),
                        new Book("Internship in company that doesn't like you", 2023, 45)
                )),
                new Student("Alina", Arrays.asList(
                        new Book("Beauty and the Beast", 2001, 250),
                        new Book("Little Mermaid", 2003, 320),
                        new Book("Snow White", 2019, 280),
                        new Book("Encyclopedia for children", 2020, 350),
                        new Book("Rich Dad Poor Dad", 1997, 208)
                )),
                new Student("George", Arrays.asList(
                        new Book("Spider man 1994 Comix book", 2024, 290),
                        new Book("Philosophy", 2007, 1320),
                        new Book("Psychology", 2012, 112),
                        new Book("Economy", 2017, 543),
                        new Book("Math", 2021, 578)
                ))
        );

        students.stream()
                .peek(System.out::println) // sout all students
                .flatMap(student -> student.getBooks().stream()) // get all books from all students
                .sorted(Comparator.comparingInt(Book::getPages)) // sort depends on pages
                .distinct() // Only unique books
                .filter(book -> book.getYear() > 2000) // filter depends on year
                .limit(3) // limit 3 elements
                .map(Book::getYear) // get year from books
                .findFirst() // short-circuit method - returns Optional
                .ifPresentOrElse( // Optional handle
                        year -> System.out.println("Year : " + year),
                        () -> System.out.println("Book not found.")
                );

        /**
         * peek() - print each student (uses overridden toString)
         * flatMap() - convert the stream of students to a stream of their books
         * sorted() - sort the books by the number of pages
         * distinct() - keep only unique books (need equals/hashCode)
         * filter() - keep books published after 2000
         * limit() - limit the stream to 3 elements
         * map() - convert books to their years of publication
         * findFirst() - short-circuit method, returns Optional
         * ifPresentOrElse() - process Optional (print year or absence message)
         */
    }
}
