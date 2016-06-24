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

public class Main extends Application
{

	public static void main( String[] args )
	{
		launch( args );
	}


	@Override public void start( Stage primaryStage ) throws Exception
	{
		// Load the UI from a FXML file.
		Parent root = FXMLLoader.load( getClass().getResource( "view/sample.fxml" ) );
		// Set the title.
		primaryStage.setTitle( "Interval Timer" );
		// Set the size of the scene.  This will need to be tailored to work well with the final UI layout.
		primaryStage.setScene( new Scene( root, 300, 275 ) );
		// Display the stage.
		primaryStage.show();
	}
}
