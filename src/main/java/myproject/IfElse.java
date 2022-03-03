//Argument Passing

package myproject;


public class IfElse {

	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		
		int max=(a>b)?a:b;
		System.out.println("Largest number: "+max);
		
		if(max>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}
}