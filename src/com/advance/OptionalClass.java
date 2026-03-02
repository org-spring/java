package com.advance;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClass {
    static void ofNull() {
        String name = null;
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.orElse("null"));
    }

    static void ifPresentOr() {
        Optional<String> optional = Optional.empty();

        try {
            optional.ifPresentOrElse(x -> {
                System.out.println(x);
            }, () -> System.out.println("hello world"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void main(String[] args) {
        UserService userService = new UserService();
        String name = userService.getUserNameById(1).orElseThrow(() -> new NoSuchElementException("user not found"));
        System.out.println(name);
    }
}

// real-time example
class UserService {
    Optional<String> getUserNameById(int id) {
        if (id == 1) {
            return Optional.of("smith");
        }
        return Optional.empty();
    }
}