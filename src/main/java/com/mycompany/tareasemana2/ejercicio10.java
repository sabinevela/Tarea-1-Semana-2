package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Locale; // Importamos Locale para escribir decimales con punto
import java.util.Scanner; // Importamos Scanner para leer datos por teclado

public class ejercicio10 { // Clase principal del ejercicio 10

    static class Pedido { // Elaboramos un registro para guardar los datos de cada pedido
        String cliente; // Nombre del cliente
        String plato; // Plato que pidió
        int cantidad; // Cuántos platos pidió
        double precioUnitario; // Precio de cada plato
        double total; // Total que debe pagar
    } // Fin de la clase Pedido

    public static void main(String[] args) { // Aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado
        sc.useLocale(Locale.US); // Indicamos que los decimales se escriben con punto

        System.out.print("Cuantos pedidos desea registrar: "); // Pedimos cuántos pedidos vamos a registrar
        int n = sc.nextInt(); // Guardamos la cantidad de pedidos
        sc.nextLine(); // Limpiamos el salto de línea que queda pendiente

        Pedido[] pedidos = new Pedido[n]; // Elaboramos el arreglo de pedidos

        for (int i = 0; i < n; i++) { // Recorremos los pedidos
            pedidos[i] = new Pedido(); // Creamos el registro de este pedido
            System.out.println("Pedido " + (i + 1) + ":"); // Indicamos qué pedido estamos ingresando
            System.out.print("Cliente: "); // Pedimos el nombre del cliente
            pedidos[i].cliente = sc.nextLine(); // Guardamos el cliente
            System.out.print("Plato: "); // Pedimos el plato
            pedidos[i].plato = sc.nextLine(); // Guardamos el plato
            System.out.print("Cantidad: "); // Pedimos la cantidad
            pedidos[i].cantidad = sc.nextInt(); // Guardamos la cantidad
            System.out.print("Precio unitario: "); // Pedimos el precio de cada plato
            pedidos[i].precioUnitario = sc.nextDouble(); // Guardamos el precio
            sc.nextLine(); // Limpiamos el salto de línea que queda pendiente

            double subtotal = pedidos[i].cantidad * pedidos[i].precioUnitario; // Calculamos cantidad por precio
            if (subtotal > 50) { // Si el pedido pasa de 50 dólares
                subtotal = subtotal * 0.90; // Aplicamos el descuento del 10%
            } // Fin del if
            pedidos[i].total = subtotal; // Guardamos el total a pagar
        } // Fin del for

        double ingresoTotal = 0; // Aquí sumamos lo que ganó el restaurante
        int mayor = 0; // Posición del pedido de mayor valor, empezamos con el primero

        System.out.println(); // Línea en blanco
        System.out.println("Total a pagar por pedido:"); // Título del primer resultado
        for (int i = 0; i < n; i++) { // Recorremos los pedidos
            System.out.printf("%s - %s x%d: $%.2f%n", pedidos[i].cliente, pedidos[i].plato, // Mostramos cliente y plato
                    pedidos[i].cantidad, pedidos[i].total); // Mostramos cantidad y total a pagar
            ingresoTotal += pedidos[i].total; // Sumamos el total al ingreso del restaurante
            if (pedidos[i].total > pedidos[mayor].total) { // Si este pedido vale más que el mayor hasta ahora
                mayor = i; // Guardamos esta posición como la del mayor
            } // Fin del if
        } // Fin del for

        System.out.println(); // Línea en blanco
        System.out.printf("Ingreso total del restaurante: $%.2f%n", ingresoTotal); // Mostramos el ingreso total
        if (n > 0) { // Si registramos al menos un pedido
            System.out.printf("Pedido de mayor valor: %s - %s x%d: $%.2f%n", pedidos[mayor].cliente, // Mostramos el cliente del mayor
                    pedidos[mayor].plato, pedidos[mayor].cantidad, pedidos[mayor].total); // Mostramos plato, cantidad y total
        } // Fin del if

        sc.close(); // Cerramos el Scanner
    } // Fin del método main
} // Fin de la clase