package parte01.conteudo2;

import java.util.Scanner;

public class Exercico01 {

    //digite um numero e diga se ele é par ou impar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("é um nomero par");
        } else {
            System.out.println("é um numero ímpar");
        }


        scanner.close();
    }
}
