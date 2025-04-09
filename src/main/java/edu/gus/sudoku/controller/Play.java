package edu.gus.sudoku.controller;

import edu.gus.sudoku.model.Grid;
import edu.gus.sudoku.util.InputMap;
import java.util.Scanner;

public class Play {
    public static void run(Grid game, Scanner input) {
        game.print();
        boolean running = true;
        while (running) {
            try {
                int[] command = InputMap.writeCommand(input.nextLine());
                game.writeCell(command[0], command[1], command[2]);
                game.print();
            } catch (Exception e) {
                System.out.println(e);
                running = false;
            }
        }
    }
}
