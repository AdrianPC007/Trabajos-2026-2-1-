module pe.edu.upeu.starbuckscrud {
    requires javafx.controls;
    requires javafx
            .fxml;


    opens pe.edu.upeu.starbuckscrud to javafx.fxml;
    opens pe.edu.upeu.starbuckscrud.controller to javafx.fxml;


    opens pe.edu.upeu.starbuckscrud.model to javafx.base;

    exports pe.edu.upeu.starbuckscrud;
}