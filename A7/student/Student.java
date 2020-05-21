package student;

import sy.*;
import ty.*;

public class Student {

		private int rno;
		private String name;
		private String grade;
		private SYMarks syMrk;
		private TYMarks tyMrk;
		private double avg;

		public Student(int rollNumber, String name, SYMarks sm, TYMarks tm) {
			super();
			this.rno = rollNumber;
			this.name = name;
			syMrk = sm;
			tyMrk = tm;
		}

		public static void calculateGrade(Student[] stud) {
			
			for (int i = 0; i < stud.length; i++) {
			int sum = stud[i].syMrk.getComputerTotal() + stud[i].syMrk.getElectronicsTotal() + stud[i].syMrk.getMathsTotal()
					+ stud[i].tyMrk.getPracticalMarks() + stud[i].tyMrk.getTheoryMarks();
			stud[i].avg = sum / 5;
			if (stud[i].avg >= 70) {
				stud[i].grade = "A";
			} else if (stud[i].avg >= 60 && stud[i].avg < 70) {
				stud[i].grade = "B";
			} else if (stud[i].avg >= 50 && stud[i].avg < 60) {
				stud[i].grade = "C";
			} else if (stud[i].avg >= 40 && stud[i].avg < 50) {
				stud[i].grade = "Pass";
			} else 
				stud[i].grade = "Fail";
			}

		}

		@Override
		public String toString() {
			return rno + ", Name : " + name + ", Average : " + avg + " Grade : " + grade;
		}

}
