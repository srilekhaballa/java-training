
/*public class Continue {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i%2 == 0) {
				continue;
			}
		System.out.println(i);
		}

	}

}*/
public class Continue{

	public static void main(String []args){

		boolean primeFlag=true;

		int n=8;

		for(int i=2; i<n ; i++){

			if(n%i == 0)

				primeFlag=false;

		}

		if(primeFlag){

			System.out.println("prime");

		}

		else{

			System.out.println("not prime");

		}

	}

}
