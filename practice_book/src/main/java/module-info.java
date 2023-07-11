module com.example.practice_book {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practice_book to javafx.fxml;
    exports com.example.practice_book;
}