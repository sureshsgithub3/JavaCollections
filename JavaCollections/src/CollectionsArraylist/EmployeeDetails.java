package CollectionsArraylist;

import java.util.ArrayList;

public class EmployeeDetails {

	public static void main(String[] args) {
		ArrayList<Employee>emp= new ArrayList<Employee>();
		emp.add(new Employee("suresh", 1));
		emp.add(new Employee("sanajib", 2));
		emp.add(new Employee("swarna", 3));
		emp.add(new Employee("Srinivas", 4));
		
		
		
		System.out.println(emp);

	}

}
