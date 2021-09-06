package com.company;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName = ("Pets.com");
        DotCom two = new DotCom();
        two.setName = ("eToys.com");
        DotCom three = new DotCom();
        three.setName = ("Gog2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your Goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Gog*");
        System.out.println("Try sink them all in the least guesses");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All dot coms are sunk.");
        if (numOfGuesses <= 10) {
            System.out.println("It took you " + numOfGuesses + " guesses");
            System.out.println("You got out.");
        } else {
            System.out.println("Took too long to guess");
            System.out.println("Well done, you destroyed the ocean ecosystem");
        }
    }

    public static void main (String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
