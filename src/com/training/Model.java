package com.training;

public class Model {
    private int maxNumber;
    private int minNumber;
    private int userNumber;
    private int gameNumber;


    public Model() {
        maxNumber = 100;
        minNumber = 0;
        gameNumber = (int)(Math.random()*100);
    }
    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }
    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
        if(userNumber > gameNumber) maxNumber = userNumber;
        else if(userNumber < gameNumber) minNumber = userNumber;
    }
    public int getGameNumber() {
        return gameNumber;
    }
    public boolean isGameNumber(int userNum) {
        return userNum == gameNumber? true: false;

    }
}
