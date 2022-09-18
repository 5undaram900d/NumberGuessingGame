package com.infobyte;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectInput(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.printf("Yes you guesses it right, it was %d\nYou guessed it in %d attempts\n", number, noOfGuesses);
            return true;
        }
        else if (inputNumber<number) {
            System.out.println("You entered too low number, please take high to it...");
        }
        else if (inputNumber>number) {
            System.out.println("You entered too high number, Please take low to it...");
        }
        return false;
    }
}

public class Task2_NumberGuessingGame {
    public static void main(String[] args) {
        com.infobyte.Game g = new com.infobyte.Game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectInput();
        }
    }
}
