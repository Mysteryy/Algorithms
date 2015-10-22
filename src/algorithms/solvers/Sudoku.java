package algorithms.solvers;


/**
 * Created by zach on 5/15/15.
 * <p>
 * Sudoku contains all necessary functionality to solve a sudoku puzzle.
 * The puzzle should be represented as a 2d array if int type.
 * This class is capable of solving any solvable sudoku puzzle using a
 * backtracking algorithm.
 */
public class Sudoku {

    /**
     * Solves the sudoku puzzle specified by the puzzle parameter.
     * This method uses backtracking to solve any solvable sudoku puzzle.
     *
     * @param puzzle the sudoku puzzle to solve.
     * @return true if the puzzle was solved successfully, false otherwise.
     */
    public boolean solvePuzzle(int[][] puzzle) {
        boolean solved = false;
        int[] emptyCell = getNextEmptyCell(puzzle);

        if (emptyCell == null) {
            System.out.println("Puzzle complete!");
            return true;
        } else if (emptyCell != null) {
            int row = emptyCell[0];
            int col = emptyCell[1];

            for (int value = 1; value <= 9; value++) {
                if (valueIsSafe(puzzle, row, col, value)) {
                    puzzle[row][col] = value;
                    if (solvePuzzle(puzzle)) {
                        return true;
                    }
                    puzzle[row][col] = 0;
                }
            }
            return false;
        }
        return solved;
    }

    /**
     * Checks if a value is safe to place in a given sudoku cell.
     * A value is safe if it is not already used in the given row, col, or 3x3 block.
     *
     * @param puzzle the puzzle to check if the value is safe.
     * @param row    the row to check for the given value.
     * @param col    the column to check for the given value.
     * @param value  the value to check for.
     * @return true if the given value is not already used in the given row, col, or block, false otherwise.
     */
    private boolean valueIsSafe(int puzzle[][], int row, int col, int value) {
        return (!valueIsUsedInCol(puzzle, col, value) &&
                !valueIsUsedInRow(puzzle, row, value) &&
                !valueIsUsedInSubgrid(puzzle, (row - (row % 3)), (col - (col % 3)), value));
    }

    /**
     * Checks if a value is already used in the specified row.
     *
     * @param puzzle the puzzle to check if the value is safe.
     * @param row    the row to check for the given value.
     * @param value  the value to check for.
     * @return true if the value is already used in the specified row, false otherwise.
     */
    private boolean valueIsUsedInRow(int puzzle[][], int row, int value) {
        for (int col = 0; col < 9; col++) {
            if (puzzle[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a value is already used in the specified col.
     *
     * @param puzzle the puzzle to check if the value is safe.
     * @param col    the column to check for the given value.
     * @param value  the value to check for.
     * @return true if the value is already used in the specified column, false otherwise.
     */
    private boolean valueIsUsedInCol(int puzzle[][], int col, int value) {
        for (int row = 0; row < 9; row++) {
            if (puzzle[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the specified value is used in the 3x3 sub grid that contains it.
     *
     * @param puzzle      the puzzle to check if the value is safe.
     * @param startingRow the starting row of the 3x3 sub grid.
     * @param startingCol the starting column of the 3x3 sub grid.
     * @param value       the value to check for.
     * @return true if the value is already used in the sub grid, false otherwise.
     */
    private boolean valueIsUsedInSubgrid(int puzzle[][], int startingRow, int startingCol, int value) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (puzzle[startingRow + row][startingCol + col] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Gets the next cell with a value of 0 in the sudoku puzzle.
     *
     * @param puzzle the puzzle to get the next empty cell of.
     * @return an int array, where array[0] is the row of the empty cell, and array[1]
     * is the column of the empty cell. returns null if there is no empty cell.
     */
    private int[] getNextEmptyCell(int[][] puzzle) {
        int emptyCell[] = new int[2];
        for (int row = 0; row < puzzle.length; row++) {
            for (int col = 0; col < puzzle[0].length; col++) {
                if (puzzle[row][col] == 0) {
                    emptyCell[1] = col;
                    emptyCell[0] = row;
                    return emptyCell;
                }
            }
        }
        return null;
    }

    /**
     * Prints the puzzle out to console.
     *
     * @param puzzle the puzzle (2d int array) to print out.
     */
    public void printPuzzle(int[][] puzzle) {
        for (int row = 0; row < puzzle.length; row++) {
            for (int col = 0; col < puzzle[row].length; col++) {
                System.out.print(" " + puzzle[row][col] + " ");
            }
            System.out.println();
        }
    }
}
