package collections;

import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set=new TreeSet<>(new EmployeeNameComparator());
		set.add(new Employee(100,"obama"));
		set.add(new Employee(290,"george"));
		set.add(new Employee(478,"sri"));
		
		for (Employee employee : set) {
			System.out.println(employee.id);
			System.out.println(employee.name);
		}
	}

}
