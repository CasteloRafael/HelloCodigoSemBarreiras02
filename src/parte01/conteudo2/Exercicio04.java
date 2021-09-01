package parte01.conteudo2;

import java.util.Scanner;

public class Exercicio04 {

    /*Construa um algoritmo que leia 03 valores inteiros e positivos e:
    Encontre o maior valor,
    Encontre o menor valor
    Calcule a média dos números lidos
    * */



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int maiorNumero = Integer.MAX_VALUE;
        int menorNumero = Integer.MIN_VALUE;

        double mediaNumeros = 0;

        int numeroBase = 0;



        System.out.println("digite o primeiro numero:");
        numeroBase = scanner.nextInt();

        if (numeroBase > maiorNumero) {
            maiorNumero = numeroBase;
        }

        if (numeroBase < menorNumero) {
            menorNumero = numeroBase;
        }

        mediaNumeros = mediaNumeros + numeroBase;

        System.out.println("digite o segundo numero:");
        numeroBase = scanner.nextInt();

        if (numeroBase > maiorNumero) {
            maiorNumero = numeroBase;
        }

        if (numeroBase < menorNumero) {
            menorNumero = numeroBase;
        }

        mediaNumeros = mediaNumeros + numeroBase;

        System.out.println("digite o terceiro numero:");
        numeroBase = scanner.nextInt();

        if (numeroBase > maiorNumero) {
            maiorNumero = numeroBase;
        }

        if (numeroBase < menorNumero) {
            menorNumero = numeroBase;
        }

        mediaNumeros = mediaNumeros + numeroBase;

        System.out.println("o maior valor é:" + (maiorNumero));

        System.out.println("o menor valor é:" + (menorNumero));

        System.out.println("a media dos numeros é:" + (mediaNumeros / 3));





        scanner.close();

    }
}
