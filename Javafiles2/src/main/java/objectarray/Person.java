public class Person {
    private double height;
    private double weight;
    private String ssn;  // Social Security Number
    private String phoneNumber;


    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }



    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        return ssn.equals(person.ssn);
    }


    public static void main(String[] args) {
        Person person1 = new Person(175.0, 70.0, "123-45-6789", "555-1234");
        Person person2 = new Person(165.0, 60.0, "987-65-4321", "555-5678");
        Person person3 = new Person(180.0, 80.0, "123-45-6789", "555-9999");


        System.out.println("person1 equals person2: " + person1.equals(person2)); // false
        System.out.println("person1 equals person3: " + person1.equals(person3)); // true
    }


    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                ", ssn='" + ssn + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}