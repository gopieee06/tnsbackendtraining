//factorial using while loops
import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		int num;
		int factorial = 1;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		while(num>=i) {
			factorial *= i;
			i++;
		}
		System.out.println("Factorial of number " + num + " is " + factorial);
}
}