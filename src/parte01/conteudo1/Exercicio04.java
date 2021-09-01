package parte01.conteudo1;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero de eleitores:");
        int totalDeEleitores = scanner.nextInt();

        System.out.println("Digite o numero total de votos validos:");
        int totalVotosValidos = scanner.nextInt();

        System.out.println("Digite o numero de votos Brancos:");
        int totalVotosBrancos = scanner.nextInt();

        System.out.println("Digite o numero total de votos nulos:");
        int totalVotosNulos = scanner.nextInt();

        System.out.println("A porcentagem de votos validos é:" + totalVotosValidos * 100.00 / totalDeEleitores);

        System.out.println("A porcentagem de votos brancos é:" + totalVotosBrancos * 100.00 / totalDeEleitores);

        System.out.println("A porcentagem de votos nulos é:" + totalVotosNulos * 100.00 / totalDeEleitores);

        scanner.close();
    }
}
