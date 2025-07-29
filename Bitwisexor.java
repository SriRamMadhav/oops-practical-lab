//JAVA program on Bitwise XOR 
package oops_practical;

import java.util.Scanner;

public class Bitwisexor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter the first number or integer(a): ");
		int a = input.nextInt();
		
		System.out.print("enter the second number or integer(b)");
		int b = input.nextInt();
		
		int c = 0;
		
		c = a^b;
		System.out.println("Result of a^b = " +c);
		
		c = ~a;
		System.out.println("Result of ~a = " + c);
		
		input.close();
	}
	
}
