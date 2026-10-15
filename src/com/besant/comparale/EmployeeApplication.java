package com.besant.comparale;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Employee emp1=new Employee(101, "Faisal", 23, 15000);
				Employee emp2=new Employee(102, "Lokesh", 25, 16000);
				Employee emp3=new Employee(103, "Sumant", 24, 15000);
				Employee emp4=new Employee(104, "Adil", 24, 20000);
				Employee emp5=new Employee(105, "Naruto", 24,21000);
				
				ArrayList<Employee>empList=new ArrayList<Employee>();
				empList.add(emp1);
				empList.add(emp2);
				empList.add(emp3);
				empList.add(emp4);
				empList.add(emp5);
				
				Collections.sort(empList,new EmpSortByName());
				
				for (Employee employee : empList) {
					System.out.println(employee);
					
				}

	}

}



//What is the diffrence between collection and concurrent collections ?
//Explain collections with concurrent collection
// Explain diffrent interfaces and concurrent collection?
//What is comparable and caparater in java? v.v imp
//what is comprable ?explain
//what is comparater? explain
// camaprater with lamda expression.
