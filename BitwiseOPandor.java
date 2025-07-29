//JAVA program on Bitwise AND & OR
package oops_practical;

import java.util.Scanner;

public class BitwiseOP {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st number :");
		int a = input.nextInt();
		
		System.out.print("Enter 2nd number :");
		int b = input.nextInt();
		
		int ANDresult = a&b;
		System.out.println("a&b = "+ ANDresult);
		
		int ORresult = a|b;
		System.out.println("a|b = "+ ORresult);
		
		input.close();
	}
}
