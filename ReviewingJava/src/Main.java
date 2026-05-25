//For java install, begin with installing JDK, then Java and Extension Pack for Java extensions in vscode.
import java.awt.Point;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
       
        //Add
        int result = 10 + 3; //-, /, *
        System.out.println(result);

        //For division, need to cast:
        double result_new = (double)10 / (double)3;
        System.out.println(result_new);

        //Can increment and decrement with result++ or result-- or result = result + # and so on or x+=#
        //result++ vs ++result:
        //first one increments first, then returns new value
        //second one returns old value first, then increments


        //Casting:

        //Implicit casting:
        //byte > short > int > long > float > double, meaning byte can be converted to short, etc
        double s = 1.1;
        double p = s + 2; //an integer is less precise than a double, so automatic casts happen; implicit casting happens when no data is lost in transfer
        System.out.println(p);

        //Explicit casting:
        double m = 1.1;
        int j = (int)m + 2;
        System.out.println(j);

        //Want to cast return type before returning; only works for compatible types: for example, string cannot be converted to number
        //However, we can use built in wrapper classes to help with this difference in types
        String x_ = "1";
        int y_ = Integer.parseInt(x_) + 2;
        System.out.println(y_);


        //Math class:
        //Not all of them!
        int result_ = Math.round(1.1F);
        //int result_ = (int)Math.ceil(1.1F); -->2
        //int result_ = (int)Math.floor(1.1F); -->1
        //int result_ =  Math.max(1, 2);
        //int result_ =  Math.min(1, 2);
        //double result_ =  Math.random(); --> returns a floating point number between 0.0 and 1.0 (inclusive, exclusive)
        //Want a number from 0 to 100: //int result_ =  Math.random() * 100;
        //int result_ =  (int)Math.round(Math.random() * 100);
        System.out.println(result_);


        //Formatting Numbers:
        //NumberFormat currency = NumberFormat.getCurrencyInstance(); //factory method, each NumberFormat call returns a NumberFormat object
        //String money_result = currency.format(1234567.891);
        //System.out.println(money_result);

        //NumberFormat percent = NumberFormat.getPercentInstance(); //factory method
        //String money_result = percent.format(0.1);
        //System.out.println(money_result);

        //This is the same as the last one, except we can modify the first line unless we have many, especially different, calls to it
        String money_result = NumberFormat.getPercentInstance().format(0.1); //method chaining
        System.out.println(money_result);
        

        //Reading Input:
        //Scanner class helps with reading inputs
        Scanner scanner = new Scanner(System.in); //inside parantheses is where we work with scanner
        System.out.print("Name: "); //print avoids new line issue
        String name_scan = scanner.nextLine().trim(); //depending on type, may need diff next### call; nextLine allows for reading as many spaced out words before pressing enter
        System.out.println("You are " + name_scan); //this is a case of implicit casting, IDE converts byte to a string


        //Comparison Operators and Logical Operators:
        //Options: ==, !=, <, >, <=, >=, &&, ||, !name (reversing bool)
        //Possible booleans: true, false

        int temp = 22;
        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;



        //If Statements:
        int new_temp = 32;
        if (temp > 30) {
            System.out.println("It is a hot day.");
            System.out.println("Drink water.");
        } else if (new_temp > 20 && temp <= 30) {
            System.out.println("It is a beautiful day.");
        } else {
            System.out.println("It is a cold day.");
        }
            

        //Simplifying If Statements:
        int income = 120_000;
        boolean hasHighIncomeNew = (income > 100_000); //dont have to wrap in parentheses


        //The Ternary Operator:
        String className = income > 100_000 ? "First" : "Economy";


        //Switch Statements:
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You are an admin.");
                break;

            case "user":
                System.out.println("You are a user.");
                break;

            default:
                System.out.println("You are a guest."); //once we get here, we automatically break
        }



        //For loops:
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }


        //While loops:
        int je = 0;

        while (je > 0) {
            System.out.println("Hello World " + je);
            je--;
        }

        //Do..While Loops:
        //Similar to while loop, but it gets executed at least once; rarely used
        String input_new = "";

        do { 
            System.out.println("Input: ");
            input_new = scanner.next().toLowerCase();
            System.out.println(input_new);
            
        } while (!input_new.equals("quit"));


        //Break and Continue:
        Scanner scanner_2 = new Scanner(System.in);
        String input_2 = "";

        while (true) { 
            System.out.println("Input: ");
            input_2 = scanner_2.next().toLowerCase();

            if (input_2.equals("pass")) {
                continue; //java keeps going
            }
            if (input_2.equals("quit")) {
                break; //java ignores everything else after
            }
            System.out.println(input_2);
        }


        //For-Each Loop:
        String[] fruits = {"Apple", "Banana", "Orange"};

        //For loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        //For-each loop; downside: it is forward only, so we cannot iterate backwards
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        //Control Flow Summary:




        //Clean Coding:











    }
}