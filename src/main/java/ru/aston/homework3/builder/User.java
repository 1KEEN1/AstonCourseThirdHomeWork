package ru.aston.homework3.builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;

        public UserBuilder() {
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            if (firstName == null || firstName.isBlank()) {
                throw new IllegalStateException("firstName is required");
            }
            if (lastName == null || lastName.isBlank()) {
                throw new IllegalStateException("lastName is required");
            }
            return new User(this);
        }
    }
}
