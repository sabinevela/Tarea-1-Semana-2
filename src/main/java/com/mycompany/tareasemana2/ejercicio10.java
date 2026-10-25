package com.mycompany.tareasemana2;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio10 {

    static class Pedido {
        String cliente;
        String plato;
        int cantidad;
        double precioUnitario;
        double total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Cuantos pedidos desea registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        Pedido[] pedidos = new Pedido[n];

        for (int i = 0; i < n; i++) {
            pedidos[i] = new Pedido();
            System.out.println("Pedido " + (i + 1) + ":");
            System.out.print("Cliente: ");
            pedidos[i].cliente = sc.nextLine();
            System.out.print("Plato: ");
            pedidos[i].plato = sc.nextLine();
            System.out.print("Cantidad: ");
            pedidos[i].cantidad = sc.nextInt();
            System.out.print("Precio unitario: ");
            pedidos[i].precioUnitario = sc.nextDouble();
            sc.nextLine();

            double subtotal = pedidos[i].cantidad * pedidos[i].precioUnitario;
            if (subtotal > 50) {
                subtotal = subtotal * 0.90;
            }
            pedidos[i].total = subtotal;
        }

        double ingresoTotal = 0;
        int mayor = 0;

        System.out.println();
        System.out.println("Total a pagar por pedido:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s - %s x%d: $%.2f%n", pedidos[i].cliente, pedidos[i].plato,
                    pedidos[i].cantidad, pedidos[i].total);
            ingresoTotal += pedidos[i].total;
            if (pedidos[i].total > pedidos[mayor].total) {
                mayor = i;
            }
        }

        System.out.println();
        System.out.printf("Ingreso total del restaurante: $%.2f%n", ingresoTotal);
        if (n > 0) {
            System.out.printf("Pedido de mayor valor: %s - %s x%d: $%.2f%n", pedidos[mayor].cliente,
                    pedidos[mayor].plato, pedidos[mayor].cantidad, pedidos[mayor].total);
        }

        sc.close();
    }
}