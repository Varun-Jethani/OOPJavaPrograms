package unit_1;

import java.util.Scanner;

public class Prac03 {
    public static int factorial (int num){
        int  i = 1, fact =1;
        while (i<=num)
            fact *= i++;

        return fact;
    }

    public static void fibonacci (int num){
        int fib1 = 0, fib2 =1, fib;
        System.out.print("Fibonacci Series: "+fib1+", "+fib2);
        for (int i = 0;i<num-2;i++){
            fib = fib1+fib2;
            fib1= fib2;
            fib2 = fib;
            System.out.print(", "+fib);
        }
    }

    public static int sumDig (int num){
        int sum=0;

        while (num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number for Factorial: ");
        int num1 = scan.nextInt();
        int fact = factorial(num1);
        System.out.println("Factorial of "+num1+" is "+fact);

        System.out.print("Enter number for Fibonacci: ");
        int num2 = scan.nextInt();
        fibonacci(num2);

        System.out.print("\nEnter number for Sum of Digit: ");
        int num3 = scan.nextInt();
        int sum = sumDig(num3);
        System.out.println("Sum of Digit is :"+sum);

        scan.close();

    }
}
