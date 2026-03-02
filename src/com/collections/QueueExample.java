package com.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    // add / offer
    public static void addOffer() {
        Queue<String> queue = new PriorityQueue<>();

        // add(E)
        queue.add("java");
        queue.add("python");

        // offer(E)
        queue.offer("c");
        queue.offer("spring");

        // addAll(Collection)
        queue.addAll(Arrays.asList("hibernate", "sql"));

        System.out.println(queue);
    }

    // access / peek
    public static void accessPeek() {
        Queue<String> queue = new PriorityQueue<>(Arrays.asList("java", "python", "c"));

        // peek()
        System.out.println(queue.peek());

        // element()
        System.out.println(queue.element());
    }

    // remove
    public static void removeMethods() {
        Queue<String> queue = new PriorityQueue<>(Arrays.asList("java", "python", "c"));

        // poll()
        System.out.println(queue.poll());

        // remove()
        System.out.println(queue.remove());

        // remove(Object)
        queue.remove("python");

        System.out.println(queue);
    }

    // size & state
    public static void sizeState() {
        Queue<String> queue = new PriorityQueue<>(Arrays.asList("java", "python", "c"));

        // size()
        System.out.println(queue.size());

        // isEmpty()
        System.out.println(queue.isEmpty());

        // clear()
        queue.clear();
    }

    // query
    public static void queryMethods() {
        Queue<String> queue = new PriorityQueue<>(Arrays.asList("java", "python", "c"));

        // contains(Object)
        System.out.println(queue.contains("java"));
    }

    // iteration & conversion
    public static void iterationConversion() {
        Queue<String> queue = new PriorityQueue<>(Arrays.asList("java", "python", "c"));

        // iterator()
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // forEach()
        queue.forEach(e -> System.out.println(e));

        // toArray()
        Object[] arr = queue.toArray();
        System.out.println(Arrays.toString(arr));
    }

    // ordering
    public static void ordering() {
        PriorityQueue<String> queue = new PriorityQueue<>(Arrays.asList("java", "python", "c"));

        // comparator()
        System.out.println(queue.comparator());
    }
}
