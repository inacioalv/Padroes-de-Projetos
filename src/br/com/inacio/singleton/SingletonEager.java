package br.com.inacio.singleton;

public class SingletonEager {

    private static
    SingletonEager instancia = new SingletonEager();

    //Garantir que não possa ter acesso colocando o construtor com private
    private SingletonEager() {
        super();
    }

    //instancia diretamente
    public static SingletonEager getInstacia(){
               return  instancia;
    }
}
