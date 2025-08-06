//Student grade printing using conditional statements
public class ConditionalStatements {
	public static void main(String args[]) {
		
		int marks = 90;
		if (marks >= 90) {
			System.out.println("A");
		}
		else if (marks >= 70) {
			System.out.println("B");
		}
		else if(marks>=50){
		    System.out.println("C");
		}
		else {
			System.out.println("Fail");
		}
}
}