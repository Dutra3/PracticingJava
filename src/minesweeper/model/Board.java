package minesweeper.model;

import minesweeper.exception.ExplosionException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Board {

    private int lines;
    private int columns;
    private int mines;
    private final List<Field> fields = new ArrayList<>();

    public Board(int lines, int columns, int mines) {
        this.lines = lines;
        this.columns = columns;
        this.mines = mines;

        createFields();
        associateTheNeighbors();
        raffleMines();
    }

    public void open(int line, int column) {
        try {
            fields.parallelStream()
                    .filter(field -> field.getLine() == line && field.getColumn() == column)
                    .findFirst()
                    .ifPresent(Field::open);
        } catch (ExplosionException error) {
            fields.forEach(field -> field.setOpen(true));
            throw error;
        }
    }

    public void toMark(int line, int column) {
        fields.parallelStream()
                .filter(field -> field.getLine() == line && field.getColumn() == column)
                .findFirst()
                .ifPresent(Field::toggleMarking);
    }

    private void raffleMines() {
        long minesArmed = 0;
        Predicate<Field> undermined = Field::isMined;

        do {
            int random = (int) (Math.random() * fields.size());
            fields.get(random).mine();
            minesArmed = fields.stream().filter(undermined).count();
        } while (minesArmed < mines);
    }

    private void associateTheNeighbors() {
        for (Field f1: fields) {
            for (Field f2: fields) {
                f1.addNeighbor(f2);
            }
        }
    }

    private void createFields() {
        for (int l = 0; l < lines; l++) {
            for (int c = 0; c < columns; c++) {
                fields.add(new Field(l, c));
            }
        }
    }

    public boolean isGoalAchieved() {
        return fields.stream().allMatch(Field::isGoalAchieved);
    }

    public void restart() {
        fields.stream().forEach(Field::restart);
        raffleMines();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("  ");
        for (int c = 0; c < columns; c++) {
            stringBuilder.append(" ");
            stringBuilder.append(c);
            stringBuilder.append(" ");
        }

        stringBuilder.append("\n");

        int i = 0;
        for (int l = 0; l < lines; l++) {
            stringBuilder.append(l);
            stringBuilder.append(" ");
            for (int c = 0; c < columns; c++) {
                stringBuilder.append(" ");
                stringBuilder.append(fields.get(i));
                stringBuilder.append(" ");
                i++;
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
