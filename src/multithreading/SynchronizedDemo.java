package multithreading;

public class SynchronizedDemo {

	public static void main(String[] args) {
		DisplayMessage dm= new DisplayMessage();
		
		Mythreadsync t1=new Mythreadsync(dm,"sri");
		Mythreadsync t2=new Mythreadsync(dm,"deva");
		
		t1.start();
		t2.start();

	}

}
