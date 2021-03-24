package basicconcepts;

public class NonStaticMembers {
	int num;
	{
		System.out.println("Inside the non-static block");
	}
	NonStaticMembers(){
		System.out.println("Inside the constructor");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticMembers();
		new NonStaticMembers();
		new NonStaticMembers();
	}
	static {
		System.out.println("Inside static block");
	}
}

