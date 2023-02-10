module com.example.cinemaresver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cinemaresver to javafx.fxml;
    exports com.example.cinemaresver;
}