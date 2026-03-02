package com.designPatterns.creational;

public class BuilderPattern {
    public static void main(String[] args) {

        User user1 = new User.UserBuilder("mithun").setAge(25).setEmail("mithun@example.com").setAddress("bangalore").build();

        User user2 = new User.UserBuilder("smith").setEmail("smith@example.com").build();

        user1.display();
        user2.display();
    }
}

class User {
    private String name;
    private int age;
    private String email;
    private String address;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    public void display() {
        System.out.println("user: " + name + ", age: " + age + ", email: " + email + ", address: " + address);
    }

    public static class UserBuilder {
        private String name;
        private int age;
        private String email;
        private String address;

        public UserBuilder(String name) {
            this.name = name;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
