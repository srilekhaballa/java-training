package basicconcepts;

public class ObjectReference {
	int x;
	
	public static void main(String []args) {
		ObjectReference obj = new ObjectReference();
		System.out.println(obj.x);
	}
	{
		System.out.println("Non static block");	
		}
	ObjectReference(){
		System.out.println(x);
	}
}
