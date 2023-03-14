public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Example 1: Basic usage
        int min = (a < b) ? a : b;
        System.out.println("Minimum value is: " + min);

        // Example 2: Nested ternary operators
        int max = (a > b) ? a : ((a == b) ? 0 : b);
        System.out.println("Maximum value is: " + max);

        // Example 3: Assigning result to a variable
        String result = (a > b) ? "a is greater than b" : "b is greater than or equal to a";
        System.out.println(result);

        // Example 4: Ternary operator inside a println statement
        System.out.println("The maximum value is: " + ((a > b) ? a : b));
    }


}
