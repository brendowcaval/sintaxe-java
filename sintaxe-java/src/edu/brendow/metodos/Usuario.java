package edu.brendow.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

        smartTv.ligar();
        smartTv.mudarCanal(11);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

    }
}