package oops_practical;

import java.util.Scanner;

public class Incdec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = input.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = input.nextInt();

        int R1, R2;

        System.out.println("Original value of a: " + a);

        R1 = ++a;
        System.out.println("After increment (++a): " + R1);

        System.out.println("Original value of b: " + b);

        R2 = --b;
        System.out.println("After decrement (--b): " + R2);

        input.close();
    }
}
