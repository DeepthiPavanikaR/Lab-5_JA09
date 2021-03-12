import java.util.Scanner;

public class NameValidate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fname = s.nextLine();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your last name");
		String lname = s1.nextLine();
		
		try {
			if(fname.isEmpty() )
				throw new NameException("Please provide first name");
			else if(lname.isEmpty()) 
				throw new NameException("Please provide last name");
			else
				System.out.println("Valid name");
		}
		
		catch(NameException e) {
			System.out.println(e);
		}
		
		

	}

}
