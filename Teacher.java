import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Teacher extends Person {
    private String department;
    private List<String> courses;

    public Teacher() {
        super("", "", "");
        this.department = "";
        this.courses = new ArrayList<>();
    }

    public Teacher(String firstName, String lastName, String gender,
                   String department, List<String> courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses == null ? new ArrayList<>() : new ArrayList<>(courses);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }

    public void setCourses(List<String> courses) {
        this.courses = courses == null ? new ArrayList<>() : new ArrayList<>(courses);
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", department='" + department + '\'' +
                ", courses=" + courses +
                '}';
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        if (this == t) return true;
        if (!super.equals(t)) return false;
        return Objects.equals(department, t.department) &&
                Objects.equals(courses, t.courses);
    }
}