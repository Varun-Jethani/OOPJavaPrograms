package unit_1;

public class ForNiF {
    public static void main(String args[]){
    	System.out.println("Even Numbers are: ");
        for( int x = 1 ; x <= 100 ; x = x + 1 ){
            if (x%2 == 0) System.out.print(" "+x);
        }
        System.out.println("\nOdd Numbers are:");
        for (int y = 1; y<=100; y++){
            if (y%2 != 0) System.out.print(" "+y);

        }

        
    }
}
