package collections;

public class TestGenericClass {

	public static void main(String[] args) {
		MyGenericClass<String> s=new MyGenericClass<>("sree");
		s.displayObjectDetails();
		System.out.println(s.getObject());
		
		MyGenericClass<Integer> i=new MyGenericClass<>(1234);
		i.displayObjectDetails();
		System.out.println(i.getObject());
		
		MyGenericClass<Double> d=new MyGenericClass<>(32.54);
		d.displayObjectDetails();
		System.out.println(d.getObject());

	}

}
