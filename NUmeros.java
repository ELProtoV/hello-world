package restarecursvia;
import java.util.Scanner;

public class NUmeros {
    private double num1;
    private double num2;
    
	public NUmeros(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double suma() {
        return num1 + num2;
    }

    public double resta() {
        return num1 - num2;
    }

    public double multiplicacion() {
        return num1 * num2;
    }

    public String division() {
        // Manejo de división por cero
        if (num2 != 0) {
            return String.valueOf(num1 / num2);
        } else {
            return "Error: División por cero";
        }
    }

    public String modulo() {
        // Manejo de división por cero
        if (num2 != 0) {
            return String.valueOf(num1 % num2);
        } else {
            return "Error: División por cero";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        NUmeros numeros = new NUmeros(num1, num2);

        // Imprimir valores de los atributos
        System.out.println("X = " + numeros.getNum1());
        System.out.println("Y = " + numeros.getNum2());

        // Realizar operaciones y mostrar resultados
        System.out.println("Suma: " + numeros.suma());
        System.out.println("Resta: " + numeros.resta());
        System.out.println("Multiplicación: " + numeros.multiplicacion());
        System.out.println("División: " + numeros.division());
        System.out.println("Módulo: " + numeros.modulo());

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
	
}
