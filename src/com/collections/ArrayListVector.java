package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListVector {
    // everything is same vector also such as List<String> vector = new Vector<>(Arrays.asList("java", "python", "c", "spring", "html", "css", "sql", "hibernate"));
    public static void addMethod() {
        List<String> list1 = new ArrayList<>();
        // add(E)
        list1.add("java");
        list1.add("python");
        list1.add("c");

        // add(index, E)
        list1.add(1, "spring");

        List<String> list2 = new ArrayList<>(Arrays.asList("html", "css"));

        // addAll(Collection)
        list1.addAll(list2);

        // addAll(index, Collection)
        list1.addAll(2, Arrays.asList("sql", "hibernate"));
    }

    public static void removeMethod() {
        List<String> list = new ArrayList<>(Arrays.asList("java", "python", "c", "spring", "html", "css", "sql", "hibernate"));

        // remove(index)
        list.remove(0);

        // remove(Object)
        list.remove("css");

        // removeAll(Collection)
        list.removeAll(Arrays.asList("html", "css", "sql"));

        // retainAll
        list.retainAll(Arrays.asList("java", "python", "spring", "hibernate"));

        // clear()
        list.clear();
    }

    public static void accessModify() {
        List<String> list = new ArrayList<>(Arrays.asList("java", "python", "c", "spring", "html", "css", "sql", "hibernate", "java"));

        // get(index)
        System.out.println(list.get(0));

        // set(index, E)
        list.set(1, "microservices");

        // contains(Object)
        System.out.println(list.contains("java"));

        // indexOf(Object)
        System.out.println(list.indexOf("java"));

        // lastIndexOf(Object)
        System.out.println(list.lastIndexOf("java"));
    }

    public static void sizeState() {
        List<String> list = new ArrayList<>(Arrays.asList("java", "python", "c", "spring", "html", "css", "sql", "hibernate", "java"));

        // size()
        System.out.println(list.size());

        // isEmpty()
        System.out.println(list.isEmpty());

        // toArray()
        Object[] objArray = list.toArray();
        System.out.println(Arrays.toString(objArray));

        // toArray(T[])
        String[] strArray = list.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray));

        // toString()
        System.out.println(list.toString());
    }

    public static void iterationViews() {
        List<String> list = new ArrayList<>(Arrays.asList("java", "python", "c", "spring", "html", "css", "sql", "hibernate", "java"));
        Vector<String> vector = new Vector<>(Arrays.asList("java", "python", "c", "spring", "html", "css", "sql", "hibernate", "java"));

        // iterator()
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // forEach()
        list.forEach(e -> System.out.println(e));

        // subList(from, to)
        List<String> subList = list.subList(0, 2);
        System.out.println(subList);

        // elements()
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    public static void objectMethods() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "python", "c", "spring", "html", "css", "sql", "hibernate", "java"));

        // clone()
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();

        // equals(Object)
        System.out.println(list.equals(clonedList));
    }

    public static void main(String[] args) {

    }
}