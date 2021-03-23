package basicconcepts;

public class MorePrograms {

	public static void main(String[] args) {
		String choice="";
		if(choice.equals("Check Balance")) {
			System.out.println("Check Balance");
		}
		else if(choice.equals("Change pin")) {
			System.out.println("Change pin");
		}
		else if (choice.equals("Withdraw cash")) {
			System.out.println("Withdraw cash");
		}
		else if (choice.equals("Deposit Check")) {
			System.out.println("Deposit Check");
		}
		else {
			System.out.println("Time Out");
		}
	}

}
