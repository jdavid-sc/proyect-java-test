public class Operaciones {
    public int sumarNumeros(int num1, int num2) {
        return num1 + num2;
    }
    int resultadoSuma = sumarNumeros(4,6);
   
    public static void main(String[] args) {
        Operaciones op = new Operaciones(); // crear un objeto de la clase
        int resultadoSuma = op.sumarNumeros(4, 6); // llamar al método
        System.out.println("Resultado de la suma: " + resultadoSuma);
    }
}
