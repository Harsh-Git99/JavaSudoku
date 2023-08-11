package com.sudoku.problemDomain;

import com.sudoku.computationalLogic.SudokuUtilities;
import com.sudoku.constants.GameState;

import java.io.Serial;
import java.io.Serializable;

public class sudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public sudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);   //protects our sudoku game from being wrongfully changed
    }


}
