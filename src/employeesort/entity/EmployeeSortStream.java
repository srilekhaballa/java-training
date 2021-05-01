package employeesort.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class EmployeeSortStream {
	
	private static final Logger logger = java.util.logging.Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) throws Exception 
    {
        List<Employee> employees = getUnsortedEmployeeList();
        
        logger.info("----Unsorted employees----");
        for (Object employee : employees) {
            System.out.println(employee);
        }
        Comparator<Employee> compareByName = Comparator
                                                .comparing(Employee::getName);
        List<Employee> sortedEmployeesByName = employees.stream()
                                        .sorted(compareByName)
                                        .collect(Collectors.toList());
        logger.info("----Sorted Employees by name---- ");
        for (Object employee : sortedEmployeesByName) {
            System.out.println(employee);
        }
        
        logger.info("----Unsorted employees----");
        for (Object employee : employees) {
            System.out.println(employee);
        }
        Comparator<Employee> compareById = Comparator
                .comparing(Employee::getEmpId);
        List<Employee> sortedEmployeesById = employees.stream()
        								.sorted(compareById)
        								.collect(Collectors.toList());
        logger.info("----Sorted Employees by Id---- ");
        for (Object employee : sortedEmployeesById) {
            System.out.println(employee);
        }
        
        logger.info("----Unsorted employees----");
        for (Object employee : employees) {
            System.out.println(employee);
        }
        Comparator<Employee> compareByDateOfJoining = Comparator
                .comparing(Employee::getDateOfJoining);
        List<Employee> sortedEmployeesByDateOfJoining = employees.stream()
        								.sorted(compareByDateOfJoining)
        								.collect(Collectors.toList());
        logger.info("----Sorted Employees by DateOfJoining---- ");
        for (Object employee : sortedEmployeesByDateOfJoining) {
            System.out.println(employee);
        }
        
    }
 
    private static List<Employee> getUnsortedEmployeeList() throws Exception   
    {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3,"jahnavi" , "jahnavi@gmail.com","7787685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("23/04/2021")));
        list.add(new Employee(4,"basha" , "basha@gmail.com","9997685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("24/04/2021"))); 
        list.add(new Employee(7,"lepakshi" , "lepakshi@gmail.com","9097685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("27/04/2021")));
        list.add(new Employee(5,"ashana" , "ashana@gmail.com","9087685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("20/04/2021")));
        list.add(new Employee(6,"ganga" , "ganga@gmail.com","8087685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("23/04/2021")));
        list.add(new Employee(1,"feresh" , "feresh@gmail.com","6587685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("25/04/2021")));
        list.add(new Employee(10,"harika" , "harika@gmail.com","6787685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("22/04/2021")));
        list.add(new Employee(8,"diana" , "diana@gmail.com","8887685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("22/04/2021")));
        list.add( new Employee(2,"eswar" , "eswar@gmail.com","7777685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("21/04/2021")));
        list.add(new Employee(9,"kalyan" , "kalyan@gmail.com","8787685453","sri",new Date(),"admin",new Date(),
        		new SimpleDateFormat("dd/MM/yyyy").parse("26/04/2021")));
        return list;
    }
}

