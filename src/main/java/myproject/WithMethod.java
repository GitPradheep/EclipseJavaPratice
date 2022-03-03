package myproject;
import java.util.*;
public class WithMethod {
	private static void takeUserInput() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the First Number");
			int a = sc.nextInt();
			System.out.println("Enter the Second Number");
			int b = sc.nextInt();
			divide(a, b);
			
			
		}finally {
			System.out.println("In final Block");
			if(sc!=null)
				sc.close();
		}
		
	}
	private static void divide(int a, int b) {
		int result = a/b;
		System.out.println("After Division: "+result);
	}

	public static void main(String[] args) {
		try {
			takeUserInput();
		}catch(ArithmeticException e) {
			System.out.println("Error occured resolve it-"+e.getMessage());
		}
		
	
		// TODO Auto-generated method stub

	}

}
