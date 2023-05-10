package minesweeper.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    private Field field;

    @BeforeEach
    void setUp() {
        field = new Field(3,3);
    }

    @Test
    void should_return_true_if_is_a_neighbor_in_the_left() {
        Field neighbor = new Field(3,2);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    void should_return_true_if_is_a_neighbor_in_the_right() {
        Field neighbor = new Field(3,4);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    void should_return_true_if_is_a_neighbor_in_the_top() {
        Field neighbor = new Field(2,3);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    void should_return_true_if_is_a_neighbor_in_the_bottom() {
        Field neighbor = new Field(4,3);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    void should_return_true_if_is_a_neighbor_in_the_diagonal() {
        Field neighbor = new Field(2,2);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    void should_return_false_if_is_not_a_neighbor() {
        Field neighborOne = new Field(3,8);
        Field neighborTwo = new Field(3,5);
        boolean resultOne = field.addNeighbor(neighborOne);
        boolean resultTwo = field.addNeighbor(neighborTwo);

        assertFalse(resultOne);
        assertFalse(resultTwo);
    }

}