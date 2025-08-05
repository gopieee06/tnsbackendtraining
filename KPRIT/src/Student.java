//Demo for static key word
public class Student {
	int rollno;
	String name;
	String branch;
	static String college = "KPRIT";
	void print() {
		System.out.println("This is details of student " + name  + " Rollno is " + rollno + " Branch is " + branch + 
				" college is " + college);
	}

}
