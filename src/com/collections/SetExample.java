package com.collections;

import java.util.*;

public class SetExample {
    // add
    public static void add() {
        Set<String> set1 = new HashSet<>();

        // add(E)
        set1.add("java");
        set1.add("python");
        set1.add("c");

        Set<String> set2 = new HashSet<>();
        set2.add("spring");
        set2.add("hibernate");

        // addAll(Collection)
        set1.addAll(set2);
    }

    public static void remove() {
        Set<String> set = new HashSet<>(Arrays.asList("java", "jdbc", "hibernate", "servlet", "spring"));
        // remove(Object)
        set.remove("c");

        // removeAll(Collection)
        set.removeAll(Arrays.asList("hibernate", "servlet"));

        // retainAll(Collection)
        set.retainAll(Arrays.asList("java", "spring"));
    }

    // query
    public static void queryMethods() {
        Set<String> set = new HashSet<>(Arrays.asList("java", "jdbc", "hibernate", "servlet", "spring"));

        // contains(Object)
        System.out.println(set.contains("java"));

        // containsAll(Collection)
        System.out.println(set.containsAll(Arrays.asList("java", "spring")));
    }

    // size & state
    public static void sizeState() {
        Set<String> set = new HashSet<>(Arrays.asList("java", "python", "spring"));

        // size()
        System.out.println(set.size());

        // isEmpty()
        System.out.println(set.isEmpty());

        // clear()
        set.clear();
    }

    // iteration & conversion
    public static void iterationConversion() {
        Set<String> set = new HashSet<>(Arrays.asList("java", "jdbc", "hibernate", "servlet", "spring"));

        // iterator()
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // forEach()
        set.forEach(e -> System.out.println(e));

        // toArray()
        Object[] objArray = set.toArray();
        System.out.println(Arrays.toString(objArray));

        // toString()
        System.out.println(set.toString());
    }

    public static void treeSet() {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));

        // access
        System.out.println(set.first());     // first()
        System.out.println(set.last());         // last()

        // navigation
        System.out.println(set.higher(10));  // higher(E)
        System.out.println(set.lower(30));   // lower(E)

        System.out.println(set.ceiling(25)); // ceiling(E)
        System.out.println(set.floor(25));   // floor(E)

        // remove extremes
        System.out.println(set.pollFirst()); // pollFirst()
        System.out.println(set.pollLast());  // pollLast()

        // order / view
        Set<Integer> descendingSet = set.descendingSet(); // descendingSet()
        System.out.println(descendingSet);
    }

}
