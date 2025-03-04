import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de Student
        Student diego = new Student("Diego", "000565383", 16, 'm', "d.villanueva0504@gmail.com");
        Student cristian = new Student();


        System.out.println("Información de Diego:");
        diego.tellInfo();
        System.out.println("ID de Diego: " + diego.studentId);

        diego.repeatAfter("Pequeño demoniooo!!");


        System.out.print("¿Has cumplido años? (si/no): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            diego.haveBirthday();
            System.out.println("¡Feliz cumpleaños, " + diego.studentName + "! Ahora tienes " + diego.studentAge + " años.");
        } else {
            System.out.println("No se realizaron cambios en la edad.");
        }

        scanner.close();
    }
}