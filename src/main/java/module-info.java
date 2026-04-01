module org.example.studentm {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.studentm to javafx.fxml;
    exports org.example.studentm;
}