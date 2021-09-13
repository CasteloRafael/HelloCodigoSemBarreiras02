package TestesParticulares;


import java.util.ArrayList;

import static TestesParticulares.Impressora.*;

public class Administrador {

    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        boolean acertou = false;
        int tentativas = 3;
        int senha = 123456;
        int chute = 0;
        int operação = 0;
        double saldoAlimentacao = 1000;
        double saldoRefeicao = 1000;
        double saldoCombustivel = 1000;
        double valorRemovido = 0;
        double valorAdcionado = 0;

        titulo("Bem vindo ao gerenciamento administrativo");
        while (tentativas > 0 && acertou == false) {
            msgBasica("Digite a senha:");
            chute = leitor.lerInteiro();

            if (senha == chute) {
                msgAtencao("Senha correta");
                acertou = true;

                linhaSeparadora();
                titulo("Menu de Administrador");
                msgBasica("1 - Acrescetar Saldo");
                msgBasica("2 - Retirar Saldo");
                msgBasica("3 - Mostrar lista de usuariarios cadastrados");
                msgBasica("4 - Retornar ao menu de Usuario");
                operação = leitor.lerInteiro();


                if (operação == 1){
                    msgBasica("Digite os valores que deseja adicionar ao saldo dos cartões:\n");

                    msgBasica("Digite o saldo a acrescentar do vale alimentação:");
                    valorAdcionado = leitor.lerDouble();
                    saldoAlimentacao += valorAdcionado;

                    msgBasica("Digite o saldo a acrescentar do vale combustivel:");
                    valorAdcionado = leitor.lerDouble();
                    saldoCombustivel += valorAdcionado;

                    msgBasica("Digite o saldo a acrescentar do vale refeição:");
                    valorAdcionado = leitor.lerDouble();
                    saldoRefeicao += valorAdcionado;

                    msgBasica("\n Saldo adicionado com sucesso");

                    linhaSeparadora();
                    msgBasica("Saldo atual:");
                    msgBasica("alimentação " + saldoAlimentacao);
                    msgBasica("combustivel " + saldoCombustivel);
                    msgBasica("refeição " + saldoRefeicao);


                } if (operação == 2){
                    msgBasica("Digite os valores que deseja remover do saldo dos cartões:\n");

                    msgBasica("Digite o saldo a remover do vale alimentação:");
                    valorRemovido = leitor.lerDouble();
                    saldoAlimentacao -= valorRemovido;

                    msgBasica("Digite o saldo a remover do vale combustivel:");
                    valorRemovido = leitor.lerDouble();
                    saldoCombustivel -= valorRemovido;

                    msgBasica("Digite o saldo a remover do vale refeição:");
                    valorRemovido = leitor.lerDouble();
                    saldoRefeicao -= valorRemovido;

                    msgBasica("\n Saldo removido com sucesso");

                    linhaSeparadora();
                    msgBasica("saldo atual:");
                    msgBasica("alimentação " + saldoAlimentacao);
                    msgBasica("combustivel " + saldoCombustivel);
                    msgBasica("refeição " + saldoRefeicao);

                } if(operação == 3){

                } if(operação == 4){
                    //retornar a classe usuario

                }

            } else {
                --tentativas;
                msgAtencao("Senha incorreta!\n" + tentativas + " tenativas restantes");
            }
            if (tentativas == 0) {
                msgAtencao("\nTentativas esgotadas");
                //retornar a classe usuario

            }

        }

        leitor.fechar();
    }
}
