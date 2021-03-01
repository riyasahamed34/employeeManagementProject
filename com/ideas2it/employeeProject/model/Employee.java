package com.ideas2it.employeeProject.model;

/**
 * Employee Pojo Class
 *
 * @version  2.0 23-02-2021
 * @author  Riyas Ahamed
 */
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private int salary;
    private long mobileNo;
    private String dob;
    
    public Employee(int employeeId, String firstName, String lastName, int salary, long mobileNo, String dob) {
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
	this.mobileNo = mobileNo;
	this.dob = dob;
    }

    public int getEmployeeId() {
	return employeeId;
    }

    public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public int getSalary() {
	return salary;
    }

    public void setSalary(int salary) {
	this.salary = salary;
    }

    public long getMobileNo() {
	return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
    }

    public String getDob() {
	return dob;
    }

    public void setDob(String lastName) {
	this.dob = dob;
    }

    public String toString() {
	    return "EmployeeId = " + employeeId +
	            "\n FirstName = " + firstName + 
		    "\n LastName = " + lastName + 
		    "\n DateOfBirth = " + dob +
		    "\n Salary = " + salary + 
		    "\n MobileNo = " + mobileNo ;
		    
    }
}

