//Sum of numbers using For loop
import java.util.Scanner;
public class SumofNnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int m=0;
		for (int i=1;i<=n;i++) {
			m += i;
		}
		System.out.println("Sum of N numbers is " + m);
	}

}
