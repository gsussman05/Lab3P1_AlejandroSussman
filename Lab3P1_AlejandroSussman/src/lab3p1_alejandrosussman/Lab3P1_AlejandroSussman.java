/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_alejandrosussman;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Lab3P1_AlejandroSussman {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        char resp_m = 's';
        while (resp_m == 's' || resp_m == 'S') {
            System.out.println("1. Sucesiones y mas sucesiones");
            System.out.println("2. Pocket Monsters");
            System.out.println("3. Asterisco en Casa");
            System.out.println("Ingrese una opcion del menu: ");
            int opcion_prin = read.nextInt();
            switch (opcion_prin) {
                case 1:
                    System.out.println("Bienvenido a Sucesiones y Mas Sucesiones");
                    System.out.println("Ingrese la diferencia que desea: ");
                    int dif = read.nextInt();
                    System.out.println("Ingrese la inicial deseada: ");
                    int inicial = read.nextInt();
                    System.out.println("Ingrese la cantidad de numeros que desea: ");
                    int cant1 = read.nextInt();
                    System.out.println("Diferencia: " + dif);
                    System.out.println("Inicial: " + inicial);
                    System.out.println("Cantidad: " + cant1);
                    System.out.print(inicial);
                    int dif1;
                    int inicial1;
                    dif1 = dif;
                    inicial1 = inicial;
                    for (int cont1 = 1; cont1 < cant1; cont1++) {
                        System.out.print(",");
                        inicial += dif;
                        dif++;
                        System.out.print(inicial);
                    }
                    System.out.println("");
                    System.out.println("Que numero desea ver mas adelante en la sucesion?: ");
                    int num_sig = read.nextInt();
                    for (int cont1 = 1; cont1 < num_sig; cont1++) {
                        inicial1 += dif1;
                        dif1++;

                    }
                    System.out.println("El numero seria: " + inicial1);
                    break;
                case 2:
                    System.out.println("Bienvenido a Pocket Monsters");
                    break;
                case 3:
                    System.out.println("Bienvenido a Asterisco en Casa");
                    System.out.println("Ingrese un numero impar del 7-11: ");
                    int n = read.nextInt();
                    int ind = 2;
                    int j = 1;
                    int dep = n - j;
                    if (n >= 7 && n % 2 != 0) {
                        for (int i = 0; i < n; i++) {
                            for (j = 1; j <= n; j++) {
                                if (i == 1 || i == 0) {
                                    System.out.print("* ");
                                } else if (j == (n - 2) / 2 + 2) {
                                    System.out.print("|");
                                } else if (j == 1 || j == n) {
                                    System.out.print("*");
                                } else if ((ind != (n - 2) / 2 + 2) && j == i || i == j) {
                                    System.out.print("<");
                                } else if (ind != (n - 2) / 2 + 2 && i == dep) {
                                    System.out.println(" ");
                                } else {
                                    System.out.println("  ");
                                }
                                

                            }

                        }
                    }
            }

        }
    }

}
