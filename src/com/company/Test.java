package com.company;

public class Test {

    public static void main(String[] args) {

        Books[] myBooks = new Books[3];

        int x = 0;

        myBooks[0]= new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Book1";
        myBooks[1].title = "Book2";
        myBooks[2].title = "Book3";
        myBooks[0].author = "A1";
        myBooks[1].author = "A2";
        myBooks[2].author = "A3";

        System.out.println(myBooks[0].title);

        while (x < myBooks.length) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }


//        Dog dog1 = new Dog();
//        dog1.bark();
//        dog1.name = "Bart";
//
//        // Dog Array
//        Dog[] myDogs = new Dog[3];
//
//        myDogs[0] = new Dog();
//        myDogs[1] = new Dog();
//        myDogs[2] = dog1;
//
//        myDogs[0].name = "Fred";
//        myDogs[1].name = "Marge";
//
//        System.out.println(myDogs[2].name);
//        myDogs[2].bark();
//        System.out.println(myDogs[0].name);
//        System.out.println(myDogs[1].name);
//
//        int x = 0;
//        while (x < myDogs.length) {
//            myDogs[x].bark();
//            x++;
//        }






//        DrumKit d = new DrumKit();
//        d.playSnare();
//        d.snare = false;
//        d.playTopHat();
//
//
//
//        if (d.snare) {
//            d.playSnare();
//        }



//        TapeDeck t = new TapeDeck();
////        t.canRecord = true;
//        t.playTape();
//
//        if (t.canRecord == true) {
//            t.recordTape();
//        }

//        DVDPlayer d = new DVDPlayer();
//        d.canRecord = true;
//        d.playDVD();
//
//        if (d.canRecord) {
//            d.recordDVD();
//        }


//        Dog d = new Dog(); // make the Dog object 'd'
//        d.size = 40; // dot operator to set d.size to int 40.
//        d.bark(); // call bark method in d
//
//        System.out.println(d.size);

//    This is not OO
//        Movie one = new Movie();
//        one.title = "Gone with the Stock";
//        one.genre = "Tragic";
//        one.rating = -2;
//
//        Movie two = new Movie();
//        two.title = "Lost in Cubicle Space";
//        two.genre = "Comedy";
//        two.rating = 5;
//        two.playIt();
//        System.out.println(one.title);
//
//        Movie three = new Movie();
//        three.title = "Space Jam";
//        three.genre = "Drama";
//        three.rating = 127;


    }
}

