package com.mycompany.tareasemana2;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Numero de estudiantes: ");
        int n = sc.nextInt();

        int[] codigos = new int[n];
        double[][] notas = new double[n][8];

        for (int i = 0; i < n; i++) {
            System.out.print("Codigo del estudiante " + (i + 1) + ": ");
            codigos[i] = sc.nextInt();
            for (int j = 0; j < 8; j++) {
                System.out.print("Nota de la materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        double[] promEst = new double[n];
        double[] promMat = new double[8];
        int[] aprobados = new int[8];
        int[] reprobados = new int[8];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 8; j++) {
                promEst[i] += notas[i][j];
                promMat[j] += notas[i][j];
                if (notas[i][j] >= 7 && notas[i][j] <= 10) {
                    aprobados[j]++;
                } else if (notas[i][j] < 7) {
                    reprobados[j]++;
                }
            }
            promEst[i] = promEst[i] / 8;
        }

        for (int j = 0; j < 8; j++) {
            promMat[j] = promMat[j] / n;
        }

        int mejor = 0;
        for (int i = 1; i < n; i++) {
            if (promEst[i] > promEst[mejor]) {
                mejor = i;
            }
        }

        System.out.println();
        System.out.println("Promedio por estudiante:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Estudiante %d: %.2f%n", codigos[i], promEst[i]);
        }

        System.out.println();
        System.out.println("Promedio por materia:");
        for (int j = 0; j < 8; j++) {
            System.out.printf("Materia %d: %.2f%n", j + 1, promMat[j]);
        }

        System.out.println();
        System.out.printf("Mayor promedio: estudiante %d con %.2f%n", codigos[mejor], promEst[mejor]);

        System.out.println();
        System.out.println("Aprobados por materia:");
        for (int j = 0; j < 8; j++) {
            System.out.println("Materia " + (j + 1) + ": " + aprobados[j]);
        }

        System.out.println();
        System.out.println("Reprobados por materia:");
        for (int j = 0; j < 8; j++) {
            System.out.println("Materia " + (j + 1) + ": " + reprobados[j]);
        }

        sc.close();
    }
}