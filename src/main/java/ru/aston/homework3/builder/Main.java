package ru.aston.homework3.builder;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User.UserBuilder("Jeremy", "Johnson")
                .age(21)
                .build();

        User secondUser = new User.UserBuilder("Samanta", "Swan")
                .build();

        System.out.println(firstUser);
        System.out.println(secondUser);
    }
}
