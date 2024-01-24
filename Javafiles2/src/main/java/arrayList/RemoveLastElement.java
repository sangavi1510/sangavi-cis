package arrayList;

import java.util.ArrayList;

public class RemoveLastElement {

    public static void removeLastElement(ArrayList<String> arrayList) {
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
            System.out.println("Last element removed.");
        } else {
            System.out.println("ArrayList is already empty.");
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");
        RemoveLastElement.removeLastElement(stringList);
    }
}
