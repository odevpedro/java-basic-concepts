public class ComparisonOperators {
    public static void main(String[] args) {

        // Equal to
        int num1 = 5;
        int num2 = 5;
        boolean equal = (num1 == num2);
        System.out.println("num1 is equal to num2: " + equal);

        // Not equal to
        int age1 = 25;
        int age2 = 30;
        boolean notEqual = (age1 != age2);
        System.out.println("age1 is not equal to age2: " + notEqual);

        // Greater than
        double price1 = 25.99;
        double price2 = 15.99;
        boolean greaterThan = (price1 > price2);
        System.out.println("price1 is greater than price2: " + greaterThan);

        // Less than
        float weight1 = 40.5f;
        float weight2 = 45.2f;
        boolean lessThan = (weight1 < weight2);
        System.out.println("weight1 is less than weight2: " + lessThan);

        // Greater than or equal to
        int score1 = 80;
        int score2 = 90;
        boolean greaterThanOrEqual = (score1 >= score2);
        System.out.println("score1 is greater than or equal to score2: " + greaterThanOrEqual);

        // Less than or equal to
        int num3 = 10;
        int num4 = 15;
        boolean lessThanOrEqual = (num3 <= num4);
        System.out.println("num3 is less than or equal to num4: " + lessThanOrEqual);
    }
}
