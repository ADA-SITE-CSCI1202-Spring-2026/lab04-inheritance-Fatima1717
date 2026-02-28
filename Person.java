public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    // constructor with parameters
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public boolean equals(Person p) {
        if (p == null) return false;
        if (this == p) return true;
        return (firstName == null ? p.firstName == null : firstName.equals(p.firstName))
                && (lastName == null ? p.lastName == null : lastName.equals(p.lastName))
                && (gender == null ? p.gender == null : gender.equals(p.gender));
    }
}
