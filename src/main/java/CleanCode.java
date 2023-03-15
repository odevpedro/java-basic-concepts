import java.text.NumberFormat;
import java.util.Scanner;

public class CleanCode {
    public static void main(String[] args) {
        int principal = getInput("Principal: ", 1000, 1_000_000);
        float annualInterest = getInput("Annual Interest Rate: ", 1, 30);
        byte years = (byte) getInput("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static int getInput(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print(prompt);
            input = scanner.nextInt();
            if (input >= min && input <= max)
                return input;
            System.out.println("Enter a value between " + min + " and " + max);
        }
    }

    public static float getInput(String prompt, float min, float max) {
        Scanner scanner = new Scanner(System.in);
        float input;

        while (true) {
            System.out.print(prompt);
            input = scanner.nextFloat();
            if (input >= min && input <= max)
                return input;
            System.out.println("Enter a value between " + min + " and " + max);
        }
    }

    public static double calculateMortgage(int principal, float annualInterest, byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
