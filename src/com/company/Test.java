package com.company;

public class Test {
    public static void main(String[] args) {

        Dog d = new Dog(); // make the Dog object 'd'
        d.size = 40; // dot operator to set d.size to int 40.
        d.bark(); // call bark method in d

        System.out.println(d.size);


        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        one.title = "Space Jam";
        one.genre = "Drama";
        one.rating = 127;
    }
}

