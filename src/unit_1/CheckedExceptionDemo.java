package unit_1;

public class CheckedExceptionDemo {

    static void accessData(String key) throws IllegalAccessException{
        if(key.equals("admin")) {
            System.out.println("Access granted");
        }
        else{
            throw new IllegalAccessException();
        }

    }
    public static void main(String[] args) {
        try {
            accessData("admin");
            accessData("user");
        } catch (IllegalAccessException e) {
            System.out.println("Access denied");
        }

    }
}
