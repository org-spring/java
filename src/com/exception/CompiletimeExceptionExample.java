package com.exception;

class MarriageException extends Exception {
    String message;

    MarriageException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class CompiletimeExceptionExample {
    static void age(int age) throws MarriageException {
        if (age > 18) {
            System.out.println("happy married life");
        } else {
            throw new MarriageException("invalid age");
        }
    }

    static void main() {
        try {
            age(17);
        } catch (MarriageException e) {
            System.out.println(e.getMessage());
        }
    }
}
