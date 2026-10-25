package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Locale; // Importamos Locale para escribir decimales con punto
import java.util.Scanner; // Importamos Scanner para leer datos por teclado

public class ejercicio6 { // Clase principal del ejercicio 6

    public static void main(String[] args) { // Aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado
        sc.useLocale(Locale.US); // Indicamos que los decimales se escriben con punto

        System.out.print("Numero de vendedores: "); // Pedimos cuántos vendedores hay
        int n = sc.nextInt(); // Guardamos el número de vendedores
        System.out.print("Numero de anios: "); // Pedimos cuántos años tiene la empresa
        int m = sc.nextInt(); // Guardamos el número de años

        double[][] ventas = new double[n][m]; // Elaboramos la tabla de ventas

        for (int i = 0; i < n; i++) { // Recorremos los vendedores
            for (int j = 0; j < m; j++) { // Recorremos los años
                System.out.print("Ventas del vendedor " + (i + 1) + " en el anio " + (j + 1) + ": "); // Indicamos qué dato pedimos
                ventas[i][j] = sc.nextDouble(); // Guardamos la venta
            } // Fin del for de años
        } // Fin del for de vendedores

        double[] totalVendedor = new double[n]; // Aquí guardamos el total de cada vendedor
        double[] totalAnio = new double[m]; // Aquí guardamos el total de cada año
        double totalEmpresa = 0; // Aquí guardamos el total de toda la empresa

        for (int i = 0; i < n; i++) { // Recorremos los vendedores
            for (int j = 0; j < m; j++) { // Recorremos los años
                totalVendedor[i] += ventas[i][j]; // Sumamos la venta al total del vendedor
                totalAnio[j] += ventas[i][j]; // Sumamos la venta al total del año
                totalEmpresa += ventas[i][j]; // Sumamos la venta al total de la empresa
            } // Fin del for de años
        } // Fin del for de vendedores

        System.out.println(); // Línea en blanco
        System.out.println("Total de ventas de cada vendedor:"); // Título del primer resultado
        for (int i = 0; i < n; i++) { // Recorremos los vendedores
            System.out.printf("Vendedor %d: $%.2f%n", i + 1, totalVendedor[i]); // Mostramos el total de cada vendedor
        } // Fin del for

        System.out.println(); // Línea en blanco
        System.out.println("Total de ventas en cada anio:"); // Título del segundo resultado
        for (int j = 0; j < m; j++) { // Recorremos los años
            System.out.printf("Anio %d: $%.2f%n", j + 1, totalAnio[j]); // Mostramos el total de cada año
        } // Fin del for

        System.out.println(); // Línea en blanco
        System.out.printf("Total de ventas de la empresa: $%.2f%n", totalEmpresa); // Mostramos el total de la empresa

        sc.close(); // Cerramos el Scanner
    } // Fin del método main
} // Fin de la clase