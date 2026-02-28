public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Fatima", "Aliyeva", "Female");
        Teacher t1 = new Teacher("John", "Smith", "Male",
                                 "Computer Science", "OOP");
        Student s1 = new Student("Aysel", "Mammadova", "Female",
                                 "S123");
        PhdStudent phd1 = new PhdStudent("Elvin", "Hasanov", "Male",
                                         "P456", "AI", "Machine Learning");

        System.out.println(p1);
        System.out.println(t1);
        System.out.println(s1);
        System.out.println(phd1);

        // Testing equals
        Person p2 = new Person("Fatima", "Aliyeva", "Female");
        System.out.println("p1 equals p2? " + p1.equals(p2));
    }
}