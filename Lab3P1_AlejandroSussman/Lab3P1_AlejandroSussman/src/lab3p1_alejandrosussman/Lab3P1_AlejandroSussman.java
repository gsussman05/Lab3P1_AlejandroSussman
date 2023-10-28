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
                    System.out.println("Que modo de peleo desea?");
                    System.out.println("1. Hasta La Muerte");
                    System.out.println("2. Por Rondas");

                    int poke_opcion = read.nextInt();

                    if (poke_opcion == 1) {
                        System.out.println("Bienvenido a la Pelea Hasta La Muerte!");
                    } else if (poke_opcion == 2) {
                        System.out.println("Bienvenido a la Pelea por Rondas!");
                    }

                    if (poke_opcion == 1 || poke_opcion == 2) {

                        System.out.println("Estadisticas de los pokemones");
                        System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                        System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                        System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                        System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                        System.out.println();
                        System.out.println("Ingrese la Pelea determinada");
                        System.out.println("1. Sylveon Vs. Dragonite");
                        System.out.println("2. Gyarados Vs. Giratina");
                        System.out.println("3. Dragonite Vs. Giratina");
                        System.out.println("4. Giratina Vs. Sylveon");

                        int pelea = read.nextInt();
                        double pk1_vida, pk1_ataque, pk1_defensa;
                        double pk2_vida, pk2_ataque, pk2_defensa;

                        switch (pelea) {
                            case 1:
                                pk1_vida = 280.0;
                                pk1_ataque = 80.0;
                                pk1_defensa = 15.0;

                                pk2_vida = 250.0;
                                pk2_ataque = 75.0;
                                pk2_defensa = 20.0;
                                break;
                            case 2:
                                pk1_vida = 300.0;
                                pk1_ataque = 50.0;
                                pk1_defensa = 10.0;

                                pk2_vida = 300.0;
                                pk2_ataque = 70.0;
                                pk2_defensa = 25.0;
                                break;
                            case 3:
                                pk1_vida = 250.0;
                                pk1_ataque = 75.0;
                                pk1_defensa = 20.0;

                                pk2_vida = 300.0;
                                pk2_ataque = 70.0;
                                pk2_defensa = 25.0;
                                break;
                            case 4:
                                pk1_vida = 300.0;
                                pk1_ataque = 70.0;
                                pk1_defensa = 25.0;

                                pk2_vida = 280.0;
                                pk2_ataque = 80.0;
                                pk2_defensa = 15.0;
                                break;

                            default:
                                pk1_vida = 0.0;
                                pk1_ataque = 0.0;
                                pk1_defensa = 0.0;

                                pk2_vida = 0.0;
                                pk2_ataque = 0.0;
                                pk2_defensa = 0.0;
                                break;
                        }

                        int ronda = 1;

                        while ((pk1_vida > 0.0 && pk2_vida >= 0.0) && (ronda <= 10 || poke_opcion == 1)) {
                            System.out.println();
                            System.out.println("----------------------- Ronda " + ronda + " -----------------------------");
                            System.out.println("Vida del Pokemon 1: " + pk1_vida);
                            System.out.println("Vida del Pokemon 2: " + pk2_vida);
                            System.out.println();

                            /* Parte de la Pelea en Realidad... */
 /* Ataque de PK1 */
                            double atq1 = pk1_ataque - (pk2_defensa / 100 * pk1_ataque);
                            pk2_vida -= atq1;
                            System.out.println("Pokemon 1 ha atacado!");
                            if (pk2_vida <= 0.0) {
                                System.out.println("Pokemon 2 se ha desmayado!");
                                pk2_vida = 0.0;
                                break;
                            }

                            double atq2 = pk2_ataque - (pk1_defensa / 100 * pk2_ataque);
                            pk1_vida -= atq2;
                            System.out.println("Pokemon 2 ha atacado!");

                            if (pk1_vida <= 0.0) {
                                System.out.println("Pokemon 1 se ha desmayado!");
                                pk1_vida = 0.0;
                                break;
                            }

                            ronda++;
                        }

                        if (pk1_vida == pk2_vida) {
                            System.out.println("¡Hay un empate!");
                        } else if (pk1_vida > pk2_vida) {
                            System.out.println("¡El ganador es el Pokemon 1!");
                        } else {
                            System.out.println("¡El ganador es el Pokemon 2!");
                        }
                    } else {
                        System.out.println("Opción inválida. Adiós.");
                    }
                    break;
                case 3:
                    System.out.println("Bienvenido a Asterisco en Casa");
                    System.out.println("Ingrese un numero impar mayor o igual a 7: ");
                    int n = read.nextInt();

                    if (n >= 7 && n % 2 != 0) {
                        n = n - 1;
                        for (int i = 0; i <= n; i++) {
                            for (int j = 0; j <= n; j++) {
                                if (i == 0 || i == n || j == 0 || j == n) {
                                    System.out.print("* ");
                                } else if (j == n / 2) {
                                    System.out.print("| ");
                                } else if (j == i || j == (n - i)) {
                                    System.out.print("> ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println("");
                        }
                    } else {
                        System.out.println("El numero debe ser impar y ser mayor al 7");
                    }
                    break;
                default:
                    System.out.println("La opcion debe ser 1,2,3");

            }
            System.out.println("Desea ingresar otra opcion en el menu[s/n]?: ");
            resp_m = read.next().charAt(0);

        }
    }

}
