package basicconcepts;

public class ExplicitTypecastingBeyondRange {
	public static void main(String []args) {
		int i = 100;
		byte b= (byte)i;
		
		int x=120;
		char ch=(char)x;
		System.out.println(ch);
		
		int y=612;
		byte c=(byte)y;
		char d=(char)c;
		System.out.println(d);
		
		
		
	}
}
