package com.adamjhowell.IntervalTimer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * This program is intended to track pregnancy contractions.
 * However, it will also function as an advanced stopwatch.
 * This timer will track multiple stats:
 *   Overall time
 *   Duration of an event (contraction)
 *   Period between events
 *   Quantity of events
 * I may also include a graph of the events on the overall timeline.
 * I may also include an option to rate the event (intensity of each contraction).
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource( "sample.fxml" ) );
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
