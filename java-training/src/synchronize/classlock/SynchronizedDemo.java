package synchronize.classlock;

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		
		Mythreadsync t1=new Mythreadsync("sri");
		Mythreadsync t2=new Mythreadsync("deva");
		
		t1.start();
		t2.start();

	}

}
