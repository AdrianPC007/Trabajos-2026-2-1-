module pe.edu.epeu.avanzes1arrayadrn {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.epeu.avanzes1arrayadrn to javafx.fxml;
    exports pe.edu.epeu.avanzes1arrayadrn;
}