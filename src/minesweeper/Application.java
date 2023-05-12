package minesweeper;

import minesweeper.model.Board;
import minesweeper.view.TerminalBoard;

public class Application {

    public static void main(String[] args) {
        Board board = new Board(6, 6, 6);
        new TerminalBoard(board);
    }
}
