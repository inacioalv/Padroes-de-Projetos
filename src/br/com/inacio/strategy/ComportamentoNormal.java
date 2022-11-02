package br.com.inacio.strategy;

public class ComportamentoNormal implements Comportaneto{
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
