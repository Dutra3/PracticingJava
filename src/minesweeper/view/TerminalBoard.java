package minesweeper.view;

import minesweeper.exception.ExitException;
import minesweeper.exception.ExplosionException;
import minesweeper.model.Board;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TerminalBoard {

    private Board board;
    private Scanner entry = new Scanner(System.in);

    public TerminalBoard(Board board) {
        this.board = board;

        executeGame();
    }

    private void executeGame() {
        try {
            boolean continueGame = true;

            while (continueGame) {
                loopGame();

                System.out.println("Outra partida? (S/n) ");
                String response = entry.nextLine();
                if ("n".equalsIgnoreCase(response)) {
                    continueGame = false;
                    System.out.println("Saiu do jogo!");
                } else {
                    board.restart();
                }
            }
        } catch (ExitException error) {
            System.out.println("Saiu!");
        } finally {
            entry.close();
        }
    }

    private void loopGame() {
        try {

            while (!board.isGoalAchieved()) {
                System.out.println(board);

                String typed = captureTypedValue("Digite (x, y): ");

                Iterator<Integer> xy = Arrays.stream(typed.split(","))
                        .map(element -> Integer.parseInt(element.trim())).iterator();

                typed = captureTypedValue("1 - Abrir ou 2 - (Des)Marcar: ");

                if ("1".equals(typed)) {
                    board.open(xy.next(), xy.next());
                } else if ("2".equals(typed)) {
                    board.toMark(xy.next(), xy.next());
                }
            }

            System.out.println("Voce ganhou!");
        } catch (ExplosionException error) {
            System.out.println(board);
            System.out.println("Voce perdeu!");
        }
    }

    private String captureTypedValue(String text) {
        System.out.print(text);
        String typed = entry.nextLine();

        if ("sair".equalsIgnoreCase(typed)) {
            throw new ExitException();
        }

        return typed;
    }
}
