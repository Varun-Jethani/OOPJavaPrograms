package unit_1;

public class StringOperations {

    public static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        print("Length of the string is "+str.length());
        print("Character at index 4 is "+str.charAt(4));
        print("Substring from index 2 to 5 is "+str.substring(2,5));
        print("Index of 'o' is "+str.indexOf('o'));
        print("Index of 'o' after 5 is "+str.indexOf('o',5));
        print("Index of 'o' from last is "+str.lastIndexOf('o'));
        print("Index of 'o' from last before 5 is "+str.lastIndexOf('o',5));
        print("Concatenation with 'Java' is "+str.concat(" Java"));
        print("Concatenation with 'Java' is "+str+" Java");
        print("Uppercase is "+str.toUpperCase());
        print("Lowercase is "+str.toLowerCase());
        print("Trimmed string is "+str.trim());
        print("Replaced 'o' with 'a' is "+str.replace('o','a'));
        print("Replaced 'World' with 'Java' is "+str.replace("World","Java"));
        for (String s : str.split(" ")) {
            print(s);
        }
        print("Checking if string starts with 'Hello' is "+str.startsWith("Hello"));
        print("Checking if string ends with 'World' is "+str.endsWith("World"));
        print("Checking if string contains 'World' is "+str.contains("World"));
        print("Checking if string is empty is "+str.isEmpty());
        print("Checking if string is equal to 'Hello World' is "+str.equals("Hello World"));
        print("Checking if string is equal to 'Hello World' ignoring case is "+str.equalsIgnoreCase("hello world"));


    }

}
