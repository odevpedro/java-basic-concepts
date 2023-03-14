public class LogicalOperators {
        public static void main(String[] args) {

            // Comparison Operators
            int age = 25;
            int anotherAge = 35;

            System.out.println(age > anotherAge);  // false
            System.out.println(age < anotherAge);  // true
            System.out.println(age >= anotherAge); // false
            System.out.println(age <= anotherAge); // true
            System.out.println(age == anotherAge); // false
            System.out.println(age != anotherAge); // true

            // Logical Operators
            boolean isAdult = true;
            boolean hasLicense = false;

            System.out.println(isAdult && hasLicense); // false
            System.out.println(isAdult || hasLicense); // true
            System.out.println(!isAdult);             // false

            // Combined Comparison and Logical Operators
            int x = 10;
            int y = 20;
            int z = 30;

            System.out.println((x < y) && (y < z));   // true
            System.out.println((x < y) || (y > z));   // true
            System.out.println((x >= y) || !(y == z)); // false
        }
}
