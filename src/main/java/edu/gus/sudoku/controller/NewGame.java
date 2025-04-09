package edu.gus.sudoku.controller;

import edu.gus.sudoku.model.Grid;
import edu.gus.sudoku.model.SudokuEntry;
import edu.gus.sudoku.repository.SudokuLoader;
import java.util.List;
import java.util.Scanner;

public class NewGame {
    public static Grid run(Scanner input) {
        return new Grid(selectPuzzle(loadPuzzles(), input));
    }

    private static List<SudokuEntry> loadPuzzles(){
        List<SudokuEntry> entries;
        try {
            entries = SudokuLoader.loadPuzzle();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entries;
    }

    private static SudokuEntry selectPuzzle(List<SudokuEntry> entries, Scanner input){
        System.out.println("Total of games available: " + entries.size());
        System.out.println("[ 1 ~ "+entries.size()+" ]");
        System.out.print("Please, select a game to start: ");
        return entries.get(Integer.parseInt(input.nextLine().trim())-1);
    }

}
