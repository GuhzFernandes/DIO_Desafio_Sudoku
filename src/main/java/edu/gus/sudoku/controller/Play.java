package edu.gus.sudoku.controller;

import edu.gus.sudoku.model.Grid;
import edu.gus.sudoku.util.InputMap;

import java.util.Arrays;
import java.util.Scanner;

public class Play {

    public static void run(Grid game, Scanner input) {
        boolean playing = true;

        while (playing) {
            game.print();
            System.out.println("========= IN-GAME MENU =========");
            System.out.println("1. Place a Number");
            System.out.println("2. Erase a Number");
            System.out.println("3. Reset Puzzle");
            System.out.println("4. Save Game");
            System.out.println("0. Exit to Main Menu");
            System.out.print("Choose an action: ");

            String option = input.nextLine().trim();
            System.out.println();

            try {
                switch (option) {
                    case "1":
                        System.out.print("Enter input (e.g. A1 5): ");
                        int[] placeCmd = InputMap.writeCommand(input.nextLine());
                        game.writeCell(placeCmd[0], placeCmd[1], placeCmd[2]);
                        break;
                    case "2":
                        System.out.print("Enter cell to erase (e.g. A1): ");
                        int[] eraseCmd = InputMap.eraseCommand(input.nextLine());
                        game.eraseCell(eraseCmd[0],eraseCmd[1]);
                        break;
                    case "3":
                        System.out.println("Resetting puzzle...");
                        game.reset();
                        game.print();
                        break;
                    case "4":
                        System.out.println("Saving game... (Coming soon!)");
                        // TODO: Save game to file
                        break;
                    case "0":
                        playing = false;
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid option. Choose from 0 to 4.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();
        }
    }
}
