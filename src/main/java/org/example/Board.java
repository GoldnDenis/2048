package org.example;

public class Board {
    private Tile[][] board;

    public Board() {
        board = new Tile[4][4];
    }

    public void setUpBoard() {
        clearBoard();
        generateTwoTiles();
    }

    public Tile[][] getBoard() {return board;}
    public void updateBoard(Tile[][] board) {this.board = board;}

    private void clearBoard() {
        for (short y = 0; y < 4; y++) {
            for (short x = 0; x < 4; x++) {
                board[y][x].nullify();
            }
        }
    }

    private void generateTwoTiles() {
        generateOneTile();
        generateOneTile();
    }

    private void generateOneTile() {
        int xTilePos = Utility.getRandomNumber(4);
        int yTilePos = Utility.getRandomNumber(4);
        while (board[yTilePos][xTilePos].getNumber() != 0) {
            xTilePos = Utility.getRandomNumber(4, xTilePos);
            yTilePos = Utility.getRandomNumber(4, yTilePos);
        }
        board[yTilePos][xTilePos].setNumber(2);
    }
}
