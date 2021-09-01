package parte01.conteudo2;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        /* Elabore um algoritmo que dada a idade de um nadador
        classifique-o em uma das seguintes categorias:
        Infantil A = 5 a 7 anos
        Infantil B = 8 a 11 anos
        Juvenil A = 12 a 13 anos
        Juvenil B = 14 a 17 anos
        Adultos = Maiores de 18 anos
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do nadador para saber sua categoria:");
        int idade = scanner.nextInt();

        if (idade >=5 && idade <=7) {
            System.out.println("Infantil A");
        } else if (idade >=8 && idade<=11) {
            System.out.println("Infantil B");
        } else if (idade >=12 && idade <=13) {
            System.out.println("Juvenil A");
        } else if (idade >=14 && idade <=17) {
            System.out.println("Juvenil B");
        } else if (idade >=18) {
            System.out.println("Adultos");
        } else {
            System.out.println("Essa idade é menor que a idade minima de 5 anos.");
        }

        //estudar materia testes unitarios.



        scanner.close();

        }
}
