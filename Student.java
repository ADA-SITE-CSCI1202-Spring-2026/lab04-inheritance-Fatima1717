import java.util.Objects;

public class Student extends Person {
    private String studentId;

    public Student() {
        super("", "", "");
        this.studentId = "";
    }

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", studentId='" + studentId + '\'' +
                '}';
    }

    public boolean equals(Student s) {
        if (s == null) return false;
        if (this == s) return true;
        if (!super.equals(s)) return false;
        return Objects.equals(studentId, s.studentId);
    }
}