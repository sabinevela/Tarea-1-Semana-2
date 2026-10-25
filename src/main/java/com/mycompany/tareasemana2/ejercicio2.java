package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Random; // Importamos Random para generar números al azar
import java.util.Scanner; // Importamos Scanner para leer datos por teclado

public class ejercicio2 { // Clase principal del ejercicio 2

    public static void main(String[] args) { // Aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado
        Random rnd = new Random(); // Creamos el generador de números al azar

        int[] original = new int[20]; // Elaboramos el vector de 20 posiciones
        for (int i = 0; i < 20; i++) { // Recorremos las 20 posiciones
            original[i] = rnd.nextInt(50) + 1; // Guardamos un número al azar entre 1 y 50
        } // Fin del for

        System.out.println("Vector original:"); // Título del vector original
        for (int i = 0; i < 20; i++) { // Recorremos el vector
            System.out.print(original[i] + " "); // Mostramos cada número seguido de un espacio
        } // Fin del for
        System.out.println(); // Salto de línea

        System.out.print("Ingrese el numero a buscar: "); // Pedimos el número que queremos buscar
        int numero = sc.nextInt(); // Guardamos el número que escribimos

        int pos = -1; // Guardará la posición; -1 significa que todavía no lo encontramos
        for (int i = 0; i < 20; i++) { // Recorremos el vector buscando el número
            if (original[i] == numero) { // Si el número de esta posición es el que buscamos
                pos = i; // Guardamos la posición donde lo encontramos
                break; // Dejamos de buscar
            } // Fin del if
        } // Fin del for

        if (pos != -1) { // Si encontramos el número
            System.out.println("El numero esta en la posicion " + pos); // Mostramos la posición
        } else { // Si no lo encontramos
            System.out.println("El numero no esta en el vector"); // Avisamos que no está
        } // Fin del if-else

        int[] impares = new int[10]; // Elaboramos el segundo vector con 10 posiciones
        int k = 0; // Posición donde vamos guardando en el segundo vector
        for (int i = 1; i < 20; i += 2) { // Recorremos las posiciones impares: 1, 3, 5...
            impares[k] = original[i]; // Copiamos el número al segundo vector
            k++; // Avanzamos a la siguiente posición del segundo vector
        } // Fin del for

        System.out.println("Vector de indices impares:"); // Título del segundo vector
        for (int i = 0; i < 10; i++) { // Recorremos el segundo vector
            System.out.print(impares[i] + " "); // Mostramos cada número
        } // Fin del for
        System.out.println(); // Salto de línea

        int mayores = 0; // Contador de números mayores a 20
        for (int i = 0; i < 10; i++) { // Recorremos el segundo vector
            if (impares[i] > 20) { // Si el número es mayor a 20
                mayores++; // Sumamos 1 al contador
            } // Fin del if
        } // Fin del for

        System.out.println("Elementos mayores a 20 en el segundo vector: " + mayores); // Mostramos el resultado

        sc.close(); // Cerramos el Scanner
    } // Fin del método main
} // Fin de la clase