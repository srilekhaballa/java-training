
public class DoWhileUnreachable {

	public static void main(String[] args) {
		int i=5;
		do {
			System.out.println("reachable code");
		}
		while(true); // for(;;) {
		//System.out.println("Unreachable below infinite loop");
	}

}
