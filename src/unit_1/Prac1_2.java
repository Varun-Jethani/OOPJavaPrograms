package unit_1;

import java.util.Scanner;

public class Prac1_2 {
    public static void main(String[] args) {
        int a,b,c;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        a= scan.nextInt();
        System.out.print("Enter value of B: ");
        b= scan.nextInt();

        c= a + b;
        System.out.println("\n" + a + " + " + b + " = " + c);
    }
}
