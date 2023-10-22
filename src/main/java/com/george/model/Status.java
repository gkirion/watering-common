package com.george.model;

public enum Status {

    ON('1'), OFF('0');

    private char symbol;

    Status(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

}
