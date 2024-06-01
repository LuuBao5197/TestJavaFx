module group2.javafxdemofilechooser {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens group2.javafxdemofilechooser to javafx.fxml;
    exports group2.javafxdemofilechooser;
}
