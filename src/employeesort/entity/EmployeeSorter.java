package employeesort.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EmployeeSorter {
	
	    List<Employee> employee = new ArrayList<Employee>();
	    
	    public EmployeeSorter(List<Employee> employee) {
	        this.employee = employee;
	    }
	    public List<Employee> getSortedEmployeeById() {
	        Collections.sort(employee, ( a,  b)-> {
	             return  a.getEmpId()-b.getEmpId();
	          });
	        return employee;
	    }
	    public List<Employee> getSortedEmployeeByName() {
	        Collections.sort(employee,( a,  b)-> {
	            return (int) (a.getName().compareTo(b.getName()));
	        });
	        return employee;
	    }
	    public List<Employee> getSortedEmployeeByDateOfJoining() {
	        Collections.sort(employee,( a,  b)-> {
	            return (int) (a.getDateOfJoining().compareTo(b.getDateOfJoining()));
	        });
	        return employee;
	    }
}
