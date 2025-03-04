

public class Student {
    // Instance Fields
    String studentName;
    String studentId = "000000000";
    int studentAge;
    char studentGender;
    String studentEmail;

    // Constructor
    public Student() {
        System.out.println("Estudiante creado sin datos!");
    }

    public Student(String name, String id, int age, char gender, String email) {
        this.studentName = name;
        this.studentId = id;
        this.studentAge = age;
        this.studentGender = gender;
        this.studentEmail = email;
        System.out.println("Estudiante \"" + this.studentName + "\" creado!");
    }

    public void tellInfo() {
        System.out.println("My name is \"" + studentName + "\" and my ID is " + studentId + ".");
        System.out.println("I'm " + studentAge + " years old and my gender is " + studentGender + ".");
    }

    public void repeatAfter(String message) {
        System.out.println("The message is: " + message);
    }

    public void haveBirthday() {
        studentAge++;
    }
}