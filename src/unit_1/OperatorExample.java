package unit_1;

public class OperatorExample {
    public static void main(String args[]){

        int x=10;
        //Unary Operator
        System.out.println(x++);//10 (11)
        System.out.println(x);
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(x);
        System.out.println(--x);//10

        //Unary 2
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21

        //~ ! unary
        int z=6;
        int y=-5;
        boolean c=true;
        boolean d=false;
        System.out.println(~z);//-7 (minus of total positive value which starts from 0)
        System.out.println(~y);//4 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true

        //arithmetic
        int p=11;
        int q=3;
        System.out.println(p+q);//14
        System.out.println(p-q);//8
        System.out.println(p*q);//33
        System.out.println(p/q);//3
        System.out.println(p%q);//2

        //art op expression
        System.out.println(10*10/5+3-1*4/2);

        //left shift
        System.out.println(20<<2);//10*2^2=10*4=40
        System.out.println(50<<3);//10*2^3=10*8=80
        System.out.println(10<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

        //right shift
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2

        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);

        //logical&& vs bitwise&
        int e=10;
        int f = 5;
        int g = 20;
        System.out.println(e<f&&e++<g);//false && true = false
        System.out.println(e);//10 because second condition is not checked
        System.out.println(e<f&e++<g);//false && true = false
        System.out.println(e);//11 because second condition is checked

        //logical || vs bitwise |
        e=10;
        System.out.println(e>f||e<f);//true || true = true
        System.out.println(e>f|e<g);//true | true = true
        // || vs |
        System.out.println(e>f||e++<f);//true || true = true
        System.out.println(e);//10 because second condition is not checked
        System.out.println(e>f|e++<g);//true | true = true
        System.out.println(e);//11 because second condition is checked



    }
}
