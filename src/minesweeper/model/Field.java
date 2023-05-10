package minesweeper.model;

import minesweeper.exception.ExplosionException;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final int line;
    private final int column;
    private boolean isOpen = false;
    private boolean isMined = false;
    private boolean isMarked = false;
    private List<Field> neighbors = new ArrayList<>();

    public Field(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public boolean addNeighbor(Field neighbor) {
        boolean differentLine = line != neighbor.line;
        boolean differentColumn = column != neighbor.column;
        boolean diagonal = differentLine && differentColumn;

        int deltaLine = Math.abs(line - neighbor.line);
        int deltaColumn = Math.abs(column - neighbor.column);
        int generalDelta = deltaLine + deltaColumn;

        if (generalDelta == 1 && !diagonal) {
            neighbors.add(neighbor);
            return true;
        } else if (generalDelta == 2 && diagonal) {
            neighbors.add(neighbor);
            return true;
        } else {
            return false;
        }
    }

    public void toggleMarking() {
        if (!isOpen) {
            isMarked = !isMarked;
        }
    }

    public boolean open() {
        if (!isOpen && !isMarked) {
            isOpen = true;
            if (isMined) {
                throw new ExplosionException();
            }

            if (safeNeighborhood()) {
                neighbors.forEach(Field::open);
            }

            return true;
        } else {
            return false;
        }
    }

    public boolean safeNeighborhood() {
        return neighbors.stream().noneMatch(neighbor -> neighbor.isMined);
    }

}
