package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String designation;
	private double salary;
	private double ta;
	private double da;
	private double pf;
	private double gross_salary;
	private double net_salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String designation, double salary, double ta, double da, double pf,
			double gross_salary, double net_salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.ta = ta;
		this.da = da;
		this.pf = pf;
		this.gross_salary = gross_salary;
		this.net_salary = net_salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGross_salary() {
		return gross_salary;
	}
	public void setGross_salary(double gross_salary) {
		this.gross_salary = gross_salary;
	}
	public double getNet_salary() {
		return net_salary;
	}
	public void setNet_salary(double net_salary) {
		this.net_salary = net_salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + ", ta="
				+ ta + ", da=" + da + ", pf=" + pf + ", gross_salary=" + gross_salary + ", net_salary=" + net_salary
				+ "]";
	}
}
