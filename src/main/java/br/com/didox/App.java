package br.com.didox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        /*
         * EXERCÍCIO 01
         * João é um professor de matemática e precisa de um programa que faça o calculo
         * da seguinte expressão:
         * (x * 8 + y) -x +y / 100
         * faça um programa que resolva o probelma da expressão qeu o joão precisa.
         * Lembre-se : pense na usabilidade !!
         */

        System.out.println("==========================================");
        System.out.println("Olá, seja muito bem vindo!");
        System.out.println("==========================================");
        System.out.println("Notei que você quer resolver está operação");
        System.out.println("(x * 8 + y) - x + y / 100 ");
        System.out.println("Para isso preciso que você digite o valor de x e y, então:");
        System.out.println("Digite o Valor de X: ");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Digite o Valor de y: ");
        int y = Integer.parseInt(reader.readLine());
        var operacao = (x * 8 + y) - x + y / 100;

        System.out.println("O resultado do calculo da operação:");
        System.out.println("(" + x + " * 8 + " + y + ") - " + x + " + " + y + " / 100 ");
        System.out.println("Foi " + operacao);

        /*
         * // Mostre()
         * System.out.println("Digite um número");
         * 
         * // Leia()
         * int numero = Integer.parseInt(reader.readLine());
         * 
         * var resultado = numero + 1000;
         * // Mostre()
         * System.out.println("O resultado de (" + numero + ") + 1000 é de : " +
         * resultado);
         */

        /*
         * // Reading daa using readLine
         * String name = reader.readLine();
         * 
         * int numero1 = 3;
         * var numero2 = 5;
         * 
         * int soma = numero1 + numero2;
         * 
         * mostre() #mostra informação na tela
         * System.out.println("O resultado da operação é " + soma);
         */
    }
}
