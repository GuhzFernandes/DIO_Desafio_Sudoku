package edu.gus.sudoku.model;

public class Cell {
    private String currentValue;
    private final String expectedValue;
    private final boolean fixedValue;

    public Cell(String currentValue, String expectedValue) {
        this.currentValue = currentValue;
        this.expectedValue = expectedValue;
        this.fixedValue = !currentValue.equals("0");
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String value) {
        if (!fixedValue) this.currentValue = value;
    }

    public boolean checkValue(){
        return currentValue.equals(expectedValue);
    }
    public void clearValue(){
        setCurrentValue("0");
    }
}