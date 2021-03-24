package collections;

public class Test {

	public static void main(String[] args) {
		MyGenericClass<String> s=new MyGenericClass<>("srilekha");
		s.displayObjectDetails();
		System.out.println(s.getObject());
		
		MyGenericClass<Integer> i=new MyGenericClass<>(1234);
		i.displayObjectDetails();
		System.out.println(i.getObject());
		
		MyGenericClass<Double> c=new MyGenericClass<>(12.34);
		c.displayObjectDetails();
		System.out.println(c.getObject());
		
		
		
	}

}
