package HomeWork15;

public class Students {
	/*
	 * Create a Class called Students ---->Create three variables studentName , studentID
	 * and numberOfStudents Create three objects of the Students Class Set the value
	 * for studentName , studentID and increment the numberOfStudents for each
	 * object Print out total number of students
	 */
	String studentName; int studentID; static int noOfStudent;
	public static void main(String[] args) {
			Students student1=new Students();
			student1.studentName="Tamanna";
			student1.studentID=123456;
			student1.noOfStudent++;
			
			Students student2=new Students();
			student2.studentName="Tamanna";
			student2.studentID=123456;
			student2.noOfStudent++;
			
			Students student3=new Students();
			student3.studentName="Tamanna";
			student3.studentID=123456;
			student3.noOfStudent++;
			System.out.println("Total number of student are "+ noOfStudent);
			
		
	}

}
