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
    private Circle circle;
    private TextField textField;
    public static void main(String[] args) {
        // launch the application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a label
        Label enterColor = new Label("Enter a color:");
        enterColor.setFont(Font.font(18));
        // Create TextField
        textField = new TextField(); // Book page num 787

        //Create Circle
        circle = new Circle(100, Paint.valueOf("Black"));

        // Create Button
        Button button = new Button("Change Color");
        button.setOnAction(new BoxClicker());



        //Create a Hbox and VBox
        HBox moveColorText = new HBox(10, enterColor, textField);
        moveColorText.setAlignment(Pos.TOP_CENTER);
        VBox SceneSteup = new VBox(10, moveColorText, button, circle);

        // Setup Scene
        Scene scene = new Scene(SceneSteup, 400, 300);
        SceneSteup.setAlignment(Pos.TOP_CENTER);
        SceneSteup.setPadding(new Insets(20, 0, 0, 0));


        // Add scene to the stage
        primaryStage.setScene(scene);

        // Set the stage title
        primaryStage.setTitle("Color changer");

        // Show the window
        primaryStage.show();
    }
    class BoxClicker implements EventHandler<ActionEvent>{
        @Override

        public void handle (ActionEvent event){
            circle.setFill(Paint.valueOf(textField.getText()));
        }
    }
}
