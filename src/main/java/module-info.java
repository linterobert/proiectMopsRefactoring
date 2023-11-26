module com.example.proiectmopsrefactoring {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proiectmopsrefactoring to javafx.fxml;
    exports com.example.proiectmopsrefactoring;
}