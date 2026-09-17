// Pide a usuario que introduzca su nombre y edad, y luego lo imprima en pantalla.
// Y muestre un mensaje personalizado.

import  java.util.Scanner;

class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Introduce tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + apellido ", tienes " + edad + "años.");

        scanner.close();
    }
}