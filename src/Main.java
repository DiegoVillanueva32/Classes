public class Main {
    public static void main(String[] args) {
        Student diego = new Student("Diego", "000565383", 16, 'm');
        Student cristian = new Student();
        System.out.println(diego);
        System.out.println(cristian);
        System.out.println(diego.studentId);
        System.out.println(cristian.studentId);

    }
}