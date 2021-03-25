package emc.test;
import emc.entities.*;

public class Test  {
	public static void main(String []args) {
		
		Organizer o=new Organizer();
		o.id= 123;
		o.name="sri";
		
Event e=new Event("2k21 freshers for Krishna engg clg","18-03-2021 12:00:00","18-03-2021 09:00:00",true);
		
		
		System.out.println(o);
		System.out.println(o.name);
		
		System.out.println(e.description);
	}
}
