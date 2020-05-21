package student;

import sy.SYMarks;
import ty.TYMarks;

public class StudTest {

	public static void main(String[] args) {
	
		Student[] stud = new Student[5];
		
		stud[0] = new Student(101,"Pratik",new SYMarks(68,57,47),new TYMarks(72,56));
		stud[1] = new Student(102,"Aryan",new SYMarks(56,58,89),new TYMarks(48,75));
		stud[2] = new Student(103,"Rahul",new SYMarks(72,75,68),new TYMarks(85,79));
		stud[3] = new Student(104,"Deepak",new SYMarks(57,25,43),new TYMarks(36,23));
		stud[4] = new Student(105,"Nikhil",new SYMarks(57,75,43),new TYMarks(36,23));
		
		Student.calculateGrade(stud);

		System.out.println("Result");
		for (int i = 0; i < 5; i++) {
			System.out.println(stud[i]);
		}
	}
}
