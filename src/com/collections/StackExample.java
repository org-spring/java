package com.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push(E)
        stack.push("java");
        stack.push("python");
        stack.push("c");
        System.out.println("stack after push: " + stack);

        // peek
        System.out.println("top element: " + stack.peek());

        // pop
        System.out.println("removed element: " + stack.pop());
        System.out.println("stack after pop: " + stack);

        // empty
        System.out.println("is stack empty? " + stack.empty());

        // search(Object)
        System.out.println("position of java: " + stack.search("java"));
        System.out.println("position of python: " + stack.search("python"));
    }
}
