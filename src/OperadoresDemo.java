public class OperadoresDemo {
    public static void main(String[] args) {
        int numero = 10; // operador de asignación (=)
        
        System.out.println("Valor inicial: " + numero);
        
        // Operadores de asignación compuesta
        numero += 5; // equivalente a numero = numero + 5
        System.out.println("Después de += 5: " + numero);
        
        numero -= 3; // equivalente a numero = numero - 3
        System.out.println("Después de -= 3: " + numero);
        
        numero *= 2; // equivalente a numero = numero * 2
        System.out.println("Después de *= 2: " + numero);
        
        numero /= 4; // equivalente a numero = numero / 4
        System.out.println("Después de /= 4: " + numero);
        
        numero %= 3; // equivalente a numero = numero % 3
        System.out.println("Después de %= 3: " + numero);
        
        // Operadores de incremento y decremento
        numero++; // equivalente a numero = numero + 1
        System.out.println("Después de incremento (numero++): " + numero);
        
        numero--; // equivalente a numero = numero - 1
        System.out.println("Después de decremento (numero--): " + numero);
    }
}
