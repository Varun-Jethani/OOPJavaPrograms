package unit_1;

import java.util.Scanner;

public class Car {
    private String name;
    private int Number;

    public void setData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Name of the Car: ");
        this.name= scan.next();
        System.out.println("Enter the number of the Car");
        this.Number =scan.nextInt();
    }

    public void displayData(){
        System.out.println("Name of the Car is "+this.name);
        System.out.println("Number of the Car is "+this.Number);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setData();
        car.displayData();
    }
}
