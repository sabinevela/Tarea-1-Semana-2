package com.mycompany.tareasemana2;

import java.util.Random;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int[] original = new int[20];
        for (int i = 0; i < 20; i++) {
            original[i] = rnd.nextInt(50) + 1;
        }

        System.out.println("Vector original:");
        for (int i = 0; i < 20; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Ingrese el numero a buscar: ");
        int numero = sc.nextInt();

        int pos = -1;
        for (int i = 0; i < 20; i++) {
            if (original[i] == numero) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            System.out.println("El numero esta en la posicion " + pos);
        } else {
            System.out.println("El numero no esta en el vector");
        }

        int[] impares = new int[10];
        int k = 0;
        for (int i = 1; i < 20; i += 2) {
            impares[k] = original[i];
            k++;
        }

        System.out.println("Vector de indices impares:");
        for (int i = 0; i < 10; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

        int mayores = 0;
        for (int i = 0; i < 10; i++) {
            if (impares[i] > 20) {
                mayores++;
            }
        }

        System.out.println("Elementos mayores a 20 en el segundo vector: " + mayores);

        sc.close();
    }
}