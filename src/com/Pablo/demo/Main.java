package com.Pablo.demo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move (R, P, or S)");
        String playerMove = scanner.nextLine();

    }
}