package basicconcepts;

public class DefaultConstructor {
	int num=5;
	static {
		System.out.println("Inside static block");
	}
	DefaultConstructor(){
		System.out.println("num is:"+num);
	}
	{
		System.out.println("Inside non-static block");
	}
	
	
	
	public static void main(String []args) {
		
		System.out.println("Inside the main method");
		
		new DefaultConstructor();
		new DefaultConstructor();
		
	}
	
}
