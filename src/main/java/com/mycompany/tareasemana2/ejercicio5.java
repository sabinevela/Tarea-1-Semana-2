package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Locale; // Importamos Locale para escribir decimales con punto
import java.util.Scanner; // Importamos Scanner para leer datos por teclado

public class ejercicio5 { // Clase principal del ejercicio 5

    public static void main(String[] args) { // Aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado
        sc.useLocale(Locale.US); // Indicamos que los decimales se escriben con punto

        System.out.print("Numero de articulos: "); // Pedimos cuántos artículos hay
        int n = sc.nextInt(); // Guardamos el número de artículos
        System.out.print("Numero de sucursales: "); // Pedimos cuántas sucursales hay
        int m = sc.nextInt(); // Guardamos el número de sucursales

        double[][] precios = new double[n][m]; // Elaboramos la tabla de precios
        double[][] cantidades = new double[n][m]; // Elaboramos la tabla de cantidades vendidas

        System.out.println("Ingrese los PRECIOS:"); // Avisamos que ingresaremos los precios
        for (int i = 0; i < n; i++) { // Recorremos los artículos
            for (int j = 0; j < m; j++) { // Recorremos las sucursales
                System.out.print("Articulo " + (i + 1) + ", Sucursal " + (j + 1) + ": "); // Indicamos qué precio pedimos
                precios[i][j] = sc.nextDouble(); // Guardamos el precio
            } // Fin del for de sucursales
        } // Fin del for de artículos

        System.out.println("Ingrese las CANTIDADES vendidas:"); // Avisamos que ingresaremos las cantidades
        for (int i = 0; i < n; i++) { // Recorremos los artículos
            for (int j = 0; j < m; j++) { // Recorremos las sucursales
                System.out.print("Articulo " + (i + 1) + ", Sucursal " + (j + 1) + ": "); // Indicamos qué cantidad pedimos
                cantidades[i][j] = sc.nextDouble(); // Guardamos la cantidad vendida
            } // Fin del for de sucursales
        } // Fin del for de artículos

        double[] totalArticulo = new double[n]; // Aquí guardamos el total de cada artículo
        double[] totalSucursal = new double[m]; // Aquí guardamos el total de cada sucursal

        for (int i = 0; i < n; i++) { // Recorremos los artículos
            for (int j = 0; j < m; j++) { // Recorremos las sucursales
                double venta = precios[i][j] * cantidades[i][j]; // La venta es el precio por la cantidad
                totalArticulo[i] += venta; // Sumamos la venta al total del artículo
                totalSucursal[j] += venta; // Sumamos la venta al total de la sucursal
            } // Fin del for de sucursales
        } // Fin del for de artículos

        System.out.println(); // Línea en blanco
        System.out.println("Total de ventas por articulo:"); // Título del primer resultado
        for (int i = 0; i < n; i++) { // Recorremos los artículos
            System.out.printf("Articulo %d: $%.2f%n", i + 1, totalArticulo[i]); // Mostramos el total de cada artículo
        } // Fin del for

        System.out.println(); // Línea en blanco
        System.out.println("Total de ventas por sucursal:"); // Título del segundo resultado
        for (int j = 0; j < m; j++) { // Recorremos las sucursales
            System.out.printf("Sucursal %d: $%.2f%n", j + 1, totalSucursal[j]); // Mostramos el total de cada sucursal
        } // Fin del for

        sc.close(); // Cerramos el Scanner
    } // Fin del método main
} // Fin de la clase