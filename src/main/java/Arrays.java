public class Arrays {
    public static void main(String[] args) {
        //arrays are used to store a list of itens

        String lesson1 = "HTML Course";
        String lesson2 = "CSS Course";
        String lesson3 = "JS Course";

        String[] myList = new String[10];
        myList[0] = lesson1;
        myList[1] = lesson2;
        myList[2] = lesson3;

        System.out.println(myList[0]);


        int[] numbers = {1,2,3,4,5,6};//another way to use array
        System.out.println(numbers.length);


        
        //In java arrays have limited sizes, once created we cannot change this size

    }



}
