package com.mycompany.tareasemana2;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Numero de articulos: ");
        int n = sc.nextInt();
        System.out.print("Numero de sucursales: ");
        int m = sc.nextInt();

        double[][] precios = new double[n][m];
        double[][] cantidades = new double[n][m];

        System.out.println("Ingrese los PRECIOS:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Articulo " + (i + 1) + ", Sucursal " + (j + 1) + ": ");
                precios[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Ingrese las CANTIDADES vendidas:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Articulo " + (i + 1) + ", Sucursal " + (j + 1) + ": ");
                cantidades[i][j] = sc.nextDouble();
            }
        }

        double[] totalArticulo = new double[n];
        double[] totalSucursal = new double[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double venta = precios[i][j] * cantidades[i][j];
                totalArticulo[i] += venta;
                totalSucursal[j] += venta;
            }
        }

        System.out.println();
        System.out.println("Total de ventas por articulo:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Articulo %d: $%.2f%n", i + 1, totalArticulo[i]);
        }

        System.out.println();
        System.out.println("Total de ventas por sucursal:");
        for (int j = 0; j < m; j++) {
            System.out.printf("Sucursal %d: $%.2f%n", j + 1, totalSucursal[j]);
        }

        sc.close();
    }
}