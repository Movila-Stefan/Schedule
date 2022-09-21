import java.time.LocalDate;

public class Student extends Person {

    private boolean hasPreviousJavaKnolige;


    public Student() {
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    public boolean isHasPreviousJavaKnolige() {
        return hasPreviousJavaKnolige;
    }

    public void setHasPreviousJavaKnolige(boolean hasPreviousJavaKnolige) {
        this.hasPreviousJavaKnolige = hasPreviousJavaKnolige;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hasPreviousJavaKnolige=" + hasPreviousJavaKnolige +
                '}';
    }
}
