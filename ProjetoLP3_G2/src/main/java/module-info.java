module lp3.projetolp3_g2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens Controllers to javafx.fxml; // Keep this for your controllers
    opens Views to javafx.fxml; // Add this line for the views
    exports Controllers; // This remains the same
}
