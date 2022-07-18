package br.com.sistemakarina.model;

/** cria uma aplicação que calcule a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
 *
 */

public class Quadrilatero {
    public static void area(double lado) {

        System.out.println("Area do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("area do retngulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Area do trápezio: " + ((baseMaior + baseMenor)*altura) / 2);

    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Area do losango: " + (diagonal1 * diagonal2)/2);
    }
}
