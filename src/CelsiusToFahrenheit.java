import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario los grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convertir a Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Mostrar el resultado
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        
        scanner.close();
    }
}
