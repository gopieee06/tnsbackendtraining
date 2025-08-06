//Student grade printing using conditional statements
import java.util.Scanner;
public class ConditionalStatements {
	public static void main(String args[]) {
		
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a the marks : ");
		marks = sc.nextInt();
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