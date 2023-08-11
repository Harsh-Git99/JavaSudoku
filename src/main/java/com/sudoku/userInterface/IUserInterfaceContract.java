package com.sudoku.userInterface;

import com.sudoku.problemDomain.sudokuGame;

public interface IUserInterfaceContract {
    interface  EventListener{
        void onSudokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View {
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(sudokuGame game);
        void showDialog(String Message);
        void showError(String message);
    }
}
