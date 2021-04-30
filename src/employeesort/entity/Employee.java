package employeesort.entity;

import employeesort.entity.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

 class Employee   {
	 
	 int empId;
	 String name;
     String email;
     String phone;
     String createdBy;
     Date createdOn;
     String updatedBy;
     Date updatedOn;
     Date dateOfJoining;
     
     public Employee(int empId, String name, String email, String phone, String createdBy, Date createdOn,
 			String updatedBy, Date updatedOn, Date dateOfJoining) {
 		super();
 		this.empId = empId;
 		this.name = name;
 		this.email = email;
 		this.phone = phone;
 		this.createdBy = createdBy;
 		this.createdOn = createdOn;
 		this.updatedBy = updatedBy;
 		this.updatedOn = updatedOn;
 		this.dateOfJoining = dateOfJoining;
 	}
     
	
	public int getEmpId() {
		return empId;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getPhone() {
		return phone;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public Date getCreatedOn() {
		return createdOn;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public Date getUpdatedOn() {
		return updatedOn;
	}


	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	@Override
	public String toString() {
		return "EmployeeSort [empId=" + empId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn="
				+ updatedOn + ", dateOfJoining=" + dateOfJoining + "]";
	}

}
	


 