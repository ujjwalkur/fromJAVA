// This Is a Game Namely Rock-Paper-Scissor

package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockGame {
    public static void main(String[] args) {
        String personPlay;
        String computerPlay = " ";
        int computerInt;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println(" hey! Let's play Rock-Paper-scissor Game");

        System.out.println();

        //to generating computer's move

        computerInt = generator.nextInt(3)+1;

        if (computerInt == 1){
            computerPlay = "R";
        }else if (computerInt == 2){
            computerPlay = "P";
        }else if (computerInt == 3){
            computerPlay = "S";
        }

        // Now Get PLayers Turn

        System.out.println(" Enter your move\t");
        personPlay = scan.next();

        //get the player move is upper case
        personPlay = personPlay.toUpperCase();

        // Print compuetr play

        System.out.println(" Computer move is :" + computerPlay);

        // TO Show Who Win

            if (personPlay.equals(computerPlay)) {
                System.out.println(" Match is Tie : Try next time");
            } else if (personPlay.equals("R")) {
                if (computerPlay.equals("S"))
                    System.out.println(" Rock Crashes Scissor : You Win !");
                else if (computerPlay.equals("P"))
                    System.out.println(" Paper Eats Rocks : You Loose!");
            } else if (personPlay.equals("P")) {
                if (computerPlay.equals("S"))
                    System.out.println(" Scissor Cuts Paper : You loose!");
                else if (computerPlay.equals("R"))
                    System.out.println("  Paper Eats Rocks : You Loose!");
            } else if (personPlay.equals("S")) {
                if (computerPlay.equals("R"))
                    System.out.println(" Rock damages Scissor : You Loose!");
                else if (computerPlay.equals("p"))
                    System.out.println(" Scissor Cuts Paper : You Win! ");
            }
            else
                System.out.println(" Invalid User Input : Try Again");

    }
}
