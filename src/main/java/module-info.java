module com.archasmiel.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.archasmiel.test to javafx.fxml;
    exports com.archasmiel.test;
    exports com.archasmiel.test.lib;
    opens com.archasmiel.test.lib to javafx.fxml;
    exports com.archasmiel.test.lib.events;
    opens com.archasmiel.test.lib.events to javafx.fxml;
    exports com.archasmiel.test.lib.elements;
    opens com.archasmiel.test.lib.elements to javafx.fxml;
}