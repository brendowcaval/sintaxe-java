package edu.brendow.operadores;

public class Operadores {
    public static void main(String[] args) {
        // operadores aritmeticos = + - * /

        // operadores unários
        int numero = 10; // 10 * -1 deixa o valor positivo, e -10 deixa negativo

        System.out.println(-numero);

        // para incrementar = numero++
        // inverter o valor de um boolean = !true

        // operador ternário
        int a, b;
        a = 21;
        b = 20;
        String resultado = a > b ? "o a é maior" : "o b é maior";

        System.out.println(resultado);

        // operadores relacionais : == != > < >= <=
        // operadores logicos : E - && OU - ||
        System.out.println((10 == 10) && (20 == 20));

    }
}
