package com.mycompany.tareasemana2;

import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Ingrese M (filas): ");
        int m = sc.nextInt();
        System.out.print("Ingrese N (columnas): ");
        int n = sc.nextInt();

        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rnd.nextInt(9) + 1;
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        int opcion;
        do {
            System.out.println();
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Trasponer");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1 || opcion == 2) {
                int[][] b = new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        b[i][j] = rnd.nextInt(9) + 1;
                    }
                }

                System.out.println("Matriz B:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(b[i][j] + "\t");
                    }
                    System.out.println();
                }

                int[][] r = new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (opcion == 1) {
                            r[i][j] = a[i][j] + b[i][j];
                        } else {
                            r[i][j] = a[i][j] - b[i][j];
                        }
                    }
                }

                if (opcion == 1) {
                    System.out.println("A + B:");
                } else {
                    System.out.println("A - B:");
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(r[i][j] + "\t");
                    }
                    System.out.println();
                }

            } else if (opcion == 3) {
                System.out.print("Columnas de la matriz B (filas de B = " + n + "): ");
                int p = sc.nextInt();

                int[][] b = new int[n][p];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < p; j++) {
                        b[i][j] = rnd.nextInt(9) + 1;
                    }
                }

                System.out.println("Matriz B:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < p; j++) {
                        System.out.print(b[i][j] + "\t");
                    }
                    System.out.println();
                }

                int[][] r = new int[m][p];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < p; j++) {
                        for (int k = 0; k < n; k++) {
                            r[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }

                System.out.println("A x B:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < p; j++) {
                        System.out.print(r[i][j] + "\t");
                    }
                    System.out.println();
                }

            } else if (opcion == 4) {
                int[][] t = new int[n][m];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        t[j][i] = a[i][j];
                    }
                }

                System.out.println("Traspuesta de A:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(t[i][j] + "\t");
                    }
                    System.out.println();
                }

            } else if (opcion == 5) {
                System.out.println("Fin del programa");
            } else {
                System.out.println("Opcion invalida");
            }

        } while (opcion != 5);

        sc.close();
    }
}