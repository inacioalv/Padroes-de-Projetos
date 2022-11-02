package br.com.inacio.strategy;

public class Robo {

    private  Comportaneto  comportaneto;

    public void setComportaneto(Comportaneto comportaneto) {
        this.comportaneto = comportaneto;
    }

    public void  mover(){
        comportaneto.mover();
    }
}
