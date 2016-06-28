package com.adamjhowell.Birthquakes;


import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by Adam Howell
 * on 2016-06-28.
 * Borrowed from examples on the internet.
 */
class AJHTimer
{
	private SimpleDateFormat stopwatchFormat = new SimpleDateFormat( "mm:ss:S" );
	private String[] segmentedTime;
	private SimpleStringProperty SSPTime;
	private long time;
	private Timer oscillator = new Timer( "Oscillator", true );  // Create a timer daemon.
	private TimerTask timerTask;
	private boolean timerRunning = false;


	AJHTimer()
	{
		SSPTime = new SimpleStringProperty( "00:00:00" );
	}


	void startTimer( final long startingTime )
	{
		this.time = startingTime;
		timerRunning = true;
		timerTask = new TimerTask()
		{
			@Override public void run()
			{
				if( !timerRunning )
				{
					try
					{
						timerTask.cancel();
					}
					catch( Exception e )
					{
						e.printStackTrace();
					}
				}
				else
				{
					updateTime();
				}
			}
		};
		oscillator.scheduleAtFixedRate( timerTask, 10, 10 );
	}


	synchronized void stopTimer()
	{
		timerRunning = false;
	}


	private synchronized void updateTime()
	{
		this.time = this.time + 10;
		segmentedTime = stopwatchFormat.format( new Date( this.time ) ).split( ":" );
		SSPTime.set( segmentedTime[0] + ":" + segmentedTime[1] + ":" + ( segmentedTime[2].length() == 1 ? "0" + segmentedTime[2] : segmentedTime[2].substring( 0, 2 ) ) );
	}


	public synchronized void moveToTime( long time )
	{
		stopTimer();
		this.time = time;
		segmentedTime = stopwatchFormat.format( new Date( time ) ).split( ":" );
		SSPTime.set( segmentedTime[0] + ":" + segmentedTime[1] + ":" + ( segmentedTime[2].length() == 1 ? "0" + segmentedTime[2] : segmentedTime[2].substring( 0, 2 ) ) );
	}


	synchronized long getTime()
	{
		return time;
	}


	synchronized SimpleStringProperty getSSPTime()
	{
		return SSPTime;
	}
}