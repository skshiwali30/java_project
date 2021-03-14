package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costofCourse = 600;
	private static int id = 1000;
	
	//constructor
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.print("Student Class Level- \n1 for Freshman \n2 for Sophmore \n3 for Junior \n4 for Senior\nEnter Student Class Level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
	}
	
	//generate an id
	private void setStudentID() {
		//grade level + id
		id++;
		this.studentID = gradeYear + "" + id;		
	}
	
	//Enroll a course
	public void enroll() {
		char ch;
		do {
			System.out.print("Enter a course to enroll (Q for quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.toUpperCase().equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costofCourse;
			}
			else
				break;
		}while(1 != 0);		
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your Balance is: $" + tuitionBalance);
	}
	
	//Pay Tuition
	public void payTution() {
		viewBalance();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your payment: ");
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//show Status
	public String toString() {
		System.out.println("-----------------------------");
		return "Name: " + firstName + " " + lastName +
				"\nGrade Year: " + gradeYear + 
				"\nCourses enrolled: " + courses + 
				"\nBalance: " + tuitionBalance;
	}
}
