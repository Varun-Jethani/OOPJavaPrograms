package unit_1;


import java.util.Scanner;

public class Prac4 {
        int student_id;
        String Student_name;
        int m1,m2,m3;

        public void setData(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Student Id: ");
            this.student_id = scan.nextInt();
            System.out.print("Enter Student Name: ");
            this.Student_name = scan.next();
            System.out.print("Enter Subject 1 Marks: ");
            this.m1 = scan.nextInt();
            System.out.print("Enter Subject 2 Marks: ");
            this.m2 = scan.nextInt();
            System.out.print("Enter Subject 3 Marks: ");
            this.m3 = scan.nextInt();

        }
        public void displayData(){
            System.out.println("Student Name: "+this.Student_name);
            System.out.println("Student Id: "+this.student_id);
            System.out.println("Marks in Subject 1 : "+this.m1);
            System.out.println("Marks in Subject 2 : "+this.m2);
            System.out.println("Marks in Subject 3 : "+this.m3);

        }

        public void average(){
            int avg=(m1+m2+m3)/3;
            System.out.println("Student Average is: "+avg);
        }

    public static void main(String[] args) {
        Prac4 Student = new Prac4();
        Student.setData();
        Student.displayData();
        Student.average();




    }
}

