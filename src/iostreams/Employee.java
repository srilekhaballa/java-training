package iostreams;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	double salary;
	transient int ssn;
	Employee(int id,String name,int salary,int ssn){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.ssn=ssn;
	}
	public static void main(String[] args) {

	}
}



