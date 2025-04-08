package edu.gus.sudoku;

import edu.gus.sudoku.model.Grid;
import edu.gus.sudoku.model.SudokuEntry;
import edu.gus.sudoku.util.InputMap;
import edu.gus.sudoku.util.SudokuLoader;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*for (char value = 'A'; value <='I';value++) System.out.println(value +"\t"+ GridMap.column(value));
        for (int i = 1; i <=9; i++) System.out.println(i + "\t"+ GridMap.row(i));*/

        //DB load test
        
        List<SudokuEntry> entries = null;
        try {
            entries = SudokuLoader.loadPuzzle();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        SudokuEntry test = entries.get(0);
        System.out.println("\nEntry test:");
        System.out.println("Puzzle: " + test.puzzle);
        System.out.println("Solution: " + test.solution);

        Grid grid = new Grid(test);
        grid.print();

        while (true){
            try(Scanner input = new Scanner(System.in)) {
                int[] command = InputMap.writeCommand(input.nextLine());
                grid.writeCell(command[0],command[1],command[2]);
                grid.print();
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
        }
    }
}
