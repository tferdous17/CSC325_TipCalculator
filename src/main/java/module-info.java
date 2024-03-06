module org.example.csc325_tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc325_tipcalculator to javafx.fxml;
    exports org.example.csc325_tipcalculator;
}