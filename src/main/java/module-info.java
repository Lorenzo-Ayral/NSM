module com.example.nsm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nsm to javafx.fxml;
    exports com.example.nsm;
}