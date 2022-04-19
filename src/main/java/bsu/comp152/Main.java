package bsu.comp152;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {

        // launch the application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        // Create a label
        Label enterColor = new Label("Enter a color:");
        enterColor.setFont(Font.font(18));
        // Create TextField
        TextField textField = new TextField(); // Book page num 787


        // Create Button
        Button button = new Button("Change Color");

        //Create Circle
        Circle circle = new Circle(20, Paint.valueOf("Black"));

        //Create a Hbox
        HBox moveColorText = new HBox(enterColor, textField, button, circle);


        // Setup Hbox
        Scene scene = new Scene(moveColorText, 400, 300);
        moveColorText.setAlignment(Pos.TOP_LEFT);
        moveColorText.setSpacing(20);


        // Add scene to the stage
        primaryStage.setScene(scene);

        // Set the stage title
        primaryStage.setTitle("Color changer");

        // Show the window
        primaryStage.show();

    }

}
