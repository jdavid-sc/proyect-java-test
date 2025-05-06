import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
        scanner.close();
        System.out.println("Hello, " + name + "! segundo commit");
        System.out.println("Se modifico el programa Java");


    }
}
