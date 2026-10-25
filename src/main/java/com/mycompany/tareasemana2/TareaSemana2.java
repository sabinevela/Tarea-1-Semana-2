package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Scanner; // Importamos Scanner para poder leer lo que escribimos por teclado

public class TareaSemana2 { // Clase principal de nuestro programa

    public static void main(String[] args) { // Método principal, aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer los datos del teclado

        System.out.print("Ingrese N: "); // Pedimos el tamaño que tendrán los arreglos
        int n = sc.nextInt(); // Guardamos el valor de N que escribimos
        sc.nextLine(); // Limpiamos el salto de línea que queda pendiente después de leer el número

        String[] matematica = new String[n]; // Elaboramos el arreglo para las cédulas de los que reprobaron matemática
        String[] ingles = new String[n]; // Elaboramos el arreglo para las cédulas de los que reprobaron inglés

        System.out.println("Cedulas de reprobados en MATEMATICA:"); // Avisamos que vamos a ingresar las cédulas de matemática
        for (int i = 0; i < n; i++) { // Repetimos desde 0 hasta N-1 para llenar todo el arreglo
            System.out.print("Cedula " + (i + 1) + ": "); // Pedimos la cédula indicando su número
            matematica[i] = sc.nextLine(); // Guardamos la cédula en la posición i del arreglo de matemática
        } // Fin del for de matemática

        System.out.println("Cedulas de reprobados en INGLES:"); // Avisamos que vamos a ingresar las cédulas de inglés
        for (int i = 0; i < n; i++) { // Repetimos desde 0 hasta N-1 para llenar todo el arreglo
            System.out.print("Cedula " + (i + 1) + ": "); // Pedimos la cédula indicando su número
            ingles[i] = sc.nextLine(); // Guardamos la cédula en la posición i del arreglo de inglés
        } // Fin del for de inglés

        int contador = 0; // Variable para contar cuántas cédulas se repiten en los dos arreglos
        for (int i = 0; i < n; i++) { // Recorremos cada cédula del arreglo de matemática
            for (int j = 0; j < n; j++) { // Para cada una, recorremos todas las cédulas de inglés
                if (matematica[i].equals(ingles[j])) { // Preguntamos si la cédula de matemática es igual a la de inglés
                    contador++; // Si son iguales, sumamos 1 al contador
                    break; // Dejamos de buscar para no contar la misma cédula dos veces
                } // Fin del if
            } // Fin del for de inglés
        } // Fin del for de matemática

        String[] ambas = new String[contador]; // Elaboramos el tercer arreglo con el tamaño exacto de las cédulas repetidas
        int pos = 0; // Variable para saber en qué posición guardar en el tercer arreglo
        for (int i = 0; i < n; i++) { // Volvemos a recorrer cada cédula de matemática
            for (int j = 0; j < n; j++) { // Y la comparamos con todas las de inglés
                if (matematica[i].equals(ingles[j])) { // Si la cédula está en los dos arreglos
                    ambas[pos] = matematica[i]; // La guardamos en el tercer arreglo
                    pos++; // Avanzamos a la siguiente posición del tercer arreglo
                    break; // Dejamos de buscar para no guardar la misma cédula dos veces
                } // Fin del if
            } // Fin del for de inglés
        } // Fin del for de matemática

        System.out.println(); // Dejamos una línea en blanco para que se vea ordenado
        System.out.println("Reprobaron MATEMATICA:"); // Título del primer arreglo
        for (int i = 0; i < n; i++) { // Recorremos el arreglo de matemática
            System.out.println(matematica[i]); // Mostramos cada cédula en pantalla
        } // Fin del for

        System.out.println("Reprobaron INGLES:"); // Título del segundo arreglo
        for (int i = 0; i < n; i++) { // Recorremos el arreglo de inglés
            System.out.println(ingles[i]); // Mostramos cada cédula en pantalla
        } // Fin del for

        System.out.println("Reprobaron AMBAS:"); // Título del tercer arreglo
        for (int i = 0; i < ambas.length; i++) { // Recorremos el arreglo de los que reprobaron las dos materias
            System.out.println(ambas[i]); // Mostramos cada cédula en pantalla
        } // Fin del for

        sc.close(); // Cerramos el Scanner porque ya no vamos a leer más datos
    } // Fin del método main
} // Fin de la clase