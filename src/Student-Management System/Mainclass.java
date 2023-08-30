package prayashi;

import java.util.*;

public class Mainclass {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		Mainclass mainclass = new Mainclass();
		while (true) {
			System.out.println("Enter 1 to add student");
			System.out.println("Enter 2 to view student");
			System.out.println("Enter 3 to delete student");
			System.out.println("Enter 4 to update student");

			String choice = mainclass.scanner.nextLine(); // Either you make a class or make the scanner static.
			switch (choice) {
			
			case "1":
				mainclass.addstudent(); 
				break;
			case "2":
				mainclass.view();
			//	System.out.println("you have choose to view student");
				break;
			case "3":
				mainclass.delete();
				System.out.println("You have choose to delete student");
				break;
			case "4":
				System.out.println("You have choose to update student");
				break;
			default:
				System.out.println("INVALID");
			}

			System.out.println("Do you want to continue further?" + "Enter N to exit. Enter any other key to continue");
			String continueFurther = mainclass.scanner.nextLine();
			if (continueFurther.equalsIgnoreCase("N")) {
				break;
			}
		}
	}

	public void addstudent() {
		System.out.println("Enter student Name:");
		String name = scanner.nextLine();
		System.out.println("Enter student Address:");
		String address = scanner.nextLine();
		System.out.println("Enter student course:");
		String course = scanner.nextLine();

		Student student = new Student();
		student.setAddress(address);
		student.setName(name);
		student.setCourse(course);

		students.add(student);
		System.out.println("Student added");

	}
	public void view() {
		for(int i=0; i<students.size(); i++){
			Student student = students.get(i);
			System.out.println("NAME    = " +student.getName());
			System.out.println("ADDRESS = " +student.getAddress());
			System.out.println("COURSE  = " +student.getCourse());
			System.out.println("............");
		}
	}
	public void delete() {
		for(int i=0; i<students.size(); i++){
			Student student1 = students.get(i);
			System.out.println("NAME    = " +student1.getName());
			System.out.println("ADDRESS = " +student1.getAddress());
			System.out.println("COURSE  = " +student1.getCourse());
			System.out.println("............");
		}
}
}
