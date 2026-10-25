package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Random; // Importamos Random para generar números al azar
import java.util.Scanner; // Importamos Scanner para leer datos por teclado

public class ejercicio4 { // Clase principal del ejercicio 4

    public static void main(String[] args) { // Aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado
        Random rnd = new Random(); // Creamos el generador de números al azar

        System.out.print("Ingrese M (filas): "); // Pedimos el número de filas
        int m = sc.nextInt(); // Guardamos las filas
        System.out.print("Ingrese N (columnas): "); // Pedimos el número de columnas
        int n = sc.nextInt(); // Guardamos las columnas

        int[][] a = new int[m][n]; // Elaboramos la matriz A de M x N
        for (int i = 0; i < m; i++) { // Recorremos las filas
            for (int j = 0; j < n; j++) { // Recorremos las columnas
                a[i][j] = rnd.nextInt(9) + 1; // Guardamos un número al azar entre 1 y 9
            } // Fin del for de columnas
        } // Fin del for de filas

        System.out.println("Matriz A:"); // Título de la matriz A
        for (int i = 0; i < m; i++) { // Recorremos las filas
            for (int j = 0; j < n; j++) { // Recorremos las columnas
                System.out.print(a[i][j] + "\t"); // Mostramos cada número con un espacio de tabulación
            } // Fin del for de columnas
            System.out.println(); // Salto de línea al terminar cada fila
        } // Fin del for de filas

        int opcion; // Variable para guardar la opción del menú
        do { // Repetimos el menú hasta que elijamos salir
            System.out.println(); // Línea en blanco
            System.out.println("1. Sumar"); // Opción 1 del menú
            System.out.println("2. Restar"); // Opción 2 del menú
            System.out.println("3. Multiplicar"); // Opción 3 del menú
            System.out.println("4. Trasponer"); // Opción 4 del menú
            System.out.println("5. Salir"); // Opción 5 del menú
            System.out.print("Seleccione una opcion: "); // Pedimos la opción
            opcion = sc.nextInt(); // Guardamos la opción elegida

            if (opcion == 1 || opcion == 2) { // Si elegimos sumar o restar
                int[][] b = new int[m][n]; // Elaboramos la matriz B del mismo tamaño que A
                for (int i = 0; i < m; i++) { // Recorremos las filas
                    for (int j = 0; j < n; j++) { // Recorremos las columnas
                        b[i][j] = rnd.nextInt(9) + 1; // Guardamos un número al azar entre 1 y 9
                    } // Fin del for de columnas
                } // Fin del for de filas

                System.out.println("Matriz B:"); // Título de la matriz B
                for (int i = 0; i < m; i++) { // Recorremos las filas
                    for (int j = 0; j < n; j++) { // Recorremos las columnas
                        System.out.print(b[i][j] + "\t"); // Mostramos cada número
                    } // Fin del for de columnas
                    System.out.println(); // Salto de línea al terminar cada fila
                } // Fin del for de filas

                int[][] r = new int[m][n]; // Elaboramos la matriz donde guardamos el resultado
                for (int i = 0; i < m; i++) { // Recorremos las filas
                    for (int j = 0; j < n; j++) { // Recorremos las columnas
                        if (opcion == 1) { // Si la opción es sumar
                            r[i][j] = a[i][j] + b[i][j]; // Sumamos los números de la misma posición
                        } else { // Si la opción es restar
                            r[i][j] = a[i][j] - b[i][j]; // Restamos los números de la misma posición
                        } // Fin del if-else
                    } // Fin del for de columnas
                } // Fin del for de filas

                if (opcion == 1) { // Si sumamos
                    System.out.println("A + B:"); // Título del resultado de la suma
                } else { // Si restamos
                    System.out.println("A - B:"); // Título del resultado de la resta
                } // Fin del if-else
                for (int i = 0; i < m; i++) { // Recorremos las filas
                    for (int j = 0; j < n; j++) { // Recorremos las columnas
                        System.out.print(r[i][j] + "\t"); // Mostramos cada número del resultado
                    } // Fin del for de columnas
                    System.out.println(); // Salto de línea al terminar cada fila
                } // Fin del for de filas

            } else if (opcion == 3) { // Si elegimos multiplicar
                System.out.print("Columnas de la matriz B (filas de B = " + n + "): "); // Pedimos las columnas de B
                int p = sc.nextInt(); // Guardamos las columnas de B

                int[][] b = new int[n][p]; // Elaboramos la matriz B con N filas y P columnas
                for (int i = 0; i < n; i++) { // Recorremos las filas
                    for (int j = 0; j < p; j++) { // Recorremos las columnas
                        b[i][j] = rnd.nextInt(9) + 1; // Guardamos un número al azar entre 1 y 9
                    } // Fin del for de columnas
                } // Fin del for de filas

                System.out.println("Matriz B:"); // Título de la matriz B
                for (int i = 0; i < n; i++) { // Recorremos las filas
                    for (int j = 0; j < p; j++) { // Recorremos las columnas
                        System.out.print(b[i][j] + "\t"); // Mostramos cada número
                    } // Fin del for de columnas
                    System.out.println(); // Salto de línea al terminar cada fila
                } // Fin del for de filas

                int[][] r = new int[m][p]; // Elaboramos la matriz resultado de M x P
                for (int i = 0; i < m; i++) { // Recorremos las filas de A
                    for (int j = 0; j < p; j++) { // Recorremos las columnas de B
                        for (int k = 0; k < n; k++) { // Recorremos los números que se multiplican entre sí
                            r[i][j] += a[i][k] * b[k][j]; // Multiplicamos fila por columna y sumamos
                        } // Fin del for de k
                    } // Fin del for de columnas
                } // Fin del for de filas

                System.out.println("A x B:"); // Título del resultado de la multiplicación
                for (int i = 0; i < m; i++) { // Recorremos las filas
                    for (int j = 0; j < p; j++) { // Recorremos las columnas
                        System.out.print(r[i][j] + "\t"); // Mostramos cada número del resultado
                    } // Fin del for de columnas
                    System.out.println(); // Salto de línea al terminar cada fila
                } // Fin del for de filas

            } else if (opcion == 4) { // Si elegimos trasponer
                int[][] t = new int[n][m]; // Elaboramos la traspuesta con filas y columnas cambiadas
                for (int i = 0; i < m; i++) { // Recorremos las filas de A
                    for (int j = 0; j < n; j++) { // Recorremos las columnas de A
                        t[j][i] = a[i][j]; // Cambiamos fila por columna
                    } // Fin del for de columnas
                } // Fin del for de filas

                System.out.println("Traspuesta de A:"); // Título de la traspuesta
                for (int i = 0; i < n; i++) { // Recorremos las filas de la traspuesta
                    for (int j = 0; j < m; j++) { // Recorremos las columnas de la traspuesta
                        System.out.print(t[i][j] + "\t"); // Mostramos cada número
                    } // Fin del for de columnas
                    System.out.println(); // Salto de línea al terminar cada fila
                } // Fin del for de filas

            } else if (opcion == 5) { // Si elegimos salir
                System.out.println("Fin del programa"); // Mensaje de despedida
            } else { // Si escribimos otra opción
                System.out.println("Opcion invalida"); // Avisamos que no es válida
            } // Fin del if-else

        } while (opcion != 5); // El menú se repite hasta elegir la opción 5

        sc.close(); // Cerramos el Scanner
    } // Fin del método main
} // Fin de la clase