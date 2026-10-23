package ru.aston.homework3.builder;

public class User {
    private final String firstName; // Required
    private final String secondName; // Required
    private final int age; // Optional

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.secondName = userBuilder.secondName;
        this.age = userBuilder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserBuilder {
        private final String firstName; // Required
        private final String secondName; // Required
        private int age = 0; // Optional

        public UserBuilder(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
