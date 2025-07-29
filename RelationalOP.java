//JAVA program on Relational Operators

package oops_practical;

import java.util.Scanner;

public class RelationalOP {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter 1st integer (a)");
		int a = input.nextInt();
		
		System.out.print("enter 2nd integer (b)");
		int b = input.nextInt();
		
		System.out.println("a is "+a+"and b is "+b);
		System.out.println("is a==b?" + (a==b));
		System.out.println("is a!=b? " + (a!=b));
		System.out.println("is a>b? " + (a>b));
		System.out.println("is a<b? " + (a<b));
		System.out.println("is a>=b?" + (a>=b));
		System.out.println("is a<=b?" + (a<=b));
		
		input.close();
	}
}
