package ass5;

public class StudentInfo {

	private int id;
	private String name;
	private Date DOB;
	private int sub1;
	private int sub2;
	private int sub3;

	public StudentInfo(int id, String name, Date dOB, int sub1, int sub2, int sub3) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public String toString() {
		return "ID:" + id + ", Name:" + name + ", Date of birth:" + DOB.day + "/" + DOB.month + "/" + DOB.year + ", Subject1:" + sub1 + ", Subject2:" + sub2 + ", Subject3:" + sub3;
	}
}
