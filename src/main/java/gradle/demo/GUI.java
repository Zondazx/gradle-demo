package gradle.demo;

import animatefx.animation.Bounce;
import animatefx.animation.BounceIn;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label text = new Label("wooo hooo");
        Scene scene = new Scene(text ,600, 300);
        primaryStage.setTitle("Sample Application");
        primaryStage.setScene(scene);

        // animateFX test
        new Bounce(text).play();

        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
