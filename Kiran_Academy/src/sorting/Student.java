package sorting;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	public String name;
	public int age;
	
	public static void acceptData(Student ss[]) {
		for(int k=0 ; k<ss.length ; k++) {
			ss[k] = new Student(); 
			ss[k].enterStudentInfo();
		}
	}
	
	public static void displayData(Student ss[]) {
		for(int k=0 ; k<ss.length ; k++) {
			
			ss[k].showStudentInfo();
		}
	}
	
	public void enterStudentInfo() {
		System.out.println("Enter name :");
		name = sc.next();
		System.out.println("Enter age :");
		age = sc.nextInt();
	}
	
	public void showStudentInfo() {
		System.out.println("-----------------");
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
	}
}
