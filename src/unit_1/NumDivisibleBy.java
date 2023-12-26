package unit_1;

public class NumDivisibleBy {
    public static void main(String[] args) {
        numIsDivisibleBy(5);
    }

    static void numIsDivisibleBy(int num){
        System.out.print("Numbers divisible by " +num+ " are :");
        for (int x = 1 ;x<=100;x++){
            if(x%num ==0 ) System.out.print(" "+x);
        }
    }
}
