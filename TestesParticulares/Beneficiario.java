package TestesParticulares;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import static TestesParticulares.Impressora.*;

public class Beneficiario {

           public static void main(String[] args) {

               Scanner l = new Scanner(System.in);

               titulo("BEM VINDO AO CADASTRO DE USUÁRIOS");

               msgBasica("Digite os dados: "+"\nNome ");
               String nome = l.nextLine();

               msgBasica("Login desejado ");
               String login = l.nextLine();

               msgBasica("Senha de acesso");
               int senha = l.nextInt();

               linhaSeparadora();
               msgBasica("\nLista de pessoas cadastradas\n");

               Dados usuario;

               usuario = new Dados();

               usuario.setNome(nome);
               usuario.setLogin(login);


               ArrayList<Dados> usuarios = new ArrayList<Dados>();

               usuarios.add(usuario);

               System.out.println(usuario.getNome()+"\n"+usuario.getLogin()+"\n");
           }


}

