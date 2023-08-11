package com.sudoku.buildLogic;

import com.sudoku.computationalLogic.GameLogic;
import com.sudoku.persistence.LocalStorageImpl;
import com.sudoku.problemDomain.IStorage;
import com.sudoku.problemDomain.sudokuGame;
import com.sudoku.userInterface.IUserInterfaceContract;
import com.sudoku.userInterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {
    public  static  void build(IUserInterfaceContract.View userInterface) throws IOException{

        sudokuGame initialState;
        IStorage storage = new LocalStorageImpl();

        try{
            initialState = storage.getGameData();
        }catch (IOException e){
            initialState = GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic
                = new ControlLogic(storage,userInterface);

        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
