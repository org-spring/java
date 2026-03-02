package com.basic.intermediate;

class BookMyShow {

    static void book(int numberOfSeats) { System.out.println("booking tickets by number of seats"); }

    static void book(String movieName) { System.out.println("booking tickets for movie: " + movieName); }

    void book(int numberOfSeats, String movieName) { System.out.println("booking " + numberOfSeats + " seats for movie: " + movieName); }

    void book(String movieName, int numberOfSeats) { System.out.println("booking " + numberOfSeats + " seats for movie: " + movieName); }
}

public class MethodOverloading {
    static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        BookMyShow.book(5); 			
        BookMyShow.book("dies irae"); 	
        bookMyShow.book(3, "dies irae"); 
        bookMyShow.book("dies irae", 2); 
    }
}
