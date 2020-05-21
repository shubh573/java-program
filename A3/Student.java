package ass3;

public class Student {

	private int rollNo;
	private String name;
	private double percentage;
	static int cnt=0;

	public Student(int rollNo, String name, double percentage) {
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
		cnt++;
	}
	
	public String toString() {
		return "Roll No:" + rollNo + ", Name:" + name + ", Percentage:" + percentage;
	}

	public static void sortStudents(Student[] studs) {

		for (int i = 0; i < studs.length; i++) {
			for (int j = i + 1; j < studs.length; j++) {
				if (studs[i].percentage < studs[j].percentage) {
					Student temp = studs[i];
					studs[i] = studs[j];
					studs[j] = temp;
				}
			}
		}
	}

}
