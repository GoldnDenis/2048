package org.example;

public class GameEngine {
    static public void slide(Board board) {
        Tile[][] tmpBoard = board.getBoard();

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (tmpBoard[y][x].getNumber() != 1) {
                    short i = 1;
                    while (tmpBoard[y][x].moveLeft()) {
                        if (checkCollision(tmpBoard[y][x-i], tmpBoard[y][x])) break;
                        i++;
                    }
                }
            }
        }

        board.updateBoard(tmpBoard);
    }

    static private boolean checkCollision(Tile firstTile, Tile secondTile) {
        return (secondTile.getNumber() != 1) && ((firstTile.getPositionX() == secondTile.getPositionX()) &&
                (firstTile.getPositionY() == secondTile.getPositionY()));
    }
}
