package br.com.sistemakarina;

import br.com.sistemakarina.model.Calculadora;
import br.com.sistemakarina.model.Emprestimo;
import br.com.sistemakarina.model.Mensagem;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("------Exercicio Calculadora------");
        Calculadora.soma(3.0, 5.0);
        Calculadora.subtracao(20, 10);
        Calculadora.multiplicacao(2,7);
        Calculadora.divisao(30,2);


        // Mensagem
        System.out.println("Exercio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,  5);

    }
}
