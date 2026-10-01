module com.m486.activitat1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.m486.activitat1 to javafx.fxml;
    exports com.m486.activitat1;
}