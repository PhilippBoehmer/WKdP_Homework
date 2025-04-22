package P2.Ex3;

import java.util.ArrayList;

public class Student extends Person {

    private int matNumber;
    private int semester;

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    private ArrayList<String> courses = new ArrayList<>();

    public int getMatNumber() {
        return matNumber;
    }

    public void setMatNumber(int matNumber) {
        this.matNumber = matNumber;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Student(String firstName, String lastName, int age, int matNumber, int semester) {
        super(firstName, lastName, age);
        this.matNumber = matNumber;
        this.semester = semester;
    }

    @Override
    public String getInfo() {
        return "Student{" +
                "First name='" + getFirstName() + '\'' +
                ", Last name='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", MatNumber='" + matNumber + '\'' +
                ", Semester='" + semester + '\'' +
                '}';
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public String printCourseList() {
        StringBuilder courseList = new StringBuilder();
        for (String course : courses) {
            courseList.append(course).append("\n");
        }
        return courseList.toString();
    }
}
