package com.example.twodimensionellarraysorted;

import java.util.Scanner;
import java.util.Random;

public class TwoDimensionellArraySorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int table[][] = new int[20][20];
        int inputNumberOfThrow = 0;
        int inputNumberOfPlayers = 0;
        int thisThrow = 0;
        int numberOfSides = 6;

        System.out.print("Chosse number of players: ");
        inputNumberOfPlayers = scan.nextInt();

        System.out.print("Choose number of throws: ");
        inputNumberOfThrow = scan.nextInt();

        boolean quit = false;


        while(!quit) {
            for (int i=1; i<= inputNumberOfPlayers; i++) {
                for(int j=1; j<= inputNumberOfThrow; j++) {
                    table[i][j] = thisThrow();
                    System.out.println("Spelare " +i+ " kast " +j+ table[i][j]);
                }

                quit = true;
            }
        }
    }
    public static int thisThrow(){
        int outputThrow = (int)(1 + Math.random() * 6);
        return outputThrow;
    }
}
