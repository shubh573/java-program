package ass5;

public class StudInfoTest {
	
	public static void main(String[] args) {

		int id = Integer.parseInt(args[0]);
		String name = args[1];
		int dd = Integer.parseInt(args[2]);
		int mm = Integer.parseInt(args[3]);
		int yy = Integer.parseInt(args[4]);
		int sub1=Integer.parseInt(args[5]);
		int sub2=Integer.parseInt(args[6]);
		int sub3=Integer.parseInt(args[7]);
		
		if (dd >= 1 && dd <= 31) {
			if (mm >= 1 && mm < 12) {
				if (yy > 1900 && yy < 2100) {
					
					Date d = new Date(dd, mm, yy);
						StudentInfo stud = new StudentInfo(id, name, d, sub1, sub2, sub3);
						
						System.out.println(stud);
				}
			}
		} 
	}	
}
