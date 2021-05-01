package employeesort.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class EmployeeSorterTest {
	EmployeeSorter employeeSorter;
	
	private static final Logger logger = java.util.logging.Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	@Before
	public void setUp() throws Exception {
        Employee emp1 = new Employee(3,"jahnavi" , "jahnavi@gmail.com","7787685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("23/04/2021"));
        Employee emp2 = new Employee(4,"basha" , "basha@gmail.com","9997685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("24/04/2021"));
        Employee emp3 = new Employee(7,"lepakshi" , "lepakshi@gmail.com","9097685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("27/04/2021"));
        Employee emp4 = new Employee(5,"ashana" , "ashana@gmail.com","9087685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("20/04/2021"));
        Employee emp5 = new Employee(6,"ganga" , "ganga@gmail.com","8087685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("23/04/2021"));
        Employee emp6 = new Employee(1,"feresh" , "feresh@gmail.com","6587685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("25/04/2021"));
        Employee emp7 = new Employee(10,"harika" , "harika@gmail.com","6787685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("22/04/2021"));
        Employee emp8 = new Employee(8,"diana" , "diana@gmail.com","8887685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("22/04/2021"));
        Employee emp9 = new Employee(2,"eswar" , "eswar@gmail.com","7777685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("21/04/2021"));
        Employee emp10 = new Employee(9,"kalyan" , "kalyan@gmail.com","8787685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("26/04/2021"));
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        employeeList.add(emp8);
        employeeList.add(emp9);
        employeeList.add(emp10);
        logger.info("\n -----Unsorted Employees----- ");
        for (Object employee : employeeList) {
        	System.out.println(employee);
        }
        employeeSorter = new EmployeeSorter(employeeList);
    }
	
    @Test
    public void testGetSortedEmployeeById() throws Exception {
    	logger.info("\n -----Sorted Employee by Id: Ascending-----");
    	List<Employee> sortedEmployee = employeeSorter.getSortedEmployeeById();
        for (Object employee : sortedEmployee) {
        	System.out.println(employee);
        }
    }
    
    @Test
    public void testGetSortedEmployeeByName() throws Exception {
        logger.info("\n -----Sorted Employee by name: Ascending-----");
        List<Employee> sortedEmployee = employeeSorter.getSortedEmployeeByName();
        for (Object employee : sortedEmployee) {
            System.out.println(employee);
        }
    }
    
    @Test
    public void testGetSortedEmployeeByDateOfJoining() throws Exception {
        logger.info("\n -----Sorted Employee by Date of joining: Ascending-----");
        List<Employee> sortedEmployee = employeeSorter.getSortedEmployeeByDateOfJoining();
        for (Object employee : sortedEmployee) {
            System.out.println(employee);
        }
    }
    
}
