package com.mycompany.tareasemana2; // Paquete donde está guardado nuestro programa

import java.util.Scanner; // Importamos Scanner para leer datos por teclado

public class ejercicio8 { // Clase principal del ejercicio 8

    static class Operario { // Elaboramos un registro para guardar los datos de cada operario
        int codigo; // Código del trabajador
        int horasAusencia; // Horas que faltó
        int defectuosos; // Pupitres defectuosos
        int producidos; // Pupitres producidos
        int grado; // Grado de eficiencia que le corresponde
    } // Fin de la clase Operario

    public static void main(String[] args) { // Aquí empieza a ejecutarse el programa
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado

        System.out.print("Numero de operarios: "); // Pedimos cuántos operarios hay
        int n = sc.nextInt(); // Guardamos el número de operarios

        Operario[] operarios = new Operario[n]; // Elaboramos el arreglo de operarios

        for (int i = 0; i < n; i++) { // Recorremos los operarios
            operarios[i] = new Operario(); // Creamos el registro de este operario
            System.out.println("Operario " + (i + 1) + ":"); // Indicamos qué operario estamos ingresando
            System.out.print("Codigo: "); // Pedimos el código
            operarios[i].codigo = sc.nextInt(); // Guardamos el código
            System.out.print("Horas de ausencia: "); // Pedimos las horas de ausencia
            operarios[i].horasAusencia = sc.nextInt(); // Guardamos las horas de ausencia
            System.out.print("Pupitres defectuosos: "); // Pedimos los pupitres defectuosos
            operarios[i].defectuosos = sc.nextInt(); // Guardamos los defectuosos
            System.out.print("Pupitres producidos: "); // Pedimos los pupitres producidos
            operarios[i].producidos = sc.nextInt(); // Guardamos los producidos

            boolean c1 = operarios[i].horasAusencia <= 3; // Condición 1: faltó 3 horas o menos
            boolean c2 = operarios[i].defectuosos < 300; // Condición 2: menos de 300 defectuosos
            boolean c3 = operarios[i].producidos > 10000; // Condición 3: más de 10000 producidos

            if (c1 && c2 && c3) { // Si cumple las tres condiciones
                operarios[i].grado = 20; // Su grado es 20
            } else if (c2 && c3) { // Si cumple la segunda y la tercera
                operarios[i].grado = 15; // Su grado es 15
            } else if (c1 && c3) { // Si cumple la primera y la tercera
                operarios[i].grado = 13; // Su grado es 13
            } else if (c1 && c2) { // Si cumple la primera y la segunda
                operarios[i].grado = 12; // Su grado es 12
            } else if (c3) { // Si solo cumple la tercera
                operarios[i].grado = 9; // Su grado es 9
            } else if (c2) { // Si solo cumple la segunda
                operarios[i].grado = 8; // Su grado es 8
            } else if (c1) { // Si solo cumple la primera
                operarios[i].grado = 7; // Su grado es 7
            } else { // Si no cumple ninguna
                operarios[i].grado = 5; // Su grado es 5
            } // Fin del if-else
        } // Fin del for

        System.out.println(); // Línea en blanco
        System.out.println("Reporte de eficiencia:"); // Título del reporte
        for (int i = 0; i < n; i++) { // Recorremos los operarios
            System.out.println("Codigo: " + operarios[i].codigo // Mostramos el código
                    + " | Ausencia: " + operarios[i].horasAusencia // Mostramos las horas de ausencia
                    + " | Defectuosos: " + operarios[i].defectuosos // Mostramos los defectuosos
                    + " | Producidos: " + operarios[i].producidos // Mostramos los producidos
                    + " | Grado: " + operarios[i].grado); // Mostramos el grado de eficiencia
        } // Fin del for

        sc.close(); // Cerramos el Scanner
    } // Fin del método main
} // Fin de la clase