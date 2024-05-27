package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Employee;
import com.web.repo.EmployeeRepo;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
	
	@RequestMapping("/")
	public String homepage() 
	{
		return "home";
	}
	
	@RequestMapping("/addemp")
	public String employeeForm()
	{
		return "empreg";
	}
	
	@RequestMapping("/register")
	public String employeePage(@RequestParam int id,@RequestParam String name,@RequestParam String designation,
			@RequestParam double salary,Employee emp,ModelMap model)
	{
		double t,d,p,gs,ns;
		if(salary<30000)
		{
			t=(emp.getSalary()*7)/100;
			d=(emp.getSalary()*9)/100;
			p=(emp.getSalary()*11)/100;
		}
		else if (salary>=30000&&salary<50000) {
			t=(emp.getSalary()*12)/100;
			d=(emp.getSalary()*13)/100;
			p=(emp.getSalary()*22)/100;
		}
		else {
			t=(emp.getSalary()*17)/100;
			d=(emp.getSalary()*19)/100;
			p=(emp.getSalary()*25)/100;
		}
		emp.setTa(t);
		emp.setDa(d);
		emp.setPf(p);
		gs=emp.getSalary()+t+d;
		ns=gs-p;
		emp.setGross_salary(gs);
		emp.setNet_salary(ns);
		repo.save(emp);
		return "success";
	}
	
	@RequestMapping("/viewemp")
	public String getAllEmployees(ModelMap model)
	{
		model.put("emps", repo.findAll());
		return "viewemps";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteRecord(@PathVariable int id)
	{
		repo.deleteById(101);
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/edit/{id}")
	public String editUserForm(@PathVariable int id,ModelMap model)
	{
		Employee emp=repo.findById(id).get();
		model.addAttribute("command", emp);
		return "editemp";
	}
	
	@RequestMapping("/editu")
	public String editAndSave(@RequestParam int id,@RequestParam String name,@RequestParam String designation,
			@RequestParam double salary,Employee emp,ModelMap model)
	{
		repo.save(emp);
		return "viewemps";
	}

}
