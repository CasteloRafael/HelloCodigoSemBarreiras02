package parte01.conteudo2;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        /* Escreva um algoritmo em Java que leia
        dois números inteiros e determine qual é o menor.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o primeiro numero:");
        int a = scanner.nextInt();

        System.out.println("Escreva o segundo numero:");
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("o menor numero é:" + a);
        } else if (b < a) {
            System.out.println("o menor numero é:" + b);
        } else {
            System.out.println("os numeros são iguais");
        }

        if (a > b) {
            System.out.println("o maior numero é:" + a);
        } else if (b > a) {
            System.out.println("o maior numero é:" + b);
        } else {
            System.out.println("os numeros são iguais");
        }

        scanner.close();
    }
}
