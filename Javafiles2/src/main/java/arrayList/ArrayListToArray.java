import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");


        String[] stringArray = new String[arrayList.size()];
        arrayList.toArray(stringArray);


        System.out.println("Elements of the array:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
