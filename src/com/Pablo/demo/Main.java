package com.Pablo.demo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while (true) {
            System.out.println("Enter your move (R, P, or S)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("R") || playerMove.equals("p") || playerMove.equals("S")) {
                break;
            }
            System.out.println(playerMove + " is not a valid move");
        }

        System.out.println("Computer played " + computerMove);
        if (playerMove.equals(computerMove)) {
            System.out.println("The game was a tie!");
        } else if (playerMove.equals("R")) {
            if (computerMove.equals("P")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("S")) {
                System.out.println("You win!");

            }
        }

    }
}