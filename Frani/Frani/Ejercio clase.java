// // Pide a usuario que introduzca su nombre y edad, y luego lo imprima en pantalla.
// // Y muestre un mensaje personalizado.

// import  java.util.Scanner;

// class Ejercicio3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Introduce tu nombre: ");
//         String nombre = scanner.nextLine();

//         System.out.println("Introduce tu apellido: ");
//         String apellido = scanner.nextLine();

//         System.out.println("Introduce tu edad: ");
//         int edad = scanner.nextInt();

//         System.out.println("Hola " + nombre + " apellido" + ", tienes " + edad + "años.");

//         scanner.close();
//     }
// }


// Pide al usuaio un numero entero y muestre su tabla de multipiclar del 1 al 10

import java.util.Scanner;

class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero que veas en la tabla de multiplicador: ");
        int tabla = scanner.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.println(tabla + " x " + i + " * " + (tabla * 1));

        }
        scanner.close();
    }
}



// Pide al usuario que introduzca una nota numerico de 0 al 10 (puede llevar decimales) y muestresu su califacion
// segun la escala estandar. 

import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



}
