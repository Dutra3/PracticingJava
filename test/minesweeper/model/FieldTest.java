package minesweeper.model;

import minesweeper.exception.ExplosionException;
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
    public void should_return_true_when_is_a_neighbor_in_the_left() {
        Field neighbor = new Field(3,2);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    public void should_return_true_when_is_a_neighbor_in_the_right() {
        Field neighbor = new Field(3,4);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    public void should_return_true_when_is_a_neighbor_in_the_top() {
        Field neighbor = new Field(2,3);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    public void should_return_true_when_is_a_neighbor_in_the_bottom() {
        Field neighbor = new Field(4,3);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    public void should_return_true_when_is_a_neighbor_in_the_diagonal() {
        Field neighbor = new Field(2,2);
        boolean result = field.addNeighbor(neighbor);

        assertTrue(result);
    }

    @Test
    public void should_return_false_when_is_not_a_neighbor() {
        Field neighborOne = new Field(3,8);
        Field neighborTwo = new Field(3,5);
        boolean resultOne = field.addNeighbor(neighborOne);
        boolean resultTwo = field.addNeighbor(neighborTwo);

        assertFalse(resultOne);
        assertFalse(resultTwo);
    }

    @Test
    public void should_return_true_when_toggle_value_one_time() {
        field.toggleMarking();
        assertTrue(field.isMarked());
    }

    @Test
    public void should_return_false_when_toggle_value_two_times() {
        field.toggleMarking();
        field.toggleMarking();
        assertFalse(field.isMarked());
    }

    @Test
    public void should_return_true_when_open_a_neighbor() {
        Field field22 = new Field(2,2);
        Field field11 = new Field(1,1);

        field22.addNeighbor(field11);
        field.addNeighbor(field22);
        field.open();

        assertTrue(field22.isOpen() && field11.isOpen());
    }

    @Test
    public void should_return_false_when_open_a_neighbor_mined() {
        Field field11 = new Field(1,1);
        Field field12 = new Field(1,2);
        field12.mine();

        Field field22 = new Field(2,2);

        field22.addNeighbor(field11);
        field22.addNeighbor(field12);
        field.addNeighbor(field22);
        field.open();

        assertTrue(field22.isOpen() && !field11.isOpen());
    }

    @Test
    public void should_return_true_when_open_a_field_that_is_not_marked_and_is_not_mined() {
        assertTrue(field.open());
    }

    @Test
    public void should_return_false_when_is_not_mined_and_is_marked() {
        field.toggleMarking();
        assertFalse(field.open());
    }

    @Test
    public void should_return_false_when_is_mined_and_marked() {
        field.toggleMarking();
        field.mine();
        assertFalse(field.open());
    }

    @Test
    public void should_throw_error_when_is_mined_and_not_marked() {
        field.mine();
        assertThrows(ExplosionException.class, () -> {
            field.open();
        });
    }

    @Test
    public void should_transform_all_data_to_false() {
        Field field = new Field(3, 3);
        field.setOpen(true);
        field.setMarked(true);
        field.setMined(true);

        field.restart();

        assertFalse(field.isOpen());
        assertFalse(field.isMarked());
        assertFalse(field.isMined());
    }

    @Test
    public void should_return_false_when_is_goal_not_achieved() {
        Field field = new Field(3, 3);
        field.setOpen(true);
        field.setMarked(false);
        field.setMined(true);

        boolean result = field.isGoalAchieved();

        assertFalse(result);
    }

    @Test
    public void should_return_true_when_is_goal_achieved() {
        Field field = new Field(3, 3);
        field.setOpen(true);
        field.setMarked(true);
        field.setMined(true);

        boolean result = field.isGoalAchieved();

        assertTrue(result);
    }
}