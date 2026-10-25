package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Locale; // Importamos Locale para escribir decimales con punto
import java.util.Scanner; // Importamos Scanner para leer datos por teclado

public class ejercicio7 { // Clase principal del ejercicio 7

    public static void main(String[] args) { // Aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado
        sc.useLocale(Locale.US); // Indicamos que los decimales se escriben con punto

        System.out.print("Numero de estudiantes: "); // Pedimos cuántos estudiantes hay
        int n = sc.nextInt(); // Guardamos el número de estudiantes

        int[] codigos = new int[n]; // Elaboramos el arreglo para los códigos de los estudiantes
        double[][] notas = new double[n][8]; // Elaboramos la tabla de notas: N estudiantes por 8 materias

        for (int i = 0; i < n; i++) { // Recorremos los estudiantes
            System.out.print("Codigo del estudiante " + (i + 1) + ": "); // Pedimos el código
            codigos[i] = sc.nextInt(); // Guardamos el código
            for (int j = 0; j < 8; j++) { // Recorremos las 8 materias
                System.out.print("Nota de la materia " + (j + 1) + ": "); // Pedimos la nota
                notas[i][j] = sc.nextDouble(); // Guardamos la nota
            } // Fin del for de materias
        } // Fin del for de estudiantes

        double[] promEst = new double[n]; // Aquí guardamos el promedio de cada estudiante
        double[] promMat = new double[8]; // Aquí guardamos el promedio de cada materia
        int[] aprobados = new int[8]; // Aquí contamos los aprobados de cada materia
        int[] reprobados = new int[8]; // Aquí contamos los reprobados de cada materia

        for (int i = 0; i < n; i++) { // Recorremos los estudiantes
            for (int j = 0; j < 8; j++) { // Recorremos las materias
                promEst[i] += notas[i][j]; // Sumamos la nota al total del estudiante
                promMat[j] += notas[i][j]; // Sumamos la nota al total de la materia
                if (notas[i][j] >= 7 && notas[i][j] <= 10) { // Si la nota está entre 7 y 10
                    aprobados[j]++; // Contamos un aprobado en esa materia
                } else if (notas[i][j] < 7) { // Si la nota es menor a 7
                    reprobados[j]++; // Contamos un reprobado en esa materia
                } // Fin del if-else
            } // Fin del for de materias
            promEst[i] = promEst[i] / 8; // Dividimos para 8 y sacamos el promedio del estudiante
        } // Fin del for de estudiantes

        for (int j = 0; j < 8; j++) { // Recorremos las materias
            promMat[j] = promMat[j] / n; // Dividimos para N y sacamos el promedio de la materia
        } // Fin del for

        int mejor = 0; // Posición del estudiante con mayor promedio, empezamos con el primero
        for (int i = 1; i < n; i++) { // Recorremos desde el segundo estudiante
            if (promEst[i] > promEst[mejor]) { // Si este promedio es más alto que el mejor hasta ahora
                mejor = i; // Guardamos esta posición como la mejor
            } // Fin del if
        } // Fin del for

        System.out.println(); // Línea en blanco
        System.out.println("Promedio por estudiante:"); // Título del primer resultado
        for (int i = 0; i < n; i++) { // Recorremos los estudiantes
            System.out.printf("Estudiante %d: %.2f%n", codigos[i], promEst[i]); // Mostramos el promedio de cada estudiante
        } // Fin del for

        System.out.println(); // Línea en blanco
        System.out.println("Promedio por materia:"); // Título del segundo resultado
        for (int j = 0; j < 8; j++) { // Recorremos las materias
            System.out.printf("Materia %d: %.2f%n", j + 1, promMat[j]); // Mostramos el promedio de cada materia
        } // Fin del for

        System.out.println(); // Línea en blanco
        System.out.printf("Mayor promedio: estudiante %d con %.2f%n", codigos[mejor], promEst[mejor]); // Mostramos al mejor estudiante

        System.out.println(); // Línea en blanco
        System.out.println("Aprobados por materia:"); // Título de los aprobados
        for (int j = 0; j < 8; j++) { // Recorremos las materias
            System.out.println("Materia " + (j + 1) + ": " + aprobados[j]); // Mostramos los aprobados de cada materia
        } // Fin del for

        System.out.println(); // Línea en blanco
        System.out.println("Reprobados por materia:"); // Título de los reprobados
        for (int j = 0; j < 8; j++) { // Recorremos las materias
            System.out.println("Materia " + (j + 1) + ": " + reprobados[j]); // Mostramos los reprobados de cada materia
        } // Fin del for

        sc.close(); // Cerramos el Scanner
    } // Fin del método main
} // Fin de la clase