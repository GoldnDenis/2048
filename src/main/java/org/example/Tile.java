package org.example;

public class Tile {
    private int number;
    private short positionX, positionY;

    public void doubleNumber() {
        number *= 2;
    }

    public void setOnOne() {
        number = 1;
    }

    public boolean moveRight() {
        if (positionX == 3) return false;
        positionX++;
        return true;
    }

    public boolean moveLeft() {
        if (positionX == 0) return false;
        positionX--;
        return true;
    }

    public boolean moveDown() {
        if (positionY == 3) return false;
        positionY++;
        return true;
    }

    public boolean moveUp() {
        if (positionY == 0) return false;
        positionY--;
        return true;
    }

    public void setPosition(short positionY, short positionX) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public short getPositionX() {return positionX;}
    public short getPositionY() {return positionY;}
    public int getNumber() {return number;}
}
