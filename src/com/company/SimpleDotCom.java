package com.company;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess); // convert the string to int
        String result = "miss";

        for (int cell : locationCells) { // repeat each cell in the locationCells array.
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }



    public void setLocationCells(int[] loc) {
        locationCells = loc;
    }
}
