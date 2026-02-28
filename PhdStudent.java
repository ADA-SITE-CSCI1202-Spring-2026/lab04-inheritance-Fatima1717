import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhdStudent extends Student {
    private String department;
    private List<String> courses;

    public PhdStudent() {
        super();
        this.department = "";
        this.courses = new ArrayList<>();
    }

    public PhdStudent(String firstName, String lastName, String gender,
                      String studentId, String department, List<String> courses) {
        super(firstName, lastName, gender, studentId);
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
        return "PhdStudent{" + super.toString() +
                ", department='" + department + '\'' +
                ", courses=" + courses +
                '}';
    }

    public boolean equals(PhdStudent pStud) {
        if (pStud == null) return false;
        if (this == pStud) return true;
        if (!super.equals(pStud)) return false;
        return Objects.equals(department, pStud.department) &&
                Objects.equals(courses, pStud.courses);
    }
}