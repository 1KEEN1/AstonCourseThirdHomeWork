package ru.aston.homework3.builder;

public class Main {
    public static void main(String[] args) {
        User firstUser = User.builder()
                .firstName("Jeremy")
                .lastName("Johnson")
                .age(21)
                .build();

        User secondUser = User.builder()
                .firstName("Samanta")
                .lastName("Swan")
                .build();

        System.out.println(firstUser);
        System.out.println(secondUser);
    }
}
