package parte01.conteudo2;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        //Escreva um algoritmo em Java que seja capaz de fazer
        // as seguintes operações matemáticas (adição, subtração,
        // multiplicação e divisão). Todas as operações serão entre
        // dois valores. No começo do algoritmo pergunte ao usuário qual
        // operação ele deseja fazer e quais são os valores.

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double v1;
        double v2;


        System.out.println("Escreva o primeiro numero:");
        v1 = scanner.nextDouble();

        System.out.println("Escreva o segundo numero:");
        v2 = scanner.nextDouble();

        System.out.println("1 - soma, 2 - subtracao, 3 - multiplição, 4 - divisão");
        System.out.println("digite a opção da operação que deseja efetuar:");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O resultado da soma é:" + (v1 + v2));
                break;
            case 2:
                System.out.println("O resultado da subtração é:" + (v1 - v2));
                break;
            case 3:
                System.out.println("O resultado da multiplicação é:" + (v1 * v2));
                break;
            case 4:
                System.out.println("O resultado da divisão é:" + (v1 / v2));
                break;
            default:
                System.out.println("opção invalida");
                break;

        }

        scanner.close();
    }
}
