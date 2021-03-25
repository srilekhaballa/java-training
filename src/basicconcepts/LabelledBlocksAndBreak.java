package basicconcepts;

public class LabelledBlocksAndBreak {
	public static void main(String[] args) {
		int x=20;
		l1:{
			System.out.println("Inside Block");
			if(x==20) {
				break l1;  //continue cant be used outside of loop
			}
			System.out.println("Block Ends");
		}
		System.out.println("Out of Block");
	}
}
