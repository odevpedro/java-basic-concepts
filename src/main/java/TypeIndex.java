public class TypeIndex {
    /*In Java, you should use primitives for basic data types such as integers or booleans, and reference types for complex data structures like objects.*/
    public static void main(String[] args) {
        byte a = 127; // byte data type
        short b = 32000; // short data type
        int c = 2000000000; // integer data type
        long d = 9223372036854775807L; // long data type
        float e = 3.141592f; // floating-point data type
        double f = 3.14159265358979323846; // double floating-point data type
        boolean g = false; //boolean data type
        char h = 'a'; // character data type

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("boolean: " + g);
        System.out.println("char: " + h);


        String message = " Hell o";
        System.out.println(message.endsWith("!!"));//I ask if my message ends with the indicated string

        System.out.println(message.startsWith("!!"));//I ask if my message ends with the indicated string
        System.out.println(message.indexOf("h")); //I ask the position of the indicated letter
        System.out.println(message.replace( "l","h")); //replace one letter with another
        System.out.println(message); //Print the original result, because String in java are imutable
        System.out.println(message.toLowerCase()); //...
        System.out.println(message.toUpperCase()); //...
        System.out.println(message.trim()); //  remove leading and trailing whitespace from a String
        System.out.println(message);


        //Comparing two Strings
        String myString1 = "Hello, world!";
        String myString2 = "Hello, world!";
        boolean isEqual = myString1.equals(myString2);


        //Scape Sequence


        String myString = "Hello\nWorld";
        System.out.println(myString); //to "break" the output lines

        String string = "Name:\tJohn"; //tab character
        System.out.println(myString);

        String quote = "She said, \"Hello!\"";
        System.out.println(quote); // represents a double quote character

        String backslash = "C:\\Program Files\\Java"; //represents a backslash character
        System.out.println(backslash);







    }


}
