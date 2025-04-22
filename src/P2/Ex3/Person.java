package P2.Ex3;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return "Person{" +
                "First name='" + firstName + '\'' +
                ", Last name='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
