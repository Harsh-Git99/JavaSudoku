module com.example.javasudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sudoku.javaSudoku to javafx.fxml;
    exports com.sudoku.javaSudoku;
    exports com.sudoku;
    opens com.sudoku to javafx.fxml;
}