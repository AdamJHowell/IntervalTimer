package com.adamjhowell.Birthquakes.model;


/**
 * Created by Adam Howell on 2016-06-28.
 * This class will model an event, and include:
 * event type
 * time of event
 */
public class TimeEvent
{
	private long eventTime;
	private String eventType;


	public TimeEvent( long eventTime, String eventType )
	{
		this.eventTime = eventTime;
		this.eventType = eventType;
	}


	public long getEventTime()
	{
		return eventTime;
	}


	public void setEventTime( long eventTime )
	{
		this.eventTime = eventTime;
	}


	public String getEventType()
	{
		return eventType;
	}


	public void setEventType( String eventType )
	{
		this.eventType = eventType;
	}
}
