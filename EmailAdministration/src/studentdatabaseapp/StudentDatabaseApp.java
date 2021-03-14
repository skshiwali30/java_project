package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		//ask how many student you want to add
		System.out.print("Enter number of new student to be enrolled: ");
		Scanner in = new Scanner(System.in);
		int numOfStudent = in.nextInt();
		Student[] student = new Student[numOfStudent];

		//create n number of student
		for(int n = 0; n < numOfStudent; n++) {
			student[n] = new Student();
			student[n].enroll();
			student[n].payTution();
		}
		for(int n = 0; n < numOfStudent; n++) {
			System.out.println(student[n].toString());
		}
	}
}
