import java.util.Scanner;

public class LoopsAssign {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=0;
		n=s.nextInt();
		System.out.println(n);
		
		for(int i=0;i<=n;i++) {
			if(i%10==0) {
				
				System.out.println(i);
				continue;
				
			}
			else if(n>100) {
				break;
			}
			else {
				System.out.println(" ");
			}
		}

	}

}
