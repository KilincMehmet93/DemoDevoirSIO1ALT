module sio.devoir1sioa {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.devoir1sioa to javafx.fxml;
    exports sio.devoir1sioa;
}