package emc.entities;

import org.apache.log4j.Logger;

public class Event extends EMBase {
	
	private static final Logger logger = Logger.getLogger("Event.class");
	public String description;
	public String startTime;
	public String endTime;
	public boolean started;
	Event(){
		logger.info("default constructor");
	}
	public Event(  String description, String startTime, String endTime,
	boolean started){
		
		this.description=description;
		this.startTime=startTime;
		this.endTime=endTime;
		this.started=started;
	}
}
