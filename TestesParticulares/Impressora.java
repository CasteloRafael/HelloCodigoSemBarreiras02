package TestesParticulares;

public class Impressora {

    /** -----------------------------------------------------
     * CONSTRUTOR DE CLASSE ESTÁTICA */

    private Impressora(){}


    /**-----------------------------------------------------
     * MÉTODOS PÚBLICOS */

    /** O que aparece para que o usuário entenda que deve digitar algo */
    public static void inputFlag(){
        System.out.print("> ");
    }

    /** Imprime uma longa linha na tela */
    public static void linhaSeparadora(){
        System.out.println("-------------------------------------------------------------");
    }

    /** Imprime um título */
    public static void titulo(String texto){
        linhaSeparadora();
        System.out.println("  ***  " + texto + "  ***  ");
        linhaSeparadora();
    }

    /** Imprime uma mensagem qualquer */
    public static void msgBasica(String texto){
        System.out.println(texto);
    }

    /** Imprime uma mensagem de aviso ou atenção */
    public static void msgAtencao(String texto){
        System.out.println("* " + texto + "!");
    }

    /** Imprime uma mensagem de erro */
    public static void msgErro(String texto){
        System.out.println("ERRO: " + texto);
    }
}
