package com.adamjhowell.Birthquakes;


import com.adamjhowell.Birthquakes.model.TimeEvent;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.value.ObservableLongValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.util.Duration;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Controller
{
	AJHTimer overallTimer = new AJHTimer();
	// ResourceBundle that was given to the FXMLLoader
	@FXML private ResourceBundle resources;
	// URL location of the FXML file that was given to the FXMLLoader
	@FXML private URL location;
	@FXML private Label overallTimerLabel; // Value injected by FXMLLoader
	@FXML private Label quakeTimerLabel; // Value injected by FXMLLoader
	@FXML private Label lastIntervalLabel; // Value injected by FXMLLoader
	@FXML private Button quakeStartButton; // Value injected by FXMLLoader
	@FXML private Button quakeEndButton; // Value injected by FXMLLoader
	private AJHTimer quakeTimer = new AJHTimer();


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
		final ObservableLongValue quakeDuration = new SimpleLongProperty( 0L );
		List< TimeEvent > eventList = new ArrayList<>();
		assert overallTimerLabel != null : "fx:id=\"overallTimerLabel\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert quakeTimerLabel != null : "fx:id=\"quakeTimerLabel\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert lastIntervalLabel != null : "fx:id=\"lastIntervalLabel\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert quakeStartButton != null : "fx:id=\"quakeStartButton\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert quakeEndButton != null : "fx:id=\"quakeEndButton\" was not injected: check your FXML file 'PrimaryView.fxml'.";

		overallTimerLabel.setTooltip( new Tooltip( "The overall duration, since the first birthquake." ) );
		quakeTimerLabel.setTooltip( new Tooltip( "The duration of the current birthquake." ) );
		lastIntervalLabel.setTooltip( new Tooltip( "The time between the previous and the current birthquake." ) );
		quakeStartButton.setOnAction( event -> QuakeStart() );
		quakeEndButton.setOnAction( event -> QuakeStop() );
		// Set overallTimerLabel to the current time for testing.
		final DateFormat format = DateFormat.getInstance();
		final Timeline timeline = new Timeline( new KeyFrame( Duration.seconds( 1 ), event -> {
			final Calendar cal = Calendar.getInstance();
			overallTimerLabel.setText( format.format( cal.getTime() ) );
			//quakeDuration++;
		} ) );
		timeline.setCycleCount( Animation.INDEFINITE );
		timeline.play();
	}


	private void QuakeStart()
	{
		long tempDate = GetCurrentDate();
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ssz" );
		String tempTime = formatter.format( tempDate );
		System.out.println( "Quake starting at: " + tempTime.substring( 0, 19 ) );
		quakeTimer.startTimer( quakeTimer.getTime() );
		quakeTimerLabel.setText( quakeTimer.getSSPTime().get() );
	}


	private void QuakeStop()
	{
		long tempDate = GetCurrentDate();
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ssz" );
		String tempTime = formatter.format( tempDate );
		System.out.println( "Quake ending at: " + tempTime.substring( 0, 19 ) );
		quakeTimer.stopTimer();
	}
}
