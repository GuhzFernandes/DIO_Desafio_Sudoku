package edu.gus.sudoku.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.gus.sudoku.model.SudokuEntry;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class SudokuLoader {
    public static List<SudokuEntry> loadPuzzle() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        InputStream input = SudokuLoader.class
                .getClassLoader()
                .getResourceAsStream("sudoku.json");

        if (input == null) throw new RuntimeException("File not founded!");

        SudokuEntry[] array = mapper.readValue(input, SudokuEntry[].class);
        return Arrays.asList(array);
    }
}
