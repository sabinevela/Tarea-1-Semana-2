package com.mycompany.tareasemana2;

import java.util.Scanner;

public class TareaSemana2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] matematica = new String[n];
        String[] ingles = new String[n];

        System.out.println("Cedulas de reprobados en MATEMATICA:");
        for (int i = 0; i < n; i++) {
            System.out.print("Cedula " + (i + 1) + ": ");
            matematica[i] = sc.nextLine();
        }

        System.out.println("Cedulas de reprobados en INGLES:");
        for (int i = 0; i < n; i++) {
            System.out.print("Cedula " + (i + 1) + ": ");
            ingles[i] = sc.nextLine();
        }

        int contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matematica[i].equals(ingles[j])) {
                    contador++;
                    break;
                }
            }
        }

        String[] ambas = new String[contador];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matematica[i].equals(ingles[j])) {
                    ambas[pos] = matematica[i];
                    pos++;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("Reprobaron MATEMATICA:");
        for (int i = 0; i < n; i++) {
            System.out.println(matematica[i]);
        }

        System.out.println("Reprobaron INGLES:");
        for (int i = 0; i < n; i++) {
            System.out.println(ingles[i]);
        }

        System.out.println("Reprobaron AMBAS:");
        for (int i = 0; i < ambas.length; i++) {
            System.out.println(ambas[i]);
        }

        sc.close();
    }
}