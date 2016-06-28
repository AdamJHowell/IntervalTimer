package com.adamjhowell.Birthquakes;


import javafx.beans.property.SimpleLongProperty;
import javafx.beans.value.ObservableLongValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;


public class Controller
{
	// ResourceBundle that was given to the FXMLLoader
	@FXML private ResourceBundle resources;
	// URL location of the FXML file that was given to the FXMLLoader
	@FXML private URL location;
	@FXML private Label overallTimerLabel; // Value injected by FXMLLoader
	@FXML
	private Label quakeTimerLabel; // Value injected by FXMLLoader
	@FXML
	private Label lastIntervalLabel; // Value injected by FXMLLoader
	@FXML
	private Button quakeStartButton; // Value injected by FXMLLoader
	@FXML
	private Button quakeEndButton; // Value injected by FXMLLoader


	private static long GetCurrentDate()
	{
		// Instantiate a Date object with the current system date.
//		Date date = new Date();

		// Display time and date.
		//System.out.println( "Current date: " + date.toString());

		// Return the current epoch date.
		return new Date().getTime();
	} // End of GetCurrentDate() method.


	// This method is called by the FXMLLoader when initialization is complete
	@FXML void initialize()
	{
		final ObservableLongValue quakeDuration = new SimpleLongProperty( 1234L );
		assert overallTimerLabel != null :
			"fx:id=\"overallTimerLabel\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert quakeTimerLabel != null :
			"fx:id=\"quakeTimerLabel\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert lastIntervalLabel != null :
			"fx:id=\"lastIntervalLabel\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert quakeStartButton != null :
			"fx:id=\"quakeStartButton\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert quakeEndButton != null :
			"fx:id=\"quakeEndButton\" was not injected: check your FXML file 'PrimaryView.fxml'.";

		quakeTimerLabel.setTooltip( new Tooltip( "Asdf" ) );
		quakeStartButton.setOnAction( event -> QuakeStart() );
		quakeEndButton.setOnAction( event -> QuakeStop() );
	}


	private void QuakeStart()
	{
		long tempDate = GetCurrentDate();
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ssz" );
		String tempTime = formatter.format( tempDate );
		System.out.println( "Full start: " + tempTime );
		final String finalTime = tempTime.substring( 0, 19 ) + tempTime.substring( 22, tempTime.length() );
		System.out.println( "Quake start: " + finalTime );
	}


	private void QuakeStop()
	{
		long tempDate = GetCurrentDate();
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ssz" );
		String tempTime = formatter.format( tempDate );
		System.out.println( "Quake stop: " + tempTime.substring( 0, 19 ) + tempTime.substring( 22, tempTime.length() ) );
	}
}
