package collections;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		String s1=o1.name;
		String s2=o2.name;
		return s1.compareTo(s2);
		
		
		
	}

}
