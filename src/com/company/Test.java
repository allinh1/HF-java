package com.company;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        c.m1();
        c.m2();
        c.m3();
    }

    static class A {
        int ivar = 7;

        void m1() {
            System.out.print("A's m1, ");
        }

        void m2() {
            System.out.print("A's m2, ");
        }

        void m3() {
            System.out.print("A's m3, ");
        }
    }

    static class B extends A {
        void m1() {
            System.out.print("B's m1, ");
        }
    }

    static class C extends B {
        void m3() {
            System.out.print("C's m3, " + (ivar + 6));
        }
    }
}
//        int numOfGuesses = 0;
//        GameHelper helper = new GameHelper();
//
//        DotCom theDotCom = new DotCom(); // instantiate a SDC object
//
////        String result = theDotCom.checkYourself(guess);
//
//        int randomNum = (int) (Math.random()*5);
//        int[] locations = {randomNum, randomNum+1, randomNum+2};
//
//        theDotCom.setLocationCells[locations];
//        boolean isAlive = true;
//        while (isAlive == true) {
//            String guess = helper.getUserInput("enter a number");
//            String result = theDotCom.checkYourself(guess);
//            numOfGuesses++;
//            if (result.equals("kill")) {
//                isAlive = false;
//                System.out.println("You took " + numOfGuesses + " guesses");
//            }
//        }

//        String testResults = "failed";
//        if (result.equals("hit")) {
//            testResults = "passed";
//        }
//        System.out.println(testResults);


//        int x = 0;
//        Triangle[] ta = new Triangle[4];
//        while (x < 4) {
//            ta[x] = new Triangle();
//            ta[x].height = (x + 1) * 2;
//            ta[x].length = x + 4;
//            ta[x].setArea();
//        }
//
//        int y = x;
//
//        x = 27;
//        Triangle t5 = ta[2];
//        ta[2].area = 342;
//        System.out.print("y = " + y);
//        System.out.println(", t5 area = " + t5.area);
//    }


//        int [] index = new int[4];
//
//        index[0] = 1;
//        index[1] = 3;
//        index[2] = 0;
//        index[3] = 2;
//
//        String [] islands = new String[4];
//        islands[0] = "Bermuda";
//        islands[1] = "Fiji";
//        islands[2] = "Azores";
//        islands[3] = "Cstuf";
//
//        int y = 0;
//        int ref;
//
//        while (y < 4) {
//            ref = index[y];
//            System.out.print("island = ");
//            System.out.println(islands[ref]);
//            y++;
//        }

//        Hobbits[] h = new Hobbits[3];
//        int z = 0;
//
//        while (z < 3) {
//            z = z + 1;
//            h[z] = new Hobbits();
//            h[z].name = "bilbo";
//            if (z == 0) {
//                h[z].name = "frodo";
//            }
//            if (z == 1) {
//                h[z].name = "sam";
//            }
//            System.out.print(h[z].name + " is a ");
//            System.out.println("good Hobbit name");
//        }


//        Books[] myBooks = new Books[3];
//
//        int x = 0;
//
//        myBooks[0]= new Books();
//        myBooks[1] = new Books();
//        myBooks[2] = new Books();
//
//        myBooks[0].title = "Book1";
//        myBooks[1].title = "Book2";
//        myBooks[2].title = "Book3";
//        myBooks[0].author = "A1";
//        myBooks[1].author = "A2";
//        myBooks[2].author = "A3";
//
//        System.out.println(myBooks[0].title);
//
//        while (x < myBooks.length) {
//            System.out.print(myBooks[x].title);
//            System.out.print(" by ");
//            System.out.println(myBooks[x].author);
//            x++;
//        }


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
