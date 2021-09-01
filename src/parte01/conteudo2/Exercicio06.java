package parte01.conteudo2;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        //Faça a implementação do Jogo Pedra, Papel
        // e Tesoura (Jokempô). O algoritmo deverá
        // perguntar qual é a escolha do jogador 1
        // (Pedra [pe], Papel [pa], Tesoura [t]) e
        // deverá fazer o mesmo para o jogador 2.
        // No final da execução o algoritmo deverá
        // dizer qual é o jogador vencedor ou se houve empate.

        Scanner scanner = new Scanner(System.in);


        int opcao = 0;

        System.out.println("Jogador 1 - escolha entre: 1 Pedra, 2 Papel, 3 Tesoura");
        int jogador1 = scanner.nextInt();

        System.out.println("Jogador 2 - escolha entre: 1 Pedra, 2 Papel, 3 Tesoura");
        int jogador2 = scanner.nextInt();

        if (jogador1 == jogador2) {
            System.out.println("empate");
        } else if (jogador1 == 1 && jogador2 == 3 || jogador1 == 2 && jogador2 == 1 || jogador1 == 3 && jogador2 == 2) {
            System.out.println("Jogador 1 ganhou");
        } else {
            System.out.println("Jogador 2 ganhou");
        }


    scanner.close();

    }
}
