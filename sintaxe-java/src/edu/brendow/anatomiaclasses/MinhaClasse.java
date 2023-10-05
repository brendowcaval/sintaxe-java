package edu.brendow.anatomiaclasses;

public class MinhaClasse {
    public static void main(String[] args) {

        // System.out.print("olá, seja bem vindos a linguagem Java!");

        /*
         * sobre variaveis
         * 
         * // simbolos permitidos para variáveis são _ e $
         * int minhaIdade = 26;
         * String meu_nome = "Brendow";
         * boolean voceEhCasado;
         * boolean voceTemCpf = true;
         * 
         * voceEhCasado = true;
         */

        String nome = "Joao";
        String sobrenome = "Figueiredo";
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);

    }

    // método
    // bons nomes para nomear métodos = somar() abrirConexao() concluirProcesso()
    public static String nomeCompleto(String nome, String sobrenome) {
        return "olá pessoa que se chama : " + nome + " " + sobrenome;
    }
}
