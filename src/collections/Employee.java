package collections;

public class Employee implements Comparable<Employee>{
	
	int id;
	String name;

	Employee (int id, String name){
		this.id=id;
		this.name=name;
	}
	public int compareTo(Employee o) {
		int id1=this.id;
		int id2=o.id;
		if(id1 < id2) {
			return -1;
		
		}else if(id1 > id2) {
			return 1;
		
		}
		
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
