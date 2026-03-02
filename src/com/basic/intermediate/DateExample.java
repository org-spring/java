package com.basic.intermediate;

import java.io.IOException;
import java.util.Date;

public class DateExample {
    static void main(String[] args) throws IOException {
        Date date = new Date();
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }

}