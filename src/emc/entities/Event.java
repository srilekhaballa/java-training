package emc.entities;

public class Event extends EMBase {
	
	public String description;
	public String startTime;
	public String endTime;
	public boolean started;
	Event(){
		System.out.println("default constructor");
	}
	public Event(  String description, String startTime, String endTime,
	boolean started){
		
		this.description=description;
		this.startTime=startTime;
		this.endTime=endTime;
		this.started=started;
	}
}
