package org.example;

public class Tile {
    private int number;

    public void doubleNumber() {
        this.number *= 2;
    }

    public void setNumber(int number) {this.number = number;}

    public void nullify() {
        this.number = 0;
    }

    public int getNumber() {return number;}
}
