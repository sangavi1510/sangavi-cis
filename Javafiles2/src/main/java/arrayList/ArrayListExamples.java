package arrayList;
import java.util.ArrayList;

public class ArrayListExamples {



    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Traverse using a traditional for loop
        System.out.println("Traversing using a traditional for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String fruit = stringList.get(i);
            System.out.println(fruit);
        }

        // Traverse using an enhanced for loop (for-each loop)
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}