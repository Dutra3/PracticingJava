package minesweeper.model;

import minesweeper.exception.ExplosionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    public void should_throw_error_when_try_to_open_a_field_with_a_mine() {
        Board board = new Board(1, 1, 1);

        assertThrows(ExplosionException.class, () -> {
           board.open(0, 0);
        });
    }
}