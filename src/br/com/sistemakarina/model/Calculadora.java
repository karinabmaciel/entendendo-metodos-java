package br.com.sistemakarina.model;

/**
 * Exercícios da aula Métodos, criar uma aplicação que resolva as seguintes situações:
 * calcular as 4 oprações básicas: soma, subtração, multiplicação e divisão.
 * apartir da hora do dia, informar a mensagem adequada: Bom Dia, Boa Tarde e Boa Noite.
 * Calcular o valor final de um impréstimo, a partir do valor solicitado.Taxas e parcelas influenciam.
 * *Defina arbritrariamente as faixas que influenciam os valores.
 */

public class Calculadora {

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;

        System.out.println("a soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;

        System.out.println("a subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;

        System.out.println("a multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;

        System.out.println("a divisao de " + numero1 + " por " + numero2 + " é " + resultado);
    }


}
