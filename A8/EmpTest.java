package ass9;

import java.util.Scanner;

public class EmpTest {
	
	public static int getHighestSalaryEmp(Employee[] employees) {

		if (employees.length <= 0)
			return -1;

		int index = 0;
		int max = employees[0].getSalary();
		for (int i = 1; i < employees.length; i++) {
			if (employees[i].getSalary() > max) {
				max = employees[i].getSalary();
				index = i;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Employee[] emp = new Employee[5];

		for (int i = 0; i < emp.length; i++) {
			System.out.println("Enter name,dept,salary,bonus:");
			emp[i] = new Manager(i + 1, scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
		}

		int index = getHighestSalaryEmp(emp);

		System.out.println("Manager details with highest salary : " + emp[index]);

		scan.close();

	}

}
