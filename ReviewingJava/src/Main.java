//For java install, begin with installing JDK, then Java and Extension Pack for Java extensions in vscode.
import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int age = 30; 
        int temperature = 20;
        age = 35;

        int myAge = 30;
        int herAge = 30;

        //In java, there are lots of prim types:
        //byte, short, int, long, float, double, char, boolean

        //can use __ to separate numbers
        long viewsCount = 3_123_456_789L;
        double price = 10.99;
        float price2 = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        //prim type example
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        //ref type example
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2); //2 carries over unlike prim type

        //ref types; ref types dont have to be independent
        Date now = new Date(); //object or an instance of the Date class; 
        now.getTime(); //accessing the method of the Date class

        System.out.println("Hello, world! I am " + age + " years old.");


        //Strings: ref types; 2 ways to make them
        String message = "Hello, world!";
        String message2 = new String("Hello, world!");

        //concat:
        String combined = message + " " + message2;
        System.out.println(combined);

        System.out.println(message.endsWith(combined));
        System.out.println(message.startsWith(combined));
        System.out.println(message.length());
        System.out.println(message.indexOf("H")); //returns index of first occurrence of "H"
        System.out.println(message.replace("!", "*")); //returns a new string with all occurrences of "!" replaced with "*"
        //Strings are immutable in Java
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); //gets rid of leading and trailing whitespace

        //Escape sequences in Java:
        // \n - newline
        // \t - tab
        // \r - carriage return
        // \" - double quote
        // \' - single quote
        // \\ - backslash
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");
        System.out.println("Hello\rWorld");
        System.out.println("Hello\"World\"");
        System.out.println("Hello\'World\'");
        System.out.println("Hello\\World");


        //Arrays: in Java, arrays are fixed-size collections of elements of the same type
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //numbers[10] = 3; // This will cause an ArrayIndexOutOfBoundsException

        System.out.println(numbers); //Returns address

        System.out.println(Arrays.toString(numbers)); // returns [1, 2, 3, 4, 5], 0 occurs if there is no initialization

        //New way to initalize arrays:
        int[] new_numbers = {2, 1, 3, 4, 5};
        System.out.println(new_numbers.length); // returns 5, can only manipulate these with built in methods, otherwise you cannot manipulate them
        Arrays.sort(new_numbers); 
        System.out.println(Arrays.toString((new_numbers))); //returns sorted list



        //Mutli-dimensional arrays:
        int[][] mat_numbers = new int[2][3]; //2 rows, 3 cols
        mat_numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(mat_numbers));//this method is for multi-dimensional arrays

        int[][] new_mat_nums = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(new_mat_nums)); //same thing, slightly diff writing


        //Constants:
        final float PI = 3.14F; //with final, we cannot change this value later on

        //Arithmetic expressions:
        
    }
}