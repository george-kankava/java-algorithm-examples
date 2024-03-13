package org.example.sort;

import lombok.Getter;

public class AgeAndNameSort {

    @Getter
    private static class User {

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
        private final int age;
        private final String name;

    }

    private final User [] users = {new User(4, "name2"), new User(10, "name5"), new User(23, "name1")};

    public static void main(String[] args) {

    }
}
