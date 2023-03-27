public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St");
        Student student = new Student("Jane Smith", "456 Oak St", "Computer Science", 2022, 5000.00);
        Staff staff = new Staff("Bob Johnson", "789 Elm St", "XYZ School", 50000.00);

        System.out.println(person.toString());
        System.out.println();

        System.out.println(student.toString());
        System.out.println();

        System.out.println(staff.toString());
    }
}