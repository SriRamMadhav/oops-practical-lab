//JAVA program on Left and Right shifts
package oops_practical;

import java.util.Scanner;

public class LeftandRightShift {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a number (a):");
		int a = input.nextInt();
		
		int c = 0;
		
		c = a<<2;
		System.out.println("result of a<<2 = "+c);
		
		c=a>>2;
		System.out.println("result of a>>2 = "+c);
		
		c=a>>>2;
		System.out.println("result of a>>>2 = "+c);
		
		input.close();
	}
	

}
