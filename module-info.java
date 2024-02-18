module com.imagegridpanel {
    requires javafx.controls;
    requires transitive javafx.graphics;
    requires javafx.fxml;

    opens com.imagegridpanel to javafx.fxml;
    exports com.imagegridpanel;
}

