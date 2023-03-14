public class IfStatements {
    public static void main(String[] args) {
        int age = 18;
        boolean isStudent = true;
        double grade = 7.5;

        if (age >= 18 && isStudent) {
            System.out.println("You are eligible for a student credit card.");
        } else {
            System.out.println("You are not eligible for a student credit card.");
        }

        if (grade >= 7) {
            System.out.println("You have passed the exam!");
        } else if (grade >= 5 && grade < 7) {
            System.out.println("You have failed the exam, but you can take a resit.");
        } else {
            System.out.println("You have failed the exam.");
        }

        boolean isRaining = true;
        boolean hasUmbrella = false;
        if (isRaining && !hasUmbrella) {
            System.out.println("You should buy an umbrella.");
        } else if (isRaining && hasUmbrella) {
            System.out.println("You don't need to buy an umbrella.");
        } else {
            System.out.println("It's not raining, you don't need an umbrella.");
        }
    }
}
