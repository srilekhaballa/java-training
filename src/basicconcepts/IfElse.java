package basicconcepts;

public class IfElse {
	public static void main(String []args) {
		/*int x=10,y=20;
		if(x>y) {
			System.out.println("x is greater");
		}
		else {
			System.out.println("y is greater");
		}
	
		int a=10,b=20;
		if(a>b) {
			System.out.println("a is greater");
		}
		else if(a<b) {
			System.out.println("b is greater");
		} else {
			System.out.println("a = b");
		}*/
	
		//public static void main(String []args){

            int maths=21,physics=56,chemistry=39;

             if(maths<35 || physics<35 || chemistry <35){

                     System.out.println("failed");

                     }

             else{

                    System.out.println("passed");

                      }

              double avg= (maths+physics+chemistry)/3;

               if (avg<= 59)

                     {

                      System.out.println("Grade - C");

                      }

               else if(avg <=69 && avg > 59)

                      {

                       System.out.println("Grade - B");

                       }

               else {

                    System.out.println("Grade - C");

                     }

               }
	
	
	
	//}
}
