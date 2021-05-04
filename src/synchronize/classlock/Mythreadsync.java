package synchronize.classlock;

public class Mythreadsync extends Thread{
		DisplayMessage dm;
		String name;
		 Mythreadsync(String name){
			 
			 this.name=name;
		 }
		 
		 public void run() {
			 DisplayMessage.sayHello(name);
		 }
	public static void main(String[] args) {

	}

}
