package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

    // add / put
    public static void addMethod() {
        Map<Integer, String> map1 = new HashMap<>();

        // put(K, V)
        map1.put(1, "java");
        map1.put(2, "python");
        map1.put(3, "c");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(4, "spring");
        map2.put(5, "hibernate");

        // putAll(Map)
        map1.putAll(map2);
    }

    // remove / clear
    public static void removeMethod() {
        //	Map<Integer, String> map = new HashMap<>(Map.ofEntries(Map.entry(1, "java"), Map.entry(2, "jdbc"), Map.entry(3, "hibernate"), Map.entry(4, "servlet")));
        Map<Integer, String> map = new HashMap<>(Map.of(1, "java", 2, "jdbc", 3, "hibernate", 4, "servlet"));

        // remove(K)
        map.remove(3);

        // clear()
        map.clear();
    }

    // access / query
    public static void accessQuery() {
        Map<Integer, String> map = new HashMap<>(Map.of(1, "java", 2, "jdbc", 3, "hibernate", 4, "servlet"));

        // get(K)
        System.out.println(map.get(1));

        // containsKey(K)
        System.out.println(map.containsKey(2));

        // containsValue(V)
        System.out.println(map.containsValue("java"));

        // getOrDefault(K, defaultV)
        System.out.println(map.getOrDefault(5, "not found"));
    }

    // size & state
    public static void sizeState() {
        Map<Integer, String> map = new HashMap<>(Map.of(1, "java", 2, "jdbc", 3, "hibernate", 4, "servlet"));

        // size()
        System.out.println(map.size());

        // isEmpty()
        System.out.println(map.isEmpty());
    }

    // views / iteration
    public static void viewsIteration() {
        Map<Integer, String> map = new HashMap<>(Map.of(1, "java", 2, "jdbc", 3, "hibernate", 4, "servlet"));

        // keySet()
        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        // values()
        Collection<String> values = map.values();
        System.out.println(values);

        // entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

        // for
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }

    // replace & conditional
    public static void replaceConditional() {
        Map<Integer, String> map = new HashMap<>(Map.of(1, "java", 2, "jdbc", 3, "hibernate", 4, "servlet"));

        // replace(K, V)
        map.replace(1, "core java");

        // replace(K, oldV, newV)
        map.replace(3, "hibernate", "hibernate orm");

        // putIfAbsent(K, V)
        map.putIfAbsent(5, "spring");
    }

    // compute & merge methods
    public static void computeMerge() {
        Map<Integer, String> map = new HashMap<>(Map.of(1, "java", 2, "jdbc", 3, "hibernate", 4, "servlet"));

        // computeIfAbsent()
        map.computeIfAbsent(5, k -> "aws");

        // computeIfPresent()
        map.computeIfPresent(1, (k, v) -> v + " programming");

        // compute()
        map.compute(3, (k, v) -> v + " orm");

        // merge()
        map.merge(2, " api", (oldV, newV) -> oldV + newV);
    }

    // tree map specific
    public static void treeMap() {
        TreeMap<Integer, String> map = new TreeMap<>(Map.of(1, "java", 2, "jdbc", 3, "hibernate", 4, "servlet", 5, "spring"));
        // firstKey()
        System.out.println(map.firstKey());

        // lastKey()
        System.out.println(map.lastKey());

        // headMap(K)
        System.out.println(map.headMap(3));

        // tailMap(K)
        System.out.println(map.tailMap(3));

        // subMap(K1, K2)
        System.out.println(map.subMap(2, 5));

        // comparator()
        System.out.println(map.comparator());
    }

    public static void main(String[] args) {

    }
}