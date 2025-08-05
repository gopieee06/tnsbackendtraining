
public class VariableDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling instace variable
		VariableDemo ob = new VariableDemo();
		System.out.println(ob.name = "This is instance variable...");
		
		//calling local variable
		System.out.print("This is local varible");
		ob.display();
		
		//calling static variable
		System.out.println("This is Static variable " + VariableDemo.college);

	}

}
