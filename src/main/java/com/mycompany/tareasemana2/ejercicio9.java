package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Locale; // Importamos Locale para escribir decimales con punto
import java.util.Scanner; // Importamos Scanner para leer datos por teclado

public class ejercicio9 { // Clase principal del ejercicio 9

    static class Medicamento { // Elaboramos un registro para guardar los datos de cada medicamento
        String nombre; // Nombre del medicamento
        int stockActual; // Unidades que hay ahora
        int stockMinimo; // Unidades mínimas que debe haber
        double precio; // Precio de cada unidad
    } // Fin de la clase Medicamento

    public static void main(String[] args) { // Aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado
        sc.useLocale(Locale.US); // Indicamos que los decimales se escriben con punto

        Medicamento[] inventario = new Medicamento[100]; // Elaboramos el inventario con espacio para 100 medicamentos
        int total = 0; // Cuántos medicamentos hemos registrado hasta ahora
        int opcion; // Variable para guardar la opción del menú

        do { // Repetimos el menú hasta que elijamos salir
            System.out.println(); // Línea en blanco
            System.out.println("1. Registrar"); // Opción 1 del menú
            System.out.println("2. Stock bajo el minimo"); // Opción 2 del menú
            System.out.println("3. Valor del inventario"); // Opción 3 del menú
            System.out.println("4. Registrar venta"); // Opción 4 del menú
            System.out.println("5. Reporte"); // Opción 5 del menú
            System.out.println("6. Salir"); // Opción 6 del menú
            System.out.print("Seleccione una opcion: "); // Pedimos la opción
            opcion = sc.nextInt(); // Guardamos la opción elegida
            sc.nextLine(); // Limpiamos el salto de línea que queda pendiente

            if (opcion == 1) { // Si elegimos registrar
                System.out.print("Cuantos medicamentos desea registrar: "); // Pedimos cuántos vamos a registrar
                int cantidad = sc.nextInt(); // Guardamos la cantidad
                sc.nextLine(); // Limpiamos el salto de línea que queda pendiente

                for (int i = 0; i < cantidad; i++) { // Repetimos una vez por cada medicamento
                    inventario[total] = new Medicamento(); // Creamos el registro del medicamento
                    System.out.println("Medicamento " + (i + 1) + ":"); // Indicamos qué medicamento ingresamos
                    System.out.print("Nombre: "); // Pedimos el nombre
                    inventario[total].nombre = sc.nextLine(); // Guardamos el nombre
                    System.out.print("Stock actual: "); // Pedimos el stock actual
                    inventario[total].stockActual = sc.nextInt(); // Guardamos el stock actual
                    System.out.print("Stock minimo: "); // Pedimos el stock mínimo
                    inventario[total].stockMinimo = sc.nextInt(); // Guardamos el stock mínimo
                    System.out.print("Precio unitario: "); // Pedimos el precio
                    inventario[total].precio = sc.nextDouble(); // Guardamos el precio
                    sc.nextLine(); // Limpiamos el salto de línea que queda pendiente
                    total++; // Sumamos 1 al total de medicamentos registrados
                } // Fin del for

            } else if (opcion == 2) { // Si elegimos ver el stock bajo el mínimo
                System.out.println("Medicamentos con stock bajo el minimo:"); // Título de la lista
                boolean hay = false; // Nos ayuda a saber si encontramos alguno
                for (int i = 0; i < total; i++) { // Recorremos los medicamentos registrados
                    if (inventario[i].stockActual < inventario[i].stockMinimo) { // Si tiene menos unidades que el mínimo
                        System.out.println(inventario[i].nombre + " (stock " + inventario[i].stockActual // Mostramos el nombre y el stock
                                + ", minimo " + inventario[i].stockMinimo + ")"); // Mostramos el mínimo
                        hay = true; // Marcamos que encontramos al menos uno
                    } // Fin del if
                } // Fin del for
                if (!hay) { // Si no encontramos ninguno
                    System.out.println("Ninguno"); // Avisamos que no hay
                } // Fin del if

            } else if (opcion == 3) { // Si elegimos calcular el valor del inventario
                double valor = 0; // Aquí sumamos el valor de todo el inventario
                for (int i = 0; i < total; i++) { // Recorremos los medicamentos registrados
                    valor += inventario[i].stockActual * inventario[i].precio; // Unidades por precio, y lo sumamos
                } // Fin del for
                System.out.printf("Valor total del inventario: $%.2f%n", valor); // Mostramos el valor total

            } else if (opcion == 4) { // Si elegimos registrar una venta
                System.out.print("Nombre del medicamento vendido: "); // Pedimos el nombre del medicamento
                String nombre = sc.nextLine(); // Guardamos el nombre
                int pos = -1; // Guardará la posición; -1 significa que todavía no lo encontramos
                for (int i = 0; i < total; i++) { // Recorremos los medicamentos registrados
                    if (inventario[i].nombre.equalsIgnoreCase(nombre)) { // Comparamos sin importar mayúsculas o minúsculas
                        pos = i; // Guardamos la posición donde lo encontramos
                        break; // Dejamos de buscar
                    } // Fin del if
                } // Fin del for

                if (pos == -1) { // Si no lo encontramos
                    System.out.println("Medicamento no encontrado"); // Avisamos que no existe
                } else { // Si lo encontramos
                    System.out.print("Cantidad vendida: "); // Pedimos cuántas unidades se vendieron
                    int vendida = sc.nextInt(); // Guardamos la cantidad vendida
                    sc.nextLine(); // Limpiamos el salto de línea que queda pendiente
                    if (vendida <= inventario[pos].stockActual) { // Si alcanza el stock para la venta
                        inventario[pos].stockActual -= vendida; // Restamos lo vendido al stock
                        System.out.println("Stock actualizado: " + inventario[pos].stockActual); // Mostramos el nuevo stock
                    } else { // Si no alcanza el stock
                        System.out.println("Stock insuficiente, disponible: " + inventario[pos].stockActual); // Avisamos cuánto hay
                    } // Fin del if-else interno
                } // Fin del if-else

            } else if (opcion == 5) { // Si elegimos el reporte
                System.out.println("REPORTE GENERAL DEL INVENTARIO"); // Título del reporte
                double valor = 0; // Aquí sumamos el valor total
                for (int i = 0; i < total; i++) { // Recorremos los medicamentos registrados
                    double v = inventario[i].stockActual * inventario[i].precio; // Valor de este medicamento
                    System.out.printf("%s | Stock: %d | Minimo: %d | Precio: %.2f | Valor: %.2f%n", // Formato de cada línea del reporte
                            inventario[i].nombre, inventario[i].stockActual, // Mostramos nombre y stock
                            inventario[i].stockMinimo, inventario[i].precio, v); // Mostramos mínimo, precio y valor
                    valor += v; // Sumamos el valor al total
                } // Fin del for
                System.out.printf("Valor total del inventario: $%.2f%n", valor); // Mostramos el valor total

            } else if (opcion == 6) { // Si elegimos salir
                System.out.println("Fin del programa"); // Mensaje de despedida
            } else { // Si escribimos otra opción
                System.out.println("Opcion invalida"); // Avisamos que no es válida
            } // Fin del if-else

        } while (opcion != 6); // El menú se repite hasta elegir la opción 6

        sc.close(); // Cerramos el Scanner
    } // Fin del método main
} // Fin de la clase