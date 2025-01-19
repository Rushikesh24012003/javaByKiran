package sorting;

import java.util.Scanner;

public class Employee {
	
	Scanner sc = new Scanner(System.in);
	public String employeeName , employeeDepartment;
	public int employeeID , employeeSalary;
	
	public static void acceptData(Employee e[]) {
		for(int k=0 ; k<e.length ; k++) {
			e[k] = new Employee(); 
			e[k].enterStudentInfo();
		}
	}
	
	public static void displayData(Employee e[]) {
		for(int k=0 ; k<e.length ; k++) {
			e[k].showStudentInfo();
		}
	}
	
	public void enterStudentInfo() {
		
		System.out.println("Enter Employee ID :");
		employeeID = sc.nextInt();
		System.out.println("Enter Employee name :");
		employeeName = sc.next();
		System.out.println("Enter Employee Department :");
		employeeDepartment = sc.next();
		System.out.println("Enter Employee Salary :");
		employeeSalary = sc.nextInt();
	}
	
	public void showStudentInfo() {
		System.out.println("-----------------");
		System.out.println("Employee ID : " +employeeID);
		System.out.println("Employee Name : " +employeeName);
		System.out.println("Employee Department : " +employeeDepartment);
		System.out.println("Employee Salary : " +employeeSalary);
	}

}
