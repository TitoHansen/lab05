module org.example.lb5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens org.example.lb5 to javafx.fxml;
    exports org.example.lb5;
}