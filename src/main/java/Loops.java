public class Loops {
    public static void main(String[] args) {

        String fruit = "banana";

        switch (fruit) {
            case "apple":
                System.out.println("It's an apple");
                break;
            case "banana":
                System.out.println("It's a banana");
                break;
            case "orange":
                System.out.println("It's an orange");
                break;
            default:
                System.out.println("Unknown fruit");
                break;
        }

        // Examples of for loops
        for (int i = 1; i <= 5; i++) {
            System.out.println("The value of i is: " + i);
        }

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The value of element " + i + " is: " + numbers[i]);
        }

        // Examples of while loops
        int count = 1;

        while (count <= 5) {
            System.out.println("The value of count is: " + count);
            count++;
        }

        int[] numbers2 = {1, 2, 3, 4, 5};
        int j = 0;

        while (j < numbers2.length) {
            System.out.println("The value of element " + j + " is: " + numbers2[j]);
            j++;
        }
    }
}
