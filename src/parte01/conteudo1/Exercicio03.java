package parte01.conteudo1;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        double area = scanner.nextDouble();

        System.out.println("A base do retangulo é:");
        double b = scanner.nextDouble();

        System.out.println("A altura do retangulo é:");
        double h = scanner.nextDouble();


        System.out.println("A area do retangulo é:");
        System.out.println(b * h);



        //area - A
        //base - b
        //altura - h
        // A = b * h

        scanner.close();
    }
}

