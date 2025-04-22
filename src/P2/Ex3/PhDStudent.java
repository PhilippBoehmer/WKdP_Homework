package P2.Ex3;

public class PhDStudent extends Student{
    private String dissTopic;

    public PhDStudent(String firstName, String lastName, int age, int matNumber, int semester, String dissTopic) {
        super(firstName, lastName, age, matNumber, semester);
        this.dissTopic = dissTopic;
    }

    public String getDissTopic() {
        return dissTopic;
    }

    public void setDissTopic(String dissTopic) {
        this.dissTopic = dissTopic;
    }

    @Override
    public String getInfo() {
        return "PhDStudent{" +
                "First name='" + getFirstName() + '\'' +
                ", Last name='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", MatNumber='" + getMatNumber() + '\'' +
                ", Semester='" + getSemester() + '\'' +
                ", Thesis Topic='" + dissTopic + '\'' +
                '}';
    }
}
