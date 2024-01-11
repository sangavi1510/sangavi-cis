public class Student{
    String name;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Sangavi";
        System.out.println(obj.getName());
    }
}