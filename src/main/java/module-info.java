module org.iad.mlp {
    requires javafx.controls;
    requires javafx.fxml;
    requires univocity.parsers;
    requires org.apache.commons.lang3;
    requires javafx.swing;
    requires java.desktop;

    opens org.iad.mlp to javafx.fxml;
    exports org.iad.mlp;
}