package employeesort.entity;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesByDept {
	
	public static void main(String []args) throws Exception {
			List<EmployeeDto> employees = Arrays.asList(new EmployeeDto(3,"jahnavi" , "jahnavi@gmail.com","7787685453","sri",new Date(),"admin",new Date(),
	        new SimpleDateFormat("dd/MM/yyyy").parse("23/04/2021"),100),new EmployeeDto(4,"basha" , "basha@gmail.com","9997685453","sri",new Date(),"admin",new Date(),
	        new SimpleDateFormat("dd/MM/yyyy").parse("24/04/2021"),200),new EmployeeDto(7,"lepakshi" , "lepakshi@gmail.com","9097685453","sri",new Date(),"admin",new Date(),
	        new SimpleDateFormat("dd/MM/yyyy").parse("27/04/2021"),100),new EmployeeDto(5,"ashana" , "ashana@gmail.com","9087685453","sri",new Date(),"admin",new Date(),
	        new SimpleDateFormat("dd/MM/yyyy").parse("20/04/2021"),200),new EmployeeDto(1,"feresh" , "feresh@gmail.com","6587685453","sri",new Date(),"admin",new Date(),
	        new SimpleDateFormat("dd/MM/yyyy").parse("25/04/2021"),200),new EmployeeDto(10,"harika" , "harika@gmail.com","6787685453","sri",new Date(),"admin",new Date(),
	        new SimpleDateFormat("dd/MM/yyyy").parse("22/04/2021"),100),new EmployeeDto(8,"diana" , "diana@gmail.com","8887685453","sri",new Date(),"admin",new Date(),
	        new SimpleDateFormat("dd/MM/yyyy").parse("22/04/2021"),200),new EmployeeDto(2,"eswar" , "eswar@gmail.com","7777685453","sri",new Date(),"admin",new Date(),
	        new SimpleDateFormat("dd/MM/yyyy").parse("21/04/2021"),100),new EmployeeDto(9,"kalyan" , "kalyan@gmail.com","8787685453","sri",new Date(),"admin",new Date(),
	        new SimpleDateFormat("dd/MM/yyyy").parse("26/04/2021"),100));
			
			Map < Integer, List < EmployeeDto >> byDept = employees.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment));
			
			byDept.forEach((k, v) -> System.out.println("DeptId:" +k +"   " +(List < EmployeeDto > ) v));
	}
}
