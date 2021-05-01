package employeesort.entity;

import java.util.Date;

public class EmployeeDto {
	private int empId;
	private String name;
    private String email;
    private String phone;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
    private Date updatedOn;
    private Date dateOfJoining;
    private int department;
    
    public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getDepartment() {
		return department;
	}
	public void setDeptId(int department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn="
				+ updatedOn + ", dateOfJoining=" + dateOfJoining + ", department=" + department + "]";
	}
	public EmployeeDto(int empId, String name, String email, String phone, String createdBy, Date createdOn,
			String updatedBy, Date updatedOn, Date dateOfJoining, int department) {
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
		this.department = department;
	}
}
