package org.example;

public class GameEngine {
    static public void slideLeft(Board board) {
        Tile[][] tmpBoard = board.getBoard();
        int tmpNumber;
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                tmpNumber = tmpBoard[y][x].getNumber();
                if (tmpNumber != 0) {
                    short i = 1;
                    while (tmpBoard[y][x-i].getNumber() >= 0) {
                        tmpBoard[y][x-i+1].nullify();
                        if (tmpBoard[y][x-i].getNumber() > 0) {
                            tmpBoard[y][x-i].doubleNumber();
                            break;
                        }
                        tmpBoard[y][x-i].setNumber(tmpNumber);
                        i++;
                    }
                }
            }
        }
        board.updateBoard(tmpBoard);
    }

    static public void slideRight(Board board) {
        Tile[][] tmpBoard = board.getBoard();
        int tmpNumber;
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                tmpNumber = tmpBoard[y][x].getNumber();
                if (tmpNumber != 0) {
                    short i = 1;
                    while (tmpBoard[y][x+i].getNumber() >= 0) {
                        tmpBoard[y][x+i-1].nullify();
                        if (tmpBoard[y][x+i].getNumber() > 0) {
                            tmpBoard[y][x+i].doubleNumber();
                            break;
                        }
                        tmpBoard[y][x+i].setNumber(tmpNumber);
                        i++;
                    }
                }
            }
        }
        board.updateBoard(tmpBoard);
    }

    static public void slideUp(Board board) {
        Tile[][] tmpBoard = board.getBoard();
        int tmpNumber;
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                tmpNumber = tmpBoard[y][x].getNumber();
                if (tmpNumber != 0) {
                    short i = 1;
                    while (tmpBoard[y-i][x].getNumber() >= 0) {
                        tmpBoard[y-i+1][x].nullify();
                        if (tmpBoard[y-i][x].getNumber() > 0) {
                            tmpBoard[y-i][x].doubleNumber();
                            break;
                        }
                        tmpBoard[y-i][x].setNumber(tmpNumber);
                        i++;
                    }
                }
            }
        }
        board.updateBoard(tmpBoard);
    }

    static public void slideDown(Board board) {
        Tile[][] tmpBoard = board.getBoard();
        int tmpNumber;
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                tmpNumber = tmpBoard[y][x].getNumber();
                if (tmpNumber != 0) {
                    short i = 1;
                    while (tmpBoard[y+i][x].getNumber() >= 0) {
                        tmpBoard[y+i-1][x].nullify();
                        if (tmpBoard[y+i][x].getNumber() > 0) {
                            tmpBoard[y+i][x].doubleNumber();
                            break;
                        }
                        tmpBoard[y+i][x].setNumber(tmpNumber);
                        i++;
                    }
                }
            }
        }
        board.updateBoard(tmpBoard);
    }
}
