package edu.gus.sudoku;

import edu.gus.sudoku.util.GridConsole;

public class App {
    public static void main(String[] args) {
        String[] numeros = new String[]
                {"1","2","3","4","5","6","7","8","9",
                "1","2","3","4","5","6","7","8","9",
                "1","2","3","4","5","6","7","8","9",
                "1","2","3","4","5","6","7","8","9",
                "1","2","3","4","5","6","7","8","9",
                "1","2","3","4","5","6","7","8","9",
                "1","2","3","4","5","6","7","8","9",
                "1","2","3","4","5","6","7","8","9",
                "1","2","3","4","5","6","7","8","9"};
        System.out.printf((GridConsole.PRINT), numeros);
    }
}
