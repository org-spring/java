package com.collections;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListExample {
    public static void addMethods() {
        LinkedList<String> list = new LinkedList<>();
        // add(E)
        list.add("java");

        // addFirst(E)
        list.addFirst("python");

        // addLast(E)
        list.addLast("c");

        // offer(E)
        list.offer("spring");

        // offerFirst(E)
        list.offerFirst("html");

        // offerLast(E)
        list.offerLast("css");
    }

    public static void removePoll() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("java", "python", "c", "spring", "hibernate", "sql", "html"));
        // remove()
        list.remove();

        // removeFirst()
        list.removeFirst();

        // removeLast()
        list.removeLast();

        // poll()
        list.poll();

        // pollFirst()
        list.pollFirst();

        // pollLast()
        list.pollLast();
    }

    public static void peek() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("java", "python", "c", "spring", "hibernate", "sql", "html"));
        // peek()
        System.out.println(list.peek());

        // peekFirst()
        System.out.println(list.peekFirst());

        // peekLast()
        System.out.println(list.peekLast());
    }

    public static void iteration() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("java", "python", "c", "spring", "hibernate", "sql", "html"));

        // iterator()
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // forEach()
        list.forEach(e -> System.out.println(e));

        // listIterator()
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        // descendingIterator()
        Iterator<String> descItr = list.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }
    }

    public static void accessSearch() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("java", "microservices", "python", "c", "spring", "hibernate", "sql", "html"));

        // get(int index)
        System.out.println(list.get(0));

        // set(int index, E element)
        list.set(1, "microservices");

        // contains(Object)
        System.out.println(list.contains("java"));

        // indexOf(Object)
        System.out.println(list.indexOf("java"));

        // lastIndexOf(Object)
        System.out.println(list.lastIndexOf("java"));

    }

    public static void main(String[] args) {

    }
}
