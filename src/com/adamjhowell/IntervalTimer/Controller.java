/**
 * Sample Skeleton for 'sample.fxml' Controller Class
 */

package com.adamjhowell.IntervalTimer;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller
{

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="overallStartButton"
	private Button overallStartButton; // Value injected by FXMLLoader

	@FXML // fx:id="overallStopButton"
	private Button overallStopButton; // Value injected by FXMLLoader

	@FXML // fx:id="overallTimerLabel"
	private Label overallTimerLabel; // Value injected by FXMLLoader

	@FXML // fx:id="eventTimerLabel"
	private Label eventTimerLabel; // Value injected by FXMLLoader


	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize()
	{
		assert overallStartButton != null :
			"fx:id=\"overallStartButton\" was not injected: check your FXML file 'sample.fxml'.";
		assert overallStopButton != null :
			"fx:id=\"overallStopButton\" was not injected: check your FXML file 'sample.fxml'.";
		assert overallTimerLabel != null :
			"fx:id=\"overallTimerLabel\" was not injected: check your FXML file 'sample.fxml'.";
		assert eventTimerLabel != null :
			"fx:id=\"eventTimerLabel\" was not injected: check your FXML file 'sample.fxml'.";

	}
}
