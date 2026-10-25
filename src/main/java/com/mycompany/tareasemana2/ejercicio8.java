package com.mycompany.tareasemana2;

import java.util.Scanner;

public class ejercicio8 {

    static class Operario {
        int codigo;
        int horasAusencia;
        int defectuosos;
        int producidos;
        int grado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de operarios: ");
        int n = sc.nextInt();

        Operario[] operarios = new Operario[n];

        for (int i = 0; i < n; i++) {
            operarios[i] = new Operario();
            System.out.println("Operario " + (i + 1) + ":");
            System.out.print("Codigo: ");
            operarios[i].codigo = sc.nextInt();
            System.out.print("Horas de ausencia: ");
            operarios[i].horasAusencia = sc.nextInt();
            System.out.print("Pupitres defectuosos: ");
            operarios[i].defectuosos = sc.nextInt();
            System.out.print("Pupitres producidos: ");
            operarios[i].producidos = sc.nextInt();

            boolean c1 = operarios[i].horasAusencia <= 3;
            boolean c2 = operarios[i].defectuosos < 300;
            boolean c3 = operarios[i].producidos > 10000;

            if (c1 && c2 && c3) {
                operarios[i].grado = 20;
            } else if (c2 && c3) {
                operarios[i].grado = 15;
            } else if (c1 && c3) {
                operarios[i].grado = 13;
            } else if (c1 && c2) {
                operarios[i].grado = 12;
            } else if (c3) {
                operarios[i].grado = 9;
            } else if (c2) {
                operarios[i].grado = 8;
            } else if (c1) {
                operarios[i].grado = 7;
            } else {
                operarios[i].grado = 5;
            }
        }

        System.out.println();
        System.out.println("Reporte de eficiencia:");
        for (int i = 0; i < n; i++) {
            System.out.println("Codigo: " + operarios[i].codigo
                    + " | Ausencia: " + operarios[i].horasAusencia
                    + " | Defectuosos: " + operarios[i].defectuosos
                    + " | Producidos: " + operarios[i].producidos
                    + " | Grado: " + operarios[i].grado);
        }

        sc.close();
    }
}