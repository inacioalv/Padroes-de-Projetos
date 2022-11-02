package br.com.inacio.strategy;

public class ComportamentoAgressivo implements Comportaneto{
    @Override
    public void mover() {

        System.out.println("Movendo-se agressivamente...");
    }
}
