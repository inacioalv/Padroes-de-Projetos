package br.com.inacio.singleton;

public class SingletonLazy {

    private static
    SingletonLazy instancia;

    //Garantir que não possa ter acesso colocando o construtor com private
    private SingletonLazy() {
        super();
    }

    //instancia com verificação
    public static SingletonLazy  getInstacia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return  instancia;
    }
}
