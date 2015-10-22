package tests;

import algorithms.solvers.Sudoku;

/**
 * Created by zach on 10/21/2015.
 * <p>
 * Test the functionality of the sudoku solver on a puzzle.
 */
public class SudokuTest {

    public static void main(String[] args) {
        // Sudoku object
        Sudoku sudoku = new Sudoku();
        // Random puzzle
        int[][] puzzle = new int[][]{
                {0, 0, 0, 0, 7, 0, 1, 0, 0},
                {0, 0, 0, 9, 0, 0, 0, 0, 2},
                {3, 4, 0, 0, 0, 8, 0, 0, 0},
                {6, 7, 1, 0, 0, 0, 0, 2, 0},
                {0, 0, 5, 0, 1, 0, 9, 0, 0},
                {0, 2, 0, 0, 0, 0, 6, 8, 1},
                {0, 0, 0, 6, 0, 0, 0, 4, 9},
                {5, 0, 0, 0, 0, 9, 0, 0, 0},
                {0, 0, 6, 0, 8, 0, 0, 0, 0}
        };
        // print the unsolved puzzle
        System.out.println("Unsolved puzzle: ");
        sudoku.printPuzzle(puzzle);
        // solve the puzzle
        sudoku.solvePuzzle(puzzle);
        // print the solved puzzle
        System.out.println("Solved puzzle: ");
        sudoku.printPuzzle(puzzle);
    }
}
