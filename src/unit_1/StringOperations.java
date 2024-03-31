package unit_1;

public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Length of the string is "+str.length());
        System.out.println("Character at index 4 is "+str.charAt(4));
        System.out.println("Substring from index 2 to 5 is "+str.substring(2,5));
        System.out.println("Index of 'o' is "+str.indexOf('o'));
        System.out.println("Index of 'o' after 5 is "+str.indexOf('o',5));
        System.out.println("Index of 'o' from last is "+str.lastIndexOf('o'));
        System.out.println("Index of 'o' from last before 5 is "+str.lastIndexOf('o',5));
        System.out.println("Concatenation with 'Java' is "+str.concat(" Java"));
        System.out.println("Concatenation with 'Java' is "+str+" Java");
        System.out.println("Uppercase is "+str.toUpperCase());
        System.out.println("Lowercase is "+str.toLowerCase());
        System.out.println("Trimmed string is "+str.trim());
        System.out.println("Replaced 'o' with 'a' is "+str.replace('o','a'));
        System.out.println("Replaced 'World' with 'Java' is "+str.replace("World","Java"));
    }
}
