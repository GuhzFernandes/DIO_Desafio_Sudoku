package edu.gus.sudoku;

import edu.gus.sudoku.model.Grid;
import edu.gus.sudoku.model.SudokuEntry;
import edu.gus.sudoku.util.GridMap;
import edu.gus.sudoku.util.SudokuLoader;

import java.util.List;

public class App {
    public static void main(String[] args) {
        for (char value = 'A'; value <='I';value++) System.out.println(value +"\t"+ GridMap.column(value));
        for (int i = 1; i <=9; i++) System.out.println(i + "\t"+ GridMap.row(i));

        //DB load test
        
        List<SudokuEntry> entries = null;
        try {
            entries = SudokuLoader.loadPuzzle();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("DB entries loaded: " + entries.size());

        SudokuEntry test = entries.get(0);
        System.out.println("\nEntry test:");
        System.out.println("Puzzle: " + test.puzzle);
        System.out.println("Solution: " + test.solution);

        System.out.println("puzzle setup n print test");
        Grid grid = new Grid(test);
        grid.print();
    }
}
