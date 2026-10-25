package com.mycompany.tareasemana2;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de empleados: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] codigos = new String[n];
        String[] nombres = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Codigo del empleado " + (i + 1) + ": ");
            codigos[i] = sc.nextLine();
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.print("Ingrese el codigo a consultar: ");
        String buscado = sc.nextLine();

        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (codigos[i].equalsIgnoreCase(buscado)) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            System.out.println("Empleado: " + nombres[pos]);
        } else {
            System.out.println("No existe un empleado con el codigo " + buscado);
        }

        sc.close();
    }
}