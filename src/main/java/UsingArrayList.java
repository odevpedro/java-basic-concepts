import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {
    public static void main(String[] args) {
        // Less productive way
        String lesson1 = "HTML Course";
        String lesson2 = "CSS Course";
        String lesson3 = "JS Course";

        String[] list = new String[10];
        list[0] = lesson1;
        list[1] = lesson2;
        list[1] = lesson3;

        System.out.println(list[0]);

        // Manipulating data in memory with ArrayList
        ArrayList<String> lessonList = new ArrayList<String>();
        lessonList.add(lesson1);
        lessonList.add(lesson2);
        lessonList.add(lesson3);
        System.out.println(lessonList);

        // ForEach in java 8
        for (String lesson : lessonList) {
            System.out.println("Lesson: " + lesson);
        }

        // Common ForEach
        for (int i = 0; i < lessonList.size(); i++) {
            System.out.println("Lesson: " + lessonList.get(i));
        }

        // Using forEach method of ArrayList
        lessonList.forEach(item -> {
            System.out.println("Iterating: " + item);
        });

        // Accessing a particular position in the array
        String firstLesson = lessonList.get(0);
        System.out.println("The first lesson is: " + firstLesson);

        // Sorting collections lexicographically
        lessonList.add("Increasing our knowledge");
        Collections.sort(lessonList);
        System.out.println(lessonList);

    }

}

