package com.training;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;
    private int counter;

    public Controller(View view,Model model) {
        this.view = view;
        this.model = model;

    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        validateUserNumber(sc);
    }



    private int validateUserNumber(Scanner sc) {
        int num = 0;
        while(true) {
            view.printWithNumbers(View.INPUT_NUMBER, model.getMinNumber(), model.getMaxNumber());
            while(!sc.hasNextInt()){
                takeCount();
                view.print(View.WRONG_DATA_TYPE);


            }
            if((num = sc.nextInt()) < model.getMinNumber() ||
                    num > model.getMaxNumber()) {
                takeCount();
                view.print(View.OUT_OF_RANGE);
                continue;
            }
            model.setUserNumber(num);
            if(!isRight())continue;

            break;
        }
        return num;
    }

    private void takeCount() {
        counter++;
        view.printWithNumber(View.TRY_NUMBER, counter);

    }

    private boolean isRight() {
        takeCount();
        if(model.isGameNumber(model.getUserNumber())) {
            view.printWithNumber(View.RESULT, counter);
            return true;
        } else {
            view.print(View.WRONG_NUMBER);
            return false;
        }

    }
}
