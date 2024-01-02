package unit_1;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = scan.nextLine();
        System.out.print("Enter Your Age: ");
        age = scan.nextInt();
        System.out.println("\nHello "+name+", Age "+age);




    }

}
