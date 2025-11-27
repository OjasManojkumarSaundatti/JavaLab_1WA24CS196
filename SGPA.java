import java.util.Scanner;

class Student
{
	String USN,Name;
	int[] marks,credits;
	void accept_details()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the USN:");
		USN = scanner.nextLine();
		
		System.out.println("Enter the Name:");
		Name = scanner.nextLine();
		
		credits = new int[4];
		marks = new int[4];
		
		System.out.println("Enter the marks and credits for 4 subjects in order:");
		for(int i=0;i < 4;i++)
		{
			System.out.println("Enter credits of subject " + (i+1) + ":");
			credits[i] = scanner.nextInt();
			
			System.out.println("Enter marks of subject " + (i+1) + ":");
			marks[i] = scanner.nextInt();
		}
		scanner.close();
	}
	
	void display()
	{
		System.out.println("STUDENT DEATAILS");
		System.out.println("USN:" + (USN));
		System.out.println("Name:" + (Name));
		for(int i=0;i < 4;i++)
		{
			System.out.println("Subject " + (i+1) + "- " + "Credits:" + (credits[i]) + " and Marks:" + (marks[i]));
		}
	}
	
	double calcSGPA()
	{
		int totalCredits = 0;
		double totalGradePoints = 0;
		for(int i=0;i < 4;i++)
		{
			totalCredits += credits[i];
			totalGradePoints += gradePoints(marks[i]) * credits[i]; 
		}
		return totalGradePoints/totalCredits;
	}
	
	int gradePoints(int marks)
	{
		if(marks >= 90) return 10;
		else if(marks >= 80) return 9;
		else if(marks >= 70) return 8;
		else if(marks >= 60) return 7;
		else if(marks >= 50) return 6;
		else if(marks >= 40) return 5;
		else return 0;
	}
}

public class SGPA
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int numberOfStudents = scanner.nextInt();
		Student student[] = new Student[numberOfStudents];
		for (int j = 0 ; j < numberOfStudents ; j++)
		{
			student[j] = new Student();
			student[j].accept_details();
			student[j].display();
			System.out.println("\nSGPA : " + student[j].calcSGPA());
		}
		scanner.close();
	}
}