package synchronization.blocks;

public class Mythreadsync extends Thread{
		DisplayMessage dm;
		String name;
		 Mythreadsync(DisplayMessage dm,String name){
			 this.dm=dm;
			 this.name=name;
		 }
		 
		 public void run() {
			 dm.sayHello(name);
		 }
	public static void main(String[] args) {

	}

}
