package employees;

import java.util.Date;

public class EmployeesDTO {
	private String first_name;
	private int salary;
	private Date hire_date;
	private int job_tenure;
	
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public int getJob_tenure() {
		return job_tenure;
	}
	public void setJob_tenure(int job_tenure) {
		this.job_tenure = job_tenure;
	}

	

}
