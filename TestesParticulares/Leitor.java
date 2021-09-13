package TestesParticulares;

import java.util.Scanner;

public class Leitor {

    /** -----------------------------------------------------
     * ATRIBUTOS */

    private final Scanner scanner = new Scanner(System.in);
    private final String msgErroString = "Digite algo";
    private final String msgErroCaractere = "Digite exatamente um caractere";
    private final String msgErroInteiro = "Digite um número inteiro";
    private final String msgErroInteiroPositivoSemZero = "Digite um número inteiro positivo, excluindo zero";
    private final String msgErroInteiroPositivoComZero = "Digite um número inteiro positivo, incluindo zero";
    private final String msgErroDouble = "Digite um número";
    private final String msgErroDoublePositivoSemZero = "Digite um número positivo, excluindo zero";
    private final String msgErroDoublePositivoComZero = "Digite um número positivo, incluindo zero";
    private final String msgErroArrayInteiros = "Digite apenas a quantidade pedida de dígitos numéricos; sem espaços, traços ou letras";
    private final String msgErroArrayCaracteres = "Digite apenas a quantidade pedida de letras";


    /**-----------------------------------------------------
     * MÉTODOS PRIVADOS */

    /** Tenta ler uma string, retorna null caso falhe */
    private String tryLerString(){
        Impressora.inputFlag();
        try{
            return scanner.nextLine();
        }catch(Exception e){
            return null;
        }
    }

    /** Tenta ler um inteiro, retorna null caso falhe */
    private Integer tryLerInteiro(){
        Impressora.inputFlag();
        try{
            return scanner.nextInt();
        }catch(Exception e){
            return null;
        }
    }

    /** Tenta ler um double, retorna null caso falhe */
    private Double tryLerDouble(){
        Impressora.inputFlag();
        try{
            return scanner.nextDouble();
        }catch(Exception e){
            return null;
        }
    }

    /** Verifica se uma dada string é composta apenas de dígitos numéricos */
    private boolean checarDigitos(String texto){
        for(char l : texto.toCharArray()){
            try{
                Integer.parseInt(l + "");
            }catch(Exception e){
                return false;
            }
        }
        return true;
    }


    /**-----------------------------------------------------
     * MÉTODOS PÚBLICOS */

    /** Lê uma string */
    public String lerString(){
        String leitura = tryLerString();
        while(leitura == null || leitura.isBlank() || leitura.isEmpty()){
            Impressora.msgAtencao(msgErroString);
            leitura = tryLerString();
        }
        return leitura;
    }

    /** Lê um caractere */
    public char lerCaractere(){
        String leituraString = lerString();
        while(leituraString.length() != 1){
            Impressora.msgAtencao(msgErroCaractere);
            leituraString = lerString();
        }
        return leituraString.charAt(0);
    }

    /** Lê um valor inteiro */
    public int lerInteiro(){
        Integer leitura = tryLerInteiro();
        while(leitura == null){
            Impressora.msgAtencao(msgErroInteiro);
            leitura = tryLerInteiro();
        }
        return leitura;
    }

    /** Lê um valor inteiro positivo, incluindo zero ou não */
    public int lerInteiroPositivo(boolean seZeroIncluso){
        int leitura = lerInteiro();
        if(seZeroIncluso){
            while(leitura < 0){
                Impressora.msgAtencao(msgErroInteiroPositivoComZero);
                leitura = lerInteiro();
            }
        }else{
            while(leitura <= 0){
                Impressora.msgAtencao(msgErroInteiroPositivoSemZero);
                leitura = lerInteiro();
            }
        }
        return leitura;
    }

    /** Lê um valor numérico */
    public double lerDouble(){
        Double leitura = tryLerDouble();
        while(leitura == null){
            Impressora.msgAtencao(msgErroDouble);
            leitura = tryLerDouble();
        }
        return leitura;
    }

    /** Lê um valor numérico positivo, incluindo zero ou não */
    public double lerDoublePositivo(boolean seZeroIncluso){
        double leitura = lerDouble();
        if(seZeroIncluso){
            while(leitura < 0){
                Impressora.msgAtencao(msgErroDoublePositivoComZero);
                leitura = lerDouble();
            }
        }else{
            while(leitura <= 0){
                Impressora.msgAtencao(msgErroDoublePositivoSemZero);
                leitura = lerDouble();
            }
        }
        return leitura;
    }

    /** Lê um array de inteiros de um tamanho específico */
    public int[] lerArrayDeInteiros(int tamanhoArray){
        String leituraString = lerString();
        while(!checarDigitos(leituraString) || leituraString.length() != tamanhoArray){
            Impressora.msgAtencao(msgErroArrayInteiros);
            leituraString = lerString();
        }
        int[] leitura = new int[tamanhoArray];
        for(int i=0; i<tamanhoArray; i++){
            leitura[i] = Integer.parseInt(leituraString.charAt(i) + "");
        }
        return leitura;
    }

    /** Lê um array de caracteres de um tamanho específico */
    public char[] lerArrayDeCaracteres(int tamanhoArray){
        String leituraString = lerString();
        while(leituraString.length() != tamanhoArray){
            Impressora.msgAtencao(msgErroArrayCaracteres);
            leituraString = lerString();
        }
        char[] leitura = new char[tamanhoArray];
        for(int i=0; i<tamanhoArray; i++){
            leitura[i] = leituraString.charAt(i);
        }
        return leitura;
    }

    /** Fecha o scanner */
    public void fechar(){
        scanner.close();
        try {
            this.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
