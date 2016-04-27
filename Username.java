import java.util.Scanner;
public class Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username, password;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username");
		username = keyboard.next();
		
		System.out.println("Enter your password");
		password = keyboard.next();
		
		System.out.println( "Hello " + username +", Welcome to CSC200 class! and Your password is " + password);
		
	}

}
