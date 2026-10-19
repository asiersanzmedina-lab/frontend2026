// // // // Pide a usuario que introduzca su nombre y edad, y luego lo imprima en pantalla.
// // // // Y muestre un mensaje personalizado.

// // // import  java.util.Scanner;

// // // class Ejercicio3 {
// // //     public static void main(String[] args) {
// // //         Scanner scanner = new Scanner(System.in);

// // //         System.out.print("Introduce tu nombre: ");
// // //         String nombre = scanner.nextLine();

// // //         System.out.println("Introduce tu apellido: ");
// // //         String apellido = scanner.nextLine();

// // //         System.out.println("Introduce tu edad: ");
// // //         int edad = scanner.nextInt();

// // //         System.out.println("Hola " + nombre + " apellido" + ", tienes " + edad + "años.");

// // //         scanner.close();
// // //     }
// // // }


// // // Pide al usuaio un numero entero y muestre su tabla de multipiclar del 1 al 10

// // // import java.util.Scanner;

// // // public class Ejercicio4 {
// // //     public static void main(String[] args) {
// // //         Scanner scanner = new Scanner(System.in);

// // //         System.out.println("Introduce un numero que veas en la tabla de multiplicador: ");
// // //         int tabla = scanner.nextInt();

// // //         for (int i = 1; i <=10; i++){
// // //             System.out.println(tabla + " x " + i + " * " + (tabla * 1));

// // //         }
// // //         scanner.close();
// // //     }
// // // }



// // // // Pide al usuario que introduzca una nota numerico de 0 al 10 (puede llevar decimales) y muestresu su califacion
// // // // segun la escala estandar. 

// // // import java.util.Scanner;

// // // public class Calificacion {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);



// // // }


// // // Crea un programa que pida al usuario un número secreto 
// // // El programa debe seguir pidiendo el numero 

// // // import java.util.Scanner;

// // // public class Ejercicio6 {
            
// // //     Public static void main(String[] args){
// // //         Scanner scanner = new Scaner(System.in);
// // //         int numeroSecreto = 69;
// // //         int intento;

// // //         System.out.println("Juego de adivinar el numero secreto");

// // //         do{
// // //             System.out.println("Introduce un numero: ");
// // //             intento = scanner.nextInt();

// // //             if (intento < numeroSecreto){
// // //                 System.out.println("El número secreto es mayor. Intenta de nuevo.");
// // //             } else if (intento < numeroSecreto){
// // //                 System.out.println("El número secreto es menor. Intenta de nuevo.");
// // //             } else {
// // //                 System.out.println("¡Felicidades! Has adivinado el número secreto.");
// // //             }
// // //         } while (intento != numeroSecreto);
            
// // //         scanner.close();
// // //         }

// // //     private static class Public {

// // //         public Public() {
// // //         }
// // //     }
// // //     }


// //     // Crea un arreglo con 5 numeros enteros predefinidos.
// //     //Calcula y muestra la suma total y media de todos sus elementos.

// //     public class Ejercicio8 {
        
// //         public static void main(String[] args) {
// //             int[] numeros = {5, 10, 15, 20, 25};
// //             int suma = 0;

// //             for (int i = 0; i < numeros.length; i++) {
// //                 suma += numeros[i];
// //             }

// //             double media = (double) suma / numeros.length;

// //             System.out.println("La suma total es: " + suma);
// //             System.out.println("La media es: " + media);
// //         }
        
// //     }

// Diseña una clase Bateria que comience al 100% y pierda un 15% por cada ciclo
// de uso mediante un bucle while.

class Bateria {
    private int porcentaje;

    public Bateria() {
        this.porcentaje = 100;
    }

    public void usar() {
        this.porcentaje -= 15;
        if (this.porcentaje < 0) {
            this.porcentaje = 0;
        }
    }

    public int getPorcentaje() {
        return this.porcentaje;
    }
}

public class Main {
    public static void main(String[] args) {
        Bateria bat = new Bateria();
        int usos = 0;
        
        while (bat.getPorcentaje() > 0) {
            bat.usar();
            usos++;
        }

        System.out.println("Usos: " + usos + " | Bateria restante: " + bat.getPorcentaje() + "%");
    }
}
