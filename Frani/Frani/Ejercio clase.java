// // // Pide a usuario que introduzca su nombre y edad, y luego lo imprima en pantalla.
// // // Y muestre un mensaje personalizado.

// // import  java.util.Scanner;

// // class Ejercicio3 {
// //     public static void main(String[] args) {
// //         Scanner scanner = new Scanner(System.in);

// //         System.out.print("Introduce tu nombre: ");
// //         String nombre = scanner.nextLine();

// //         System.out.println("Introduce tu apellido: ");
// //         String apellido = scanner.nextLine();

// //         System.out.println("Introduce tu edad: ");
// //         int edad = scanner.nextInt();

// //         System.out.println("Hola " + nombre + " apellido" + ", tienes " + edad + "años.");

// //         scanner.close();
// //     }
// // }


// // Pide al usuaio un numero entero y muestre su tabla de multipiclar del 1 al 10

// import java.util.Scanner;

// class Ejercicio4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Introduce un numero que veas en la tabla de multiplicador: ");
//         int tabla = scanner.nextInt();

//         for (int i = 1; i <=10; i++){
//             System.out.println(tabla + " x " + i + " * " + (tabla * 1));

//         }
//         scanner.close();
//     }
// }



// // Pide al usuario que introduzca una nota numerico de 0 al 10 (puede llevar decimales) y muestresu su califacion
// // segun la escala estandar. 

// import java.util.Scanner;

// public class Calificacion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);


//     }
// }

//Crear la clase lampara que gestione su estado (encendido/apagado) y un nivel de brillo (1 en 5).
//Solamente se puede ajustar el brillo si la lampara esta encendida

// Clase Lampara
public class Lampara {

    // Datos de la lámpara
    boolean encendida = false;  // empieza apagada
    int brillo = 1;             // empieza con brillo 1

    // Enciende la lámpara
    void encender() {
        encendida = true;
    }

    // Apaga la lámpara
    void apagar() {
        encendida = false;
    }

    // Cambia el brillo solo si está encendida
    void ajustarBrillo(int nuevoBrillo) {
        if (encendida == true) {
            brillo = nuevoBrillo;
        }
    }

    // Aquí empieza el programa
    public static void main(String[] args) {

        // Creo la lámpara
        Lampara miLampara = new Lampara();

        // La enciendo y pongo el brillo en 4
        miLampara.encender();
        miLampara.ajustarBrillo(4);

        // Muestro los datos
        System.out.println("Encendida: " + miLampara.encendida);
        System.out.println("Brillo: " + miLampara.brillo);
    }
}