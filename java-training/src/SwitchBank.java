
public class SwitchBank {

	public static void main(String[] args) {
		String choice="";
		switch(choice) {
		case "Check Balance":
			System.out.println("Check Balance");
		case "Change pin":
			System.out.println("Change pin");
		case "Withdraw cash":
			System.out.println("Withdraw cash");
		case "Deposit Check":
			System.out.println("Deposit Check");
		default:
			System.out.println("Time Out");
		}
	}

}
