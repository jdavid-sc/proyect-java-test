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


        int numero1 = 1;
        int numero2 = 2;
        int total = numero1 + numero2;

        System.err.println("el total:"  + total);

    }
}
