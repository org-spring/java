package com.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {

    int sno;
    String sname;

    public Student(int sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    @Override
    public int compareTo(Student student) {
        return this.sno - student.sno;
    }
}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student one, Student two) {
        return one.sname.compareTo(two.sname);
    }
}

public class ComparableComparator {
    static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(Arrays.asList(new Student(3, "smith"), new Student(1, "allen"), new Student(2, "wards")));

        // comparable
        Collections.sort(list);

        // comparator
        Collections.sort(list, new SortByName());

        for (Student s : list) {
            System.out.println(s.sno + " " + s.sname);
        }
    }
}
