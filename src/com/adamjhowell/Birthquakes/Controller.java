package com.adamjhowell.Birthquakes;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller
{
	// ResourceBundle that was given to the FXMLLoader
	@FXML private ResourceBundle resources;
	// URL location of the FXML file that was given to the FXMLLoader
	@FXML private URL location;
	@FXML private Button overallStartButton; // Value injected by FXMLLoader
	@FXML private Button overallStopButton; // Value injected by FXMLLoader
	@FXML private Label overallTimerLabel; // Value injected by FXMLLoader
	@FXML private Label eventTimerLabel; // Value injected by FXMLLoader
	@FXML private Button eventStartButton; // Value injected by FXMLLoader
	@FXML private Button eventEndButton; // Value injected by FXMLLoader
	@FXML private Label lastPeriodLabel; // Value injected by FXMLLoader


	// This method is called by the FXMLLoader when initialization is complete
	@FXML void initialize()
	{
		assert overallStartButton != null :
			"fx:id=\"overallStartButton\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert overallStopButton != null :
			"fx:id=\"overallStopButton\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert overallTimerLabel != null :
			"fx:id=\"overallTimerLabel\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert eventTimerLabel != null :
			"fx:id=\"eventTimerLabel\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert eventStartButton != null :
			"fx:id=\"eventStartButton\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert eventEndButton != null :
			"fx:id=\"eventEndButton\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		assert lastPeriodLabel != null :
			"fx:id=\"lastPeriodLabel\" was not injected: check your FXML file 'PrimaryView.fxml'.";
		overallStartButton.setOnAction( event -> OverallStart() );
		overallStopButton.setOnAction( event -> OverallStop() );
		eventStartButton.setOnAction( event -> EventStart() );
		eventEndButton.setOnAction( event -> EventStop() );
	}


	private void OverallStart()
	{
		System.out.println( "Overall start." );
	}


	private void OverallStop()
	{
		System.out.println( "Overall stop." );
	}


	private void EventStart()
	{
		System.out.println( "Event start." );
	}


	private void EventStop()
	{
		System.out.println( "Event stop." );
	}
}
