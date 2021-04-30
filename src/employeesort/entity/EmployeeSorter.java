package employeesort.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class EmployeeSorter {
	
	    ArrayList<Employee> employee = new ArrayList<Employee>();
	    
	    public EmployeeSorter(ArrayList employee) {
	        this.employee = employee;
	    }
	    public ArrayList getSortedEmployeeById() {
	        Collections.sort(employee, ( a,  b)-> {
	             return  a.getEmpId()-b.getEmpId();
	          });
	        return employee;
	    }
	    public ArrayList getSortedEmployeeByName() {
	        Collections.sort(employee,( a,  b)-> {
	            return (int) (a.getName().compareTo(b.getName()));
	        });
	        return employee;
	    }
	    public ArrayList getSortedEmployeeByDateOfJoining() {
	        Collections.sort(employee,( a,  b)-> {
	            return (int) (a.getDateOfJoining().compareTo(b.getDateOfJoining()));
	        });
	        return employee;
	    }
}
