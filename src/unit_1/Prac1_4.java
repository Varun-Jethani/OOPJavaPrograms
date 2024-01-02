package unit_1;

import java.util.Scanner;

public class Prac1_4 {
    int a,b,c;
    public static void main(String[] args) {
        Prac1_4 o1 = new Prac1_4();


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        o1.a= scan.nextInt();
        System.out.print("Enter value of B: ");
        o1.b= scan.nextInt();

        o1.c= o1.a + o1.b;
        System.out.println("\n" + o1.a + " + " + o1.b + " = " + o1.c);
    }
}
