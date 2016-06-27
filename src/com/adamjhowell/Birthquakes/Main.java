package com.adamjhowell.Birthquakes;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


/**
 * This program is intended to track pregnancy contractions (Birthquakes).
 * However, it will also function as an advanced stopwatch.
 * This timer will track multiple stats:
 *   Overall time
 *   Duration of an event (Birthquake)
 *   Period between events (time from the start of one event to the start of the next)
 *   Quantity of events
 *   Lap timer (with a TableView of recent times, most recent at the top)
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
		Parent root = FXMLLoader.load( getClass().getResource( "view/PrimaryView.fxml" ) );
		// Set the title.
		primaryStage.setTitle( "Birthquakes" );
		// Set the size of the scene.  This will need to be tailored to work well with the final UI layout.
		primaryStage.setScene( new Scene( root, 300, 275 ) );
		// Set the icon for a non-Maven build.
		primaryStage.getIcons().add( new Image( getClass().getResourceAsStream( "baby-512x512.png" ) ) );
		// Set the icon for a Maven build.
		//primaryStage.getIcons().add( new Image( "images/baby-32x32.png" ) );
		// Display the stage.
		primaryStage.show();
	}
}
