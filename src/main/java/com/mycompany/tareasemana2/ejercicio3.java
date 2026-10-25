package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Scanner; // Importamos Scanner para leer datos por teclado

public class ejercicio3 { // Clase principal del ejercicio 3

    public static void main(String[] args) { // Aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado

        System.out.print("Ingrese el numero de empleados: "); // Pedimos cuántos empleados vamos a registrar
        int n = sc.nextInt(); // Guardamos la cantidad de empleados
        sc.nextLine(); // Limpiamos el salto de línea que queda pendiente

        String[] codigos = new String[n]; // Elaboramos el arreglo para los códigos
        String[] nombres = new String[n]; // Elaboramos el arreglo para los nombres

        for (int i = 0; i < n; i++) { // Repetimos una vez por cada empleado
            System.out.print("Codigo del empleado " + (i + 1) + ": "); // Pedimos el código
            codigos[i] = sc.nextLine(); // Guardamos el código
            System.out.print("Nombre del empleado " + (i + 1) + ": "); // Pedimos el nombre
            nombres[i] = sc.nextLine(); // Guardamos el nombre
        } // Fin del for

        System.out.print("Ingrese el codigo a consultar: "); // Pedimos el código que queremos buscar
        String buscado = sc.nextLine(); // Guardamos el código a buscar

        int pos = -1; // Guardará la posición; -1 significa que todavía no lo encontramos
        for (int i = 0; i < n; i++) { // Recorremos todos los códigos
            if (codigos[i].equalsIgnoreCase(buscado)) { // Comparamos sin importar mayúsculas o minúsculas
                pos = i; // Guardamos la posición donde lo encontramos
                break; // Dejamos de buscar
            } // Fin del if
        } // Fin del for

        if (pos != -1) { // Si encontramos el código
            System.out.println("Empleado: " + nombres[pos]); // Mostramos el nombre del empleado
        } else { // Si no lo encontramos
            System.out.println("No existe un empleado con el codigo " + buscado); // Avisamos que no existe
        } // Fin del if-else

        sc.close(); // Cerramos el Scanner
    } // Fin del método main
} // Fin de la clase