package collections;

public class User {

	public String toString() {
		return "User";
	}
	
	protected void finalize() throws Throwable{
		System.out.println("finalize called");
	}
	
	
	
	
	

}
