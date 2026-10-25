package com.mycompany.tareasemana2;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Numero de vendedores: ");
        int n = sc.nextInt();
        System.out.print("Numero de anios: ");
        int m = sc.nextInt();

        double[][] ventas = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ventas del vendedor " + (i + 1) + " en el anio " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble();
            }
        }

        double[] totalVendedor = new double[n];
        double[] totalAnio = new double[m];
        double totalEmpresa = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalVendedor[i] += ventas[i][j];
                totalAnio[j] += ventas[i][j];
                totalEmpresa += ventas[i][j];
            }
        }

        System.out.println();
        System.out.println("Total de ventas de cada vendedor:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Vendedor %d: $%.2f%n", i + 1, totalVendedor[i]);
        }

        System.out.println();
        System.out.println("Total de ventas en cada anio:");
        for (int j = 0; j < m; j++) {
            System.out.printf("Anio %d: $%.2f%n", j + 1, totalAnio[j]);
        }

        System.out.println();
        System.out.printf("Total de ventas de la empresa: $%.2f%n", totalEmpresa);

        sc.close();
    }
}