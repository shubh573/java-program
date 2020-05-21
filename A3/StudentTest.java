package ass3;

import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter no of students:");
		int no = scan.nextInt();
		
		Student[] studs = new Student[no];

		for (int i = 0; i < no; i++) {

			System.out.println("Enter name and percentage of student "+(i+1));

			String name = scan.next();
			double percentage = scan.nextDouble();
			
			studs[i] = new Student(i + 1, name, percentage);
		}
		
		System.out.println("No of Students" + Student.cnt);
		
		System.out.println("Student details : ");
		for (int i = 0; i < no; i++) {
			System.out.println(studs[i]);
		}
			
		Student.sortStudents(studs);
		
		System.out.println("Sorted student details by percentage");
		for (int j = 0; j < no; j++) {
			System.out.println(studs[j]);
		}
		scan.close();
		
	}
}

