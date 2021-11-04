package com.example.bowlingapp;
import java.util.LinkedList;
import java.util.Scanner;


public class BowlingGame {

    

    public int[] rolls = new int[21]; // all the rolls, two rolls for each frame execpt that last
    private int currentRoll = 0; //index start
    private String playerName;

    //private int score = 0;
    //int rollIndex = 0;

    public void hit(int pins)
    {
        //score += pins;
        rolls[currentRoll++] = pins;// roll through frames

    }

    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerName(String n){
        playerName = n;
    }





    public int getScore(){
        int score = 0;
        int rollIndex = 0;

        for (int frameIndex = 0; frameIndex< 10; frameIndex++)
        {
            /***


            if (frameIndex == 9){ // execption on last frame
                if(strike(rollIndex)){
                    score += getFinalFrameScore(rollIndex);
                }
            }


            else { // all previous frames
             ***/

                if (strike(rollIndex)) {
                    score += getStrikeScore(rollIndex);
                    rollIndex++;// skip index because strike was rolled
                    //rolls[currentRoll]++;
                } else if (spare(rollIndex)) {
                    score += getSpareScore(rollIndex);
                    rollIndex += 2;
                } else {
                    score += getStandardScore(rollIndex);
                    rollIndex += 2;
                }
           // }




        }

        return score;

    }

    public int getRoll(int roll){
        return rolls[roll];
    }


    private int getStandardScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1];
    } //score if not strike or spare

    private int getFinalFrameScore(int rollIndex) {
        return rolls[rollIndex]+ rolls[rollIndex + 1]+ rolls[rollIndex + 2];
    }

    private int getSpareScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] + (rolls[rollIndex + 2]);
    } // calculate current frame by getting first two rolls + bonus of next roll

    private int getStrikeScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] + (rolls[rollIndex + 2]);
    }// calculate current frame

    private boolean spare(int rollIndex) {
        return rolls[rollIndex]+rolls[rollIndex + 1] == 10;
    } // checks for spare

    private boolean strike(int rollIndex) {
        return rolls[rollIndex]== 10;
    }// checks for strike

    /***
    private boolean lastFrameStrike(int rollIndex) {
        return rolls[18]== 10;
    }
     ***/



    /***
    LinkedList<String> players = new LinkedList<>();
    Scanner sc = new Scanner(System.in);



    public static void main(String arg[]){
        int numPlayers;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of players");
        numPlayers = s.nextInt();
        BowlingGame game = new BowlingGame(numPlayers);
        game





    }


    public BowlingGame(int numPlayers){

        LinkedList<>



        for(int i=0; i > numPlayers; i++)
        {
            System.out.println("Enter Name of Player " + i+1);
            players.push(sc.nextLine());
        }

    }
     ***/
}
