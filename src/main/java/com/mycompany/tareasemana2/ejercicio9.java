package com.mycompany.tareasemana2;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio9 {

    static class Medicamento {
        String nombre;
        int stockActual;
        int stockMinimo;
        double precio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Medicamento[] inventario = new Medicamento[100];
        int total = 0;
        int opcion;

        do {
            System.out.println();
            System.out.println("1. Registrar");
            System.out.println("2. Stock bajo el minimo");
            System.out.println("3. Valor del inventario");
            System.out.println("4. Registrar venta");
            System.out.println("5. Reporte");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Cuantos medicamentos desea registrar: ");
                int cantidad = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < cantidad; i++) {
                    inventario[total] = new Medicamento();
                    System.out.println("Medicamento " + (i + 1) + ":");
                    System.out.print("Nombre: ");
                    inventario[total].nombre = sc.nextLine();
                    System.out.print("Stock actual: ");
                    inventario[total].stockActual = sc.nextInt();
                    System.out.print("Stock minimo: ");
                    inventario[total].stockMinimo = sc.nextInt();
                    System.out.print("Precio unitario: ");
                    inventario[total].precio = sc.nextDouble();
                    sc.nextLine();
                    total++;
                }

            } else if (opcion == 2) {
                System.out.println("Medicamentos con stock bajo el minimo:");
                boolean hay = false;
                for (int i = 0; i < total; i++) {
                    if (inventario[i].stockActual < inventario[i].stockMinimo) {
                        System.out.println(inventario[i].nombre + " (stock " + inventario[i].stockActual
                                + ", minimo " + inventario[i].stockMinimo + ")");
                        hay = true;
                    }
                }
                if (!hay) {
                    System.out.println("Ninguno");
                }

            } else if (opcion == 3) {
                double valor = 0;
                for (int i = 0; i < total; i++) {
                    valor += inventario[i].stockActual * inventario[i].precio;
                }
                System.out.printf("Valor total del inventario: $%.2f%n", valor);

            } else if (opcion == 4) {
                System.out.print("Nombre del medicamento vendido: ");
                String nombre = sc.nextLine();
                int pos = -1;
                for (int i = 0; i < total; i++) {
                    if (inventario[i].nombre.equalsIgnoreCase(nombre)) {
                        pos = i;
                        break;
                    }
                }

                if (pos == -1) {
                    System.out.println("Medicamento no encontrado");
                } else {
                    System.out.print("Cantidad vendida: ");
                    int vendida = sc.nextInt();
                    sc.nextLine();
                    if (vendida <= inventario[pos].stockActual) {
                        inventario[pos].stockActual -= vendida;
                        System.out.println("Stock actualizado: " + inventario[pos].stockActual);
                    } else {
                        System.out.println("Stock insuficiente, disponible: " + inventario[pos].stockActual);
                    }
                }

            } else if (opcion == 5) {
                System.out.println("REPORTE GENERAL DEL INVENTARIO");
                double valor = 0;
                for (int i = 0; i < total; i++) {
                    double v = inventario[i].stockActual * inventario[i].precio;
                    System.out.printf("%s | Stock: %d | Minimo: %d | Precio: %.2f | Valor: %.2f%n",
                            inventario[i].nombre, inventario[i].stockActual,
                            inventario[i].stockMinimo, inventario[i].precio, v);
                    valor += v;
                }
                System.out.printf("Valor total del inventario: $%.2f%n", valor);

            } else if (opcion == 6) {
                System.out.println("Fin del programa");
            } else {
                System.out.println("Opcion invalida");
            }

        } while (opcion != 6);

        sc.close();
    }
}